package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoRodamiento implements ValueObject<String> {

    private final String referencia;

    public TipoRodamiento(String referencia) {
        this.referencia = Objects.requireNonNull(referencia);
    }

    public static TipoRodamiento of(String referencia){
        return new TipoRodamiento(referencia);
    }

    @Override
    public String value() {
        return this.referencia;
    }

}
