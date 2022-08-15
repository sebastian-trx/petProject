package co.com.petProject.produccion.planta.values;

import co.com.sofka.domain.generic.Identity;

public class OperarioID extends Identity {
    public OperarioID(String valor) {
        super(valor);
    }

    public OperarioID() {
    }

    public static OperarioID of(String valor) { return new OperarioID(valor);}

}
