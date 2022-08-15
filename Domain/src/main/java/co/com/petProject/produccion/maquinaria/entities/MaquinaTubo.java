package co.com.petProject.produccion.maquinaria.entities;

import co.com.petProject.produccion.maquinaria.values.*;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.Entity;

public class MaquinaTubo extends Entity<MaquinaTuboID> {

    private MaquinaTuboID maquinaTuboID;
    private TipoDeAcero tipoDeAcero;
    private NumeroRodillo numeroRodillo;
    private TipoRodamiento tiporodamiento;
    private RegistroMantenimiento registroMantenimiento;

    public MaquinaTubo(MaquinaTuboID maquinaTuboID, TipoDeAcero tipoDeAcero, NumeroRodillo numeroRodillo, TipoRodamiento tiporodamiento, RegistroMantenimiento registroMantenimiento) {
        super(maquinaTuboID);
        this.tipoDeAcero = tipoDeAcero;
        this.registroMantenimiento = registroMantenimiento;
        this.numeroRodillo = numeroRodillo;
        this.tiporodamiento = tiporodamiento;
    }

    public MaquinaTuboID getMaquinaTuboID() { return maquinaTuboID; }

    public TipoDeAcero getTipoDeAcero() {
        return tipoDeAcero;
    }
    public NumeroRodillo getNumeroRodillo() {
        return numeroRodillo;
    }
    public TipoRodamiento getTiporodamiento() {
        return tiporodamiento;
    }
    public RegistroMantenimiento getRegistroMantenimiento() {
        return registroMantenimiento;
    }

}
