package co.com.petProject.produccion.producto;

import co.com.petProject.produccion.producto.values.ProductoId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Producto extends AggregateEvent<ProductoId> {

    public Producto(ProductoId entityId) {
        super(entityId);
    }
}
