package co.com.petProject.produccion.planta.values;

import co.com.sofka.domain.generic.Identity;

public class SupervisorID extends Identity {
    public SupervisorID(String valor) {
        super(valor);
    }

    public SupervisorID() {
    }

    public static SupervisorID of(String valor){
        return new SupervisorID(valor);
    }
}
