package co.com.petProject.produccion.producto.events;

import co.com.petProject.produccion.producto.values.Dimension;
import co.com.petProject.produccion.producto.values.PerfilId;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class PerfilCreado extends DomainEvent {

    private final PerfilId perfilId;

    private final TipoDeAcero tipoDeAcero;

    private final Dimension dimension;

    public PerfilCreado( PerfilId perfilId, TipoDeAcero tipoDeAcero, Dimension dimension) {
        super("co.com.petProject.produccion.producto");
        this.perfilId = perfilId;
        this.tipoDeAcero = tipoDeAcero;
        this.dimension = dimension;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public TipoDeAcero getTipoDeAcero() {
        return tipoDeAcero;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
