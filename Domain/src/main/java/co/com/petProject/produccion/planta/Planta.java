package co.com.petProject.produccion.planta;

import co.com.petProject.produccion.planta.entities.Operario;
import co.com.petProject.produccion.planta.entities.Supervisor;
import co.com.petProject.produccion.planta.events.*;
import co.com.petProject.produccion.planta.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Planta extends AggregateEvent<PlantaID> {

    protected Supervisor supervisor;
    protected Set<Operario> operarios;

    public Planta(PlantaID plantaID) {
        super(plantaID);
        appendChange(new PlantaCreada(plantaID)).apply();
        subscribe(new PlantaChange(this));
    }

    //comportamientos
    public void agregarSupervisor(SupervisorID supervisorID, Inventario inventario, Nombre nombre){
        Objects.requireNonNull(supervisorID);
        Objects.requireNonNull(inventario);
        Objects.requireNonNull(nombre);
        appendChange(new SupervisorAgregado(supervisorID,inventario,nombre)).apply();
    }

    public void agregarOperario(OperarioID operarioID, Nombre nombre, Turno turno){
        Objects.requireNonNull(operarioID);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(turno);
        appendChange(new OperarioAgregado(operarioID,nombre,turno));
    }

    public void actualizarNombreDelSupervisor(SupervisorID supervisorID, Nombre nombre){
        Objects.requireNonNull(supervisorID);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDelSupervisorActualizado(supervisorID,nombre)).apply();
    }

    public void actualizarTurnoOperario(OperarioID operarioID, Turno turno){
        Objects.requireNonNull(operarioID);
        Objects.requireNonNull(turno);
        appendChange(new TurnoDelOperarioActualizado(operarioID,turno)).apply();
    }

    protected Optional<Operario> getOperarioById(OperarioID operarioID){
        return operarios
                .stream()
                .filter(operario -> operario.identity().equals(operarioID))
                .findFirst();
    }
}
