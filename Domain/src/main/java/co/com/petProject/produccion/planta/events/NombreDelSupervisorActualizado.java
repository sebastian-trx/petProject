package co.com.petProject.produccion.planta.events;

import co.com.petProject.produccion.planta.values.Nombre;
import co.com.petProject.produccion.planta.values.SupervisorID;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class NombreDelSupervisorActualizado extends DomainEvent {

    private final SupervisorID supervisorID;

    private final Nombre nombre;

    public NombreDelSupervisorActualizado(SupervisorID supervisorID, Nombre nombre) {
        super("co.com.petProject.produccion.NombreDelSupervisorActualizado");
        this.supervisorID = supervisorID;
        this.nombre = nombre;
    }

    public SupervisorID getSupervisorID() {
        return supervisorID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
