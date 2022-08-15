package co.com.petProject.produccion.producto.events;

import co.com.petProject.produccion.producto.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TuboCreado extends DomainEvent {
    private final TuboId tuboId;
    private final FormaTubo formaTubo;
    private final Tipo tipo;
    private final TipoDeAcero tipoDeAcero;
    private final Dimension dimension;

    public TuboCreado(TuboId tuboId, FormaTubo formaTubo, Tipo tipo, TipoDeAcero tipoDeAcero, Dimension dimension){
        super("co.com.petProject.produccion.TuboCreado");
        this.tuboId = tuboId;
        this.formaTubo = formaTubo;
        this.tipo = tipo;
        this.tipoDeAcero = tipoDeAcero;
        this.dimension = dimension;
    }

    public TuboId getTuboId() {
        return tuboId;
    }

    public FormaTubo getFormaTubo() {
        return formaTubo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public TipoDeAcero getTipoDeAcero() {
        return tipoDeAcero;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
