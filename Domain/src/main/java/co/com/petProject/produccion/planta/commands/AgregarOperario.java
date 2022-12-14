package co.com.petProject.produccion.planta.commands;

import co.com.petProject.produccion.planta.values.Nombre;
import co.com.petProject.produccion.planta.values.OperarioID;
import co.com.petProject.produccion.planta.values.Turno;
import co.com.sofka.domain.generic.Command;

public class AgregarOperario extends Command {

    private final OperarioID operarioID;

    private final Nombre nombre;

    private final Turno turno;

    public AgregarOperario(OperarioID operarioID, Nombre nombre, Turno turno) {
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
