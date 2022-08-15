package co.com.petProject.produccion.planta.commands;

import co.com.petProject.produccion.planta.values.Nombre;
import co.com.petProject.produccion.planta.values.SupervisorID;

public class ActualizarNombreSupervisor  {
    private final SupervisorID supervisorID;
    private final Nombre nombre;

    public ActualizarNombreSupervisor(SupervisorID supervisorID, Nombre nombre) {
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
