package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.ValueObject;

public class NumeroRodillo implements ValueObject<Integer>{

    private Integer value;

    public NumeroRodillo(){/*Utility Class*/}

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value(){
        return this.value;
    }

}
