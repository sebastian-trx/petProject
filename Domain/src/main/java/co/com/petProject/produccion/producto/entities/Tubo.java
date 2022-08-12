package co.com.petProject.produccion.producto.entities;

import co.com.petProject.produccion.producto.values.*;
import co.com.sofka.domain.generic.Entity;

public class Tubo extends Entity<TuboId> {
    private FormaTubo formaTubo;
    private Tipo tipo;
    private TipoDeAcero tipoDeAcero;
    private Dimension dimension;
    public Tubo(TuboId entityId) {
        super(entityId);
    }
}
