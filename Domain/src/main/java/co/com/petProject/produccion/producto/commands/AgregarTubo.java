package co.com.petProject.produccion.producto.commands;

import co.com.petProject.produccion.producto.values.*;
import co.com.sofka.domain.generic.Command;

import java.util.Objects;

public class AgregarTubo extends Command {
    private final TuboId tuboId;
    private final FormaTubo formaTubo;
    private final Tipo tipo;
    private final TipoDeAcero tipoDeAcero;
    private final Dimension dimension;

    public AgregarTubo(TuboId tuboId, FormaTubo formaTubo, Tipo tipo, TipoDeAcero tipoDeAcero, Dimension dimension) {
        this.tuboId = tuboId;
        this.formaTubo = formaTubo;
        this.tipo = tipo;
        this.tipoDeAcero = tipoDeAcero;
        this.dimension = dimension;
    }

    public FormaTubo getFormaTubo() {
        return formaTubo;
    }

    public TuboId getTuboId() {
        return tuboId;
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
