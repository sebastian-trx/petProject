package co.com.petProject.produccion.producto.entities;

import co.com.petProject.produccion.producto.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Tubo extends Entity<TuboId> {
    private FormaTubo formaTubo;
    private Tipo tipo;
    private TipoDeAcero tipoDeAcero;
    private Dimension dimension;

    public Tubo(TuboId tuboId, Tipo tipo, FormaTubo formatubo, TipoDeAcero tipoDeAcero, Dimension dimension) {
        super(tuboId);
        this.tipo = tipo;
        this.formaTubo = formatubo;
        this.tipoDeAcero = tipoDeAcero;
        this.dimension = dimension;
    }

    public void actualizarFormaTubo(FormaTubo formaTubo){
        this.formaTubo = Objects.requireNonNull(formaTubo);
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
