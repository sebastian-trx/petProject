package co.com.petProject.produccion.planta.events;

import co.com.petProject.produccion.planta.values.Inventario;
import co.com.petProject.produccion.planta.values.Nombre;
import co.com.petProject.produccion.planta.values.SupervisorID;
import co.com.sofka.domain.generic.DomainEvent;


public class SupervisorAgregado extends DomainEvent {
    private final SupervisorID supervisorID;
    private final Inventario inventario;
    private final Nombre nombre;

    public SupervisorAgregado(SupervisorID supervisorID, Inventario inventario, Nombre nombre) {
        super("co.com.petProject.produccion.SupervisorAgregado");
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
