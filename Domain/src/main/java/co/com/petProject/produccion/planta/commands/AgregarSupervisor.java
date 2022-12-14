package co.com.petProject.produccion.planta.commands;

import co.com.petProject.produccion.planta.values.Inventario;
import co.com.petProject.produccion.planta.values.Nombre;
import co.com.petProject.produccion.planta.values.SupervisorID;
import co.com.sofka.domain.generic.Command;

public class AgregarSupervisor extends Command {
    private final SupervisorID supervisorID;
    private final Inventario inventario;
    private final Nombre nombre;

    public AgregarSupervisor(SupervisorID supervisorID, Inventario inventario, Nombre nombre) {
        this.supervisorID = supervisorID;
        this.inventario = inventario;
        this.nombre = nombre;
    }

    public SupervisorID getSupervisorID() {
        return supervisorID;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
