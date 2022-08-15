package co.com.petProject.produccion.planta.commands;

import co.com.petProject.produccion.planta.values.PlantaID;
import co.com.sofka.domain.generic.Command;

public class CrearPlanta extends Command {
    private final PlantaID plantaID;

    public CrearPlanta(PlantaID plantaID) {
        this.plantaID = plantaID;
    }

    public PlantaID getPlantaID() {
        return plantaID;
    }
}
