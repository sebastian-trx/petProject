package co.com.petProject.produccion.planta.events;

import co.com.petProject.produccion.planta.values.Nombre;
import co.com.petProject.produccion.planta.values.OperarioID;
import co.com.petProject.produccion.planta.values.Turno;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class OperarioAgregado extends DomainEvent {

    private final OperarioID operarioID;

    private final Nombre nombre;

    private final Turno turno;

    public OperarioAgregado(OperarioID operarioID, Nombre nombre, Turno turno) {
        super("co.com.petProject.produccion.OperarioAgregado");
        this.operarioID = operarioID;
        this.nombre = nombre;
        this.turno = turno;
    }

    public OperarioID getOperarioID() {
        return operarioID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Turno getTurno() {
        return turno;
    }
}
