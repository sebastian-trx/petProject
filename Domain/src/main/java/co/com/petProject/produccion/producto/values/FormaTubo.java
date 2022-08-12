package co.com.petProject.produccion.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FormaTubo implements ValueObject<Boolean> {
    private final Boolean value;

    public FormaTubo(Boolean value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return null;
    }
}
