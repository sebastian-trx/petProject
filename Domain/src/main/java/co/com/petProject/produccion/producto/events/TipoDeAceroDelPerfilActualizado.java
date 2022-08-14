package co.com.petProject.produccion.producto.events;

import co.com.petProject.produccion.producto.values.PerfilId;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class TipoDeAceroDelPerfilActualizado extends DomainEvent {

    private final PerfilId perfilIdId;

    private final TipoDeAcero tipoDeAcero;

    public TipoDeAceroDelPerfilActualizado(PerfilId perfilIdId, TipoDeAcero tipoDeAcero) {
        super("co.com.petProject.produccion.TipoDeAceroDelPerfilActualizado");
        this.perfilIdId = perfilIdId;
        this.tipoDeAcero = tipoDeAcero;
    }

    public PerfilId getPerfilIdId() {
        return perfilIdId;
    }

    public TipoDeAcero getTipoDeAcero() {
        return tipoDeAcero;
    }
}
