package co.com.petProject.produccion.planta.events;

import co.com.petProject.produccion.planta.values.PlantaID;
import co.com.sofka.domain.generic.DomainEvent;

public class PlantaCreada extends DomainEvent {
    public PlantaCreada(PlantaID plantaID) {
        super("co.com.petProject.produccion.PlantaCreada");
    }
}
