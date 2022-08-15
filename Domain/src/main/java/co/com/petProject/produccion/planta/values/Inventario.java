package co.com.petProject.produccion.planta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Inventario implements ValueObject<Inventario.Props> {

    private final Integer numeroDeTubos;
    private final Integer numeroDePerfiles;

    public Inventario(Integer numeroDeTubos, Integer numeroDePerfiles) {
        this.numeroDeTubos = Objects.requireNonNull(numeroDeTubos);
        this.numeroDePerfiles = Objects.requireNonNull(numeroDePerfiles);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Integer numeroDeTubos() {
                return numeroDeTubos;
            }

            @Override
            public Integer numeroDePerfiles() {
                return numeroDePerfiles;
            }

        };
    }

    public interface Props{
        Integer numeroDeTubos();
        Integer numeroDePerfiles();
    }

}
