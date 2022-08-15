package co.com.petProject.produccion.maquinaria;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.petProject.produccion.maquinaria.values.MaquinariaID;

public class Maquinaria extends AggregateEvent<MaquinariaID>{

    public Maquinaria(MaquinariaID entityId) {
        super(entityId);
    }

    // Comportamientos

    public void FabricarPerfil(){

    }

    public void FabricarTubo(){

    }

}
