package co.com.petProject.produccion.producto.entities;

import co.com.petProject.produccion.producto.values.Dimension;
import co.com.petProject.produccion.producto.values.PerfilId;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Perfil extends Entity<PerfilId> {

    TipoDeAcero tipoDeAcero;
    Dimension dimension;

    public Perfil(PerfilId entityId, TipoDeAcero tipoDeAcero, Dimension dimension) {

        super(entityId);
        this.tipoDeAcero = tipoDeAcero;
        this.dimension = dimension;
    }

    public void actualizarTipoDeAceroDelPerfil(TipoDeAcero tipoDeAcero) {
        this.tipoDeAcero = Objects.requireNonNull(tipoDeAcero);
    }
}
