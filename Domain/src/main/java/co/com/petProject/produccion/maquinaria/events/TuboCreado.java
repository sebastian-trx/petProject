package co.com.petProject.produccion.maquinaria.events;

import co.com.petProject.produccion.maquinaria.values.*;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.DomainEvent;

public class TuboCreado extends DomainEvent {

    private final MaquinaTuboID maquinaTuboID;
    private final TipoDeAcero tipoDeAcero;
    private final NumeroRodillo numeroRodillo;
    private final TipoRodamiento tiporodamiento;
    private final RegistroMantenimiento registroMantenimiento;

    public TuboCreado (MaquinaTuboID maquinaria, TipoDeAcero tipoDeAcero, RegistroMantenimiento registroMantenimiento, NumeroRodillo numeroRodillo,  TipoRodamiento tiporodamiento){

        super("co.com.petProject.produccion.TuboCreado");

        this.maquinaTuboID = maquinaria;
        this.tipoDeAcero = tipoDeAcero;
        this.registroMantenimiento = registroMantenimiento;
        this.numeroRodillo = numeroRodillo;
        this.tiporodamiento = tiporodamiento;

    }

    public MaquinaTuboID getMaquinaTuboId() {
        return maquinaTuboID;
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
