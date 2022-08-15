package co.com.petProject.produccion.maquinaria.entities;

import co.com.petProject.produccion.maquinaria.values.*;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.Entity;

public class MaquinaPerfil extends Entity<MaquinaPerfilID> {

    private MaquinaPerfilID maquinaPerfilID;
    private TipoDeAcero tipoDeAcero;
    private NumeroRodillo numeroRodillo;
    private TipoRodamiento tiporodamiento;
    private RegistroMantenimiento registroMantenimiento;

    public MaquinaPerfil(MaquinaPerfilID maquinaPerfilId, TipoDeAcero tipoDeAcero, NumeroRodillo numeroRodillo, TipoRodamiento tiporodamiento, RegistroMantenimiento registroMantenimiento) {
        super(maquinaPerfilId);
        this.tipoDeAcero = tipoDeAcero;
        this.registroMantenimiento = registroMantenimiento;
        this.numeroRodillo = numeroRodillo;
        this.tiporodamiento = tiporodamiento;
    }

    public MaquinaPerfilID getMaquinaPerfilId() {
        return maquinaPerfilID;
    }
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
