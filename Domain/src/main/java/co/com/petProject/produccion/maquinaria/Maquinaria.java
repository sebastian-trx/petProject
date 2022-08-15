package co.com.petProject.produccion.maquinaria;

import co.com.petProject.produccion.maquinaria.entities.MaquinaPerfil;
import co.com.petProject.produccion.maquinaria.entities.MaquinaTubo;
import co.com.petProject.produccion.maquinaria.events.MaquinaCreada;
import co.com.petProject.produccion.maquinaria.events.PerfilCreado;
import co.com.petProject.produccion.maquinaria.events.TuboCreado;
import co.com.petProject.produccion.maquinaria.values.*;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class Maquinaria extends AggregateEvent<MaquinariaID>{

    protected Set<MaquinaPerfil> MaquinasPerfil;
    protected Set<MaquinaTubo> MaquinasTubo;

    public Maquinaria(MaquinariaID entityId) {
        super(entityId);
        appendChange(new MaquinaCreada(entityId)).apply();
        subscribe(new MaquinariaChange(this));
    }

    // Comportamientos //

    public void FabricarPerfil (MaquinaPerfilID maquinaria, TipoDeAcero tipoDeAcero, RegistroMantenimiento registroMantenimiento, NumeroRodillo numeroRodillo, TipoRodamiento tiporodamiento) {
        Objects.requireNonNull(maquinaria);
        Objects.requireNonNull(tipoDeAcero);
        Objects.requireNonNull(registroMantenimiento);
        Objects.requireNonNull(numeroRodillo);
        Objects.requireNonNull(tiporodamiento);
        appendChange(new PerfilCreado(maquinaria, tipoDeAcero, registroMantenimiento, numeroRodillo, tiporodamiento)).apply();
    }

    public void FabricarTubo(MaquinaTuboID maquinaria, TipoDeAcero tipoDeAcero, RegistroMantenimiento registroMantenimiento, NumeroRodillo numeroRodillo, TipoRodamiento tiporodamiento){
        Objects.requireNonNull(maquinaria);
        Objects.requireNonNull(tipoDeAcero);
        Objects.requireNonNull(registroMantenimiento);
        Objects.requireNonNull(numeroRodillo);
        Objects.requireNonNull(tiporodamiento);
        appendChange(new TuboCreado(maquinaria, tipoDeAcero, registroMantenimiento, numeroRodillo, tiporodamiento)).apply();

    }

}
