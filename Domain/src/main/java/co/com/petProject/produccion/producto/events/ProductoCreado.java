package co.com.petProject.produccion.producto.events;

import co.com.petProject.produccion.producto.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoCreado extends DomainEvent {
    public ProductoCreado(ProductoId productoId){
        super("co.com.petProject.produccion.ProductoCreado");
    }
}
