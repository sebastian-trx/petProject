package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoAcero implements ValueObject<TipoAcero.Tipo> {

    private final TipoAcero.Tipo tipo;

    public TipoAcero(TipoAcero.Tipo tipo) {

        this.tipo = Objects.requireNonNull(tipo);

        if (String.valueOf(this.tipo).isBlank()) {
            throw new IllegalArgumentException("El tipo de acero debe estar definido ... puede ser [HR, CR]");
        }

    }

    public static TipoAcero of(TipoAcero.Tipo tipo){
        return new TipoAcero(tipo);
    }

    @Override
    public TipoAcero.Tipo value() {
        return tipo;
    }

    public enum Tipo{
        HR, CR;
    }

}
