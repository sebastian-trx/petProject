package co.com.petProject.produccion.planta.entities;

import co.com.petProject.produccion.planta.values.Inventario;
import co.com.petProject.produccion.planta.values.Nombre;
import co.com.petProject.produccion.planta.values.SupervisorID;
import co.com.sofka.domain.generic.Entity;

public class Supervisor extends Entity<SupervisorID> {

    private SupervisorID supervisorID;

    private Inventario inventario;

    private Nombre nombre;

    public Supervisor(SupervisorID supervisorID, Inventario inventario, Nombre nombre) {
        super(supervisorID);
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
