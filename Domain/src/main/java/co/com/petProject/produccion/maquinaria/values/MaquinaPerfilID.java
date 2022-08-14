package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.Identity;

public class MaquinaPerfilID extends Identity {

    public MaquinaPerfilID(){/*Utility class*/}

    public MaquinaPerfilID(String identity){
        super(identity);
    }

    public MaquinaPerfilID of(String identity){
        return new MaquinaPerfilID(identity);
    }

}
