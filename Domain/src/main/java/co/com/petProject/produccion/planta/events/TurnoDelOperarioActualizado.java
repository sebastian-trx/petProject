package co.com.petProject.produccion.planta.events;

import co.com.petProject.produccion.planta.values.OperarioID;
import co.com.petProject.produccion.planta.values.Turno;
import co.com.sofka.domain.generic.DomainEvent;


public class TurnoDelOperarioActualizado extends DomainEvent {

    private final OperarioID operarioID;

    private final Turno turno;


    public TurnoDelOperarioActualizado(OperarioID operarioID, Turno turno) {
        super("co.com.petProject.produccion.TurnoDelOperarioActualizado");
        this.operarioID = operarioID;
        this.turno = turno;
    }

    public OperarioID getOperarioID() {
        return operarioID;
    }

    public Turno getTurno() {
        return turno;
    }
}
