package co.com.petProject.produccion.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FormaTubo implements ValueObject<FormaTubo.Forma> {
   private Forma forma;

    public FormaTubo(Forma forma) {
        this.forma = Objects.requireNonNull(forma);
    }

    public static FormaTubo of (Forma forma) {
        return new FormaTubo(forma);
    }


    @Override
    public Forma value() {
        return forma;
    }

    public enum Forma {
        Rectangular, Cuadrado ;
    }
}
