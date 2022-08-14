package co.com.petProject.produccion.producto.commands;

import co.com.petProject.produccion.producto.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public class CrearProducto extends Command {
    private final ProductoId productoId;

    public CrearProducto(ProductoId productoId){
        this.productoId = productoId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
