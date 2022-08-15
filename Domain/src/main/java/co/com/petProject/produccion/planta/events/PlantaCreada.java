package co.com.petProject.produccion.planta.events;

import co.com.petProject.produccion.planta.values.PlantaID;
import co.com.sofka.domain.generic.DomainEvent;

public class PlantaCreada extends DomainEvent {

    private final PlantaID plantaId;

    public PlantaCreada(PlantaID plantaID) {
        super("co.com.petProject.produccion.PlantaCreada");
        this.plantaId = plantaID;
    }

    public PlantaID getPlantaId() {
        return this.plantaId;
    }

}
