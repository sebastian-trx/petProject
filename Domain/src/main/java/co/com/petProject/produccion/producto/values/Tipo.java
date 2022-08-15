package co.com.petProject.produccion.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<Tipo.Estado> {

    private Estado tipo;
    public Tipo(Estado tipo){
        this.tipo = Objects.requireNonNull(tipo);
    }

    @Override
    public Estado value(){
        return tipo;
    }

    public enum Estado {
        Primera, Segunda ;
    }
}
