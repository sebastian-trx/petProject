package co.com.petProject.produccion.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Dimension implements ValueObject<Dimension.Props> {
    private final Integer alto;
    private final Integer ancho;
    private final Integer largo;

    public Dimension(Integer alto, Integer ancho, Integer largo) {
        this.alto = Objects.requireNonNull(alto);
        this.ancho = Objects.requireNonNull(ancho);
        this.largo = Objects.requireNonNull(largo);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Integer alto() {
                return alto;
            }

            @Override
            public Integer ancho() {
                return ancho;
            }

            @Override
            public Integer largo() {
                return largo;
            }
        };
    }

    public interface Props{
        Integer alto();
        Integer ancho();
        Integer largo();
    }

}
