package co.com.petProject.produccion.producto;

import co.com.petProject.produccion.producto.events.TuboCreado;
import co.com.petProject.produccion.producto.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Producto extends AggregateEvent<ProductoId> {

    public Producto(ProductoId entityId) {
        super(entityId);
    }

    //comportamiento
    public void agregarTubo(TuboId tuboId, FormaTubo formaTubo, Tipo tipo, TipoDeAcero tipoDeAcero, Dimension dimension){
        Objects.requireNonNull(tuboId);
        Objects.requireNonNull(formaTubo);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(tipoDeAcero);
        Objects.requireNonNull(dimension);
        appendChange(new TuboCreado(tuboId, formaTubo, tipo, tipoDeAcero, dimension)).apply();
    }
}
