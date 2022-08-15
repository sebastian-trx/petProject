package co.com.petProject.produccion.maquinaria.events;

import co.com.petProject.produccion.maquinaria.values.MaquinariaID;
import co.com.sofka.domain.generic.DomainEvent;

public class MaquinaCreada extends DomainEvent {

    private final MaquinariaID maquinariaID;

    public MaquinaCreada(MaquinariaID maquinariaID){
        super("co.com.petProject.produccion.MaquinaCreada");
        this.maquinariaID = maquinariaID;
    }

    public MaquinariaID getMaquinariaID() {
        return maquinariaID;
    }

}
