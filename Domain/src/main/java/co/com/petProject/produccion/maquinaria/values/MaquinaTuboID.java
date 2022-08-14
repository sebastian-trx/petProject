package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.Identity;

public class MaquinaTuboID extends Identity {

    public MaquinaTuboID(){/*Utility class*/}

    public MaquinaTuboID(String identity){
        super(identity);
    }

    public MaquinaTuboID of(String identity){
        return new MaquinaTuboID(identity);
    }

}
