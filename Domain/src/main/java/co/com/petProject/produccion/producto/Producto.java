package co.com.petProject.produccion.producto;

import co.com.petProject.produccion.producto.entities.Perfil;
import co.com.petProject.produccion.producto.entities.Tubo;
import co.com.petProject.produccion.producto.events.*;
import co.com.petProject.produccion.producto.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Producto extends AggregateEvent<ProductoId> {
    protected Set<Tubo> tubos;
    protected Set<Perfil> perfiles;

    public Producto(ProductoId productoId) {
        super(productoId);
        appendChange(new ProductoCreado(productoId)).apply();
        subscribe(new ProductoEventChange(this));
    }

    public static Producto from(ProductoId productoId, List<DomainEvent> events){
        var producto = new Producto(productoId);
        events.forEach(producto::applyEvent);
        return producto;
    }

    //comportamientos
    public void agregarTubo(TuboId tuboId, FormaTubo formaTubo, Tipo tipo, TipoDeAcero tipoDeAcero, Dimension dimension){
        Objects.requireNonNull(tuboId);
        Objects.requireNonNull(formaTubo);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(tipoDeAcero);
        Objects.requireNonNull(dimension);
        appendChange(new TuboCreado(tuboId, formaTubo, tipo, tipoDeAcero, dimension)).apply();
    }

    public void agregarPerfil(PerfilId perfilId, TipoDeAcero tipoDeAcero, Dimension dimension){
        Objects.requireNonNull(perfilId);
        Objects.requireNonNull(tipoDeAcero);
        Objects.requireNonNull(dimension);
        appendChange(new PerfilCreado(perfilId, tipoDeAcero,dimension)).apply();
    }

    public void actualizarFormaTubo(TuboId tuboId,FormaTubo formaTubo){
        Objects.requireNonNull(tuboId);
        Objects.requireNonNull(formaTubo);
        appendChange(new FormaTuboActualizada(tuboId, formaTubo)).apply();
    }

    public void actualizarTipoDeAceroDelPerfil(PerfilId perfilId, TipoDeAcero tipoDeAcero){
        Objects.requireNonNull(perfilId);
        Objects.requireNonNull(tipoDeAcero);
        appendChange(new TipoDeAceroDelPerfilActualizado(perfilId, tipoDeAcero)).apply();
    }

    protected Optional<Tubo> getTuboById(TuboId tuboId){
        return tubos
                .stream()
                .filter(tubo -> tubo.identity().equals(tuboId))
                .findFirst();
    }

    protected  Optional<Perfil> getPerfilById(PerfilId perfilId){
        return perfiles
                .stream()
                .filter(perfil -> perfil.identity().equals(perfilId))
                .findFirst();
    }

}
