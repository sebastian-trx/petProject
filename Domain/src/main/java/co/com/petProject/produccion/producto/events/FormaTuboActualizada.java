package co.com.petProject.produccion.producto.events;

import co.com.petProject.produccion.producto.values.FormaTubo;
import co.com.petProject.produccion.producto.values.TuboId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class FormaTuboActualizada extends DomainEvent {
    private final TuboId tuboId;
    private final FormaTubo formaTubo;

    public FormaTuboActualizada(TuboId tuboId, FormaTubo formaTubo) {
        super("co.com.petProject.produccion.FormaTuboActualizado");
        this.tuboId = tuboId;
        this.formaTubo = formaTubo;
    }

    public TuboId getTuboId() {
        return tuboId;
    }

    public FormaTubo getFormaTubo() {
        return formaTubo;
    }
}
