package co.com.petProject.produccion.producto.values;

import co.com.sofka.domain.generic.Identity;

public class ProductoId extends Identity {
    public ProductoId(String valor) {
        super(valor);
    }

    public ProductoId() {
    }

    public static ProductoId of(String valor){
        return new ProductoId(valor);
    }
}
