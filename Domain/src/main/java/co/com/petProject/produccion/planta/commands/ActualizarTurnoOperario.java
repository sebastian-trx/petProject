package co.com.petProject.produccion.planta.commands;

import co.com.petProject.produccion.planta.values.OperarioID;
import co.com.petProject.produccion.planta.values.Turno;
import co.com.sofka.domain.generic.Command;

public class ActualizarTurnoOperario extends Command {
    private final OperarioID operarioID;
    private final Turno turno;

    public ActualizarTurnoOperario(OperarioID operarioID, Turno turno) {
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
