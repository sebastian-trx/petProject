package co.com.petProject.produccion.planta;

import co.com.petProject.produccion.planta.entities.Operario;
import co.com.petProject.produccion.planta.entities.Supervisor;
import co.com.petProject.produccion.planta.events.*;
import co.com.sofka.domain.generic.EventChange;

public class PlantaChange extends EventChange {
    public PlantaChange(Planta planta){
        apply((PlantaCreada event ) -> {});

        apply((SupervisorAgregado event) -> {
            var supervisor = new Supervisor(event.getSupervisorID(), event.getInventario(), event.getNombre());
        });

        apply((OperarioAgregado event) -> {
            var operario = new Operario(event.getOperarioID(), event.getNombre(), event.getTurno());
        });

        apply((NombreDelSupervisorActualizado event) ->{
            planta.actualizarNombreDelSupervisor(event.getSupervisorID(),event.getNombre());
        });

        apply((TurnoDelOperarioActualizado event) -> {
            var operario = planta.getOperarioById(event.getOperarioID())
                    .orElseThrow(() -> new IllegalArgumentException("turno no encontrado"));
            operario.actualizarTurnoOperario(event.getTurno());
        });

    }
}
