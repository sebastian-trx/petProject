package co.com.petProject.produccion.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDeAcero implements ValueObject<TipoDeAcero.Tipo> {
  private Tipo tipoDeAcero;

    public TipoDeAcero(Tipo tipoDeAcero) {
        this.tipoDeAcero = Objects.requireNonNull(tipoDeAcero);
    }

    public static TipoDeAcero of (Tipo tipoDeAcero){
        return new TipoDeAcero(tipoDeAcero);
    }


    @Override
    public Tipo value() {
        return tipoDeAcero;
    }

    public enum Tipo {
        CR,HR ;
    }
}
