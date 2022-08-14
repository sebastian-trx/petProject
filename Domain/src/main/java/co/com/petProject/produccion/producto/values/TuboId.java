package co.com.petProject.produccion.producto.values;

import co.com.sofka.domain.generic.Identity;

public class TuboId extends Identity {

    public TuboId(String id) {
        super(id);
    }

    public TuboId() {
    }

    public static TuboId of(String id) { return new TuboId(id);}
}
