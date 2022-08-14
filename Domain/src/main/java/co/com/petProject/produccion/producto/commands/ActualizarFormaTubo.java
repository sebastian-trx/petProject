package co.com.petProject.produccion.producto.commands;

import co.com.petProject.produccion.producto.values.FormaTubo;
import co.com.petProject.produccion.producto.values.TuboId;
import co.com.sofka.domain.generic.Command;

public class ActualizarFormaTubo extends Command {
    private final TuboId tuboId;
    private final FormaTubo formaTubo;

    public ActualizarFormaTubo(TuboId tuboId, FormaTubo formaTubo) {
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
