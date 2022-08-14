package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoRodamiento implements ValueObject<String> {

    private String value;

    public TipoRodamiento() {/*Utility Class*/}

    public TipoRodamiento(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return null;
    }

}
