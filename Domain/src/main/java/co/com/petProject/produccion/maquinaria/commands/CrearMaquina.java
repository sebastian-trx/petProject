package co.com.petProject.produccion.maquinaria.commands;

import co.com.petProject.produccion.maquinaria.values.MaquinariaID;
import co.com.sofka.domain.generic.Command;

public class CrearMaquina extends Command {

    private final MaquinariaID maquinariaId;

    public CrearMaquina(MaquinariaID maquinariaId) {
        this.maquinariaId = maquinariaId;
    }

    public MaquinariaID getMaquinariaId() {
        return maquinariaId;
    }

}
