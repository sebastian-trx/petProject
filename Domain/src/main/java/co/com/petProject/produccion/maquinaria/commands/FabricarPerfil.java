package co.com.petProject.produccion.maquinaria.commands;

import co.com.petProject.produccion.maquinaria.values.MaquinaPerfilID;
import co.com.petProject.produccion.maquinaria.values.NumeroRodillo;
import co.com.petProject.produccion.maquinaria.values.RegistroMantenimiento;
import co.com.petProject.produccion.maquinaria.values.TipoRodamiento;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.Command;

public class FabricarPerfil extends Command {

    private final MaquinaPerfilID maquinaPerfilId;
    private final TipoDeAcero tipoDeAcero;
    private final NumeroRodillo numeroRodillo;
    private final TipoRodamiento tiporodamiento;
    private final RegistroMantenimiento registroMantenimiento;

    public FabricarPerfil (MaquinaPerfilID maquinaria, TipoDeAcero tipoDeAcero, RegistroMantenimiento registroMantenimiento, NumeroRodillo numeroRodillo,  TipoRodamiento tiporodamiento){

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
