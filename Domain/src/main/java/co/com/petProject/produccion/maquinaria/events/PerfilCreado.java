package co.com.petProject.produccion.maquinaria.events;

import co.com.petProject.produccion.maquinaria.values.MaquinaPerfilID;
import co.com.petProject.produccion.maquinaria.values.NumeroRodillo;
import co.com.petProject.produccion.maquinaria.values.RegistroMantenimiento;
import co.com.petProject.produccion.maquinaria.values.TipoRodamiento;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.DomainEvent;

public class PerfilCreado extends DomainEvent {

    private final MaquinaPerfilID maquinaPerfilId;
    private final TipoDeAcero tipoDeAcero;
    private final NumeroRodillo numeroRodillo;
    private final TipoRodamiento tiporodamiento;
    private final RegistroMantenimiento registroMantenimiento;

    public PerfilCreado (MaquinaPerfilID maquinaria, TipoDeAcero tipoDeAcero, RegistroMantenimiento registroMantenimiento, NumeroRodillo numeroRodillo,  TipoRodamiento tiporodamiento){

        super("co.com.petProject.produccion.PerfilCreado");

        this.maquinaPerfilId = maquinaria;
        this.tipoDeAcero = tipoDeAcero;
        this.registroMantenimiento = registroMantenimiento;
        this.numeroRodillo = numeroRodillo;
        this.tiporodamiento = tiporodamiento;

    }

    public MaquinaPerfilID getMaquinaPerfilId() {
        return maquinaPerfilId;
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
