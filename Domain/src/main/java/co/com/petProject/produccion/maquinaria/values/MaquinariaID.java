package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.Identity;

public class MaquinariaID extends Identity {

    public MaquinariaID(){/*Utility CLass*/}

    private MaquinariaID(String identity){
        super(identity);
    }

    public static MaquinariaID of(String identity){
        return new MaquinariaID(identity);
    }

}
