package co.com.petProject.produccion.planta.entities;

import co.com.petProject.produccion.planta.values.Nombre;
import co.com.petProject.produccion.planta.values.OperarioID;
import co.com.petProject.produccion.planta.values.Turno;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Operario extends Entity<OperarioID> {

    private  OperarioID operarioID;

    private Nombre nombre;

    private Turno turno;

    public Operario(OperarioID operarioID, Nombre nombre, Turno turno) {
        super(operarioID);
        this.nombre = nombre;
        this.turno = turno;
    }

    public void actualizarTurnoOperario(Turno turno){
        this.turno = Objects.requireNonNull(turno);
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
