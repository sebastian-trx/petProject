package co.com.petProject.produccion.producto;

import co.com.petProject.produccion.producto.entities.Perfil;
import co.com.petProject.produccion.producto.entities.Tubo;
import co.com.petProject.produccion.producto.events.*;
import co.com.sofka.domain.generic.EventChange;

public class ProductoEventChange extends EventChange {
    public ProductoEventChange(Producto producto) {

        apply((ProductoCreado event ) -> {});

        apply((TuboCreado event) -> {
            var tubo = new Tubo(event.getTuboId(), event.getTipo(), event.getFormaTubo(), event.getTipoDeAcero(), event.getDimension());
        });

        apply((PerfilCreado event) -> {
            var perfil = new Perfil(event.getPerfilId(), event.getTipoDeAcero(), event.getDimension());
        });

        apply((FormaTuboActualizada event) -> {
            var tubo = producto.getTuboById(event.getTuboId())
                    .orElseThrow(() -> new IllegalArgumentException("tubo no encontrado"));
            tubo.actualizarFormaTubo(event.getFormaTubo());
        });

        apply((TipoDeAceroDelPerfilActualizado event) -> {
            var perfil = producto.getPerfilById(event.getPerfilIdId())
                    .orElseThrow(()-> new IllegalArgumentException("perfil no encontrado"));
            perfil.actualizarTipoDeAceroDelPerfil(event.getTipoDeAcero());
        });
    }
}
