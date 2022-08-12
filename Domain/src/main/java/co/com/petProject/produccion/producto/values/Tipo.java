package co.com.petProject.produccion.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<Boolean> {
    private final Boolean value;

    public Tipo(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return null;
    }
}
