package co.com.petProject.produccion.planta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Turno implements ValueObject<Turno.TurnoDiaNoche> {
    private TurnoDiaNoche turno;

    public Turno(TurnoDiaNoche turno) {
        this.turno = Objects.requireNonNull(turno);
    }

    public static Turno of (TurnoDiaNoche turno){
        return new Turno(turno);
    }
    @Override
    public TurnoDiaNoche value() {
        return turno;
    }

    public enum TurnoDiaNoche{
        Dia, Noche;
    }
}
