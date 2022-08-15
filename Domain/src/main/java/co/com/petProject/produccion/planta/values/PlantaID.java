package co.com.petProject.produccion.planta.values;

import co.com.sofka.domain.generic.Identity;

public class PlantaID extends Identity {
    public PlantaID(String id) {
        super(id);
    }

    public PlantaID() {
    }

    public static PlantaID of(String id) {
        return new PlantaID(id);
    }
}
