package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class NumeroRodillo implements ValueObject<Integer>{

    private final Integer tamañoRodillo;

    public NumeroRodillo(Integer tamañoRodillo){
        this.tamañoRodillo = Objects.requireNonNull(tamañoRodillo);
    }

    public static NumeroRodillo of(Integer tamañoRodillo){
        return new NumeroRodillo(tamañoRodillo);
    }

    @Override
    public Integer value(){
        return this.tamañoRodillo;
    }

}
