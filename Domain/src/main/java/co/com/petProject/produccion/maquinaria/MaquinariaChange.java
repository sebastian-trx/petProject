package co.com.petProject.produccion.maquinaria;

import co.com.petProject.produccion.maquinaria.entities.MaquinaPerfil;
import co.com.petProject.produccion.maquinaria.entities.MaquinaTubo;
import co.com.petProject.produccion.maquinaria.events.MaquinaCreada;
import co.com.petProject.produccion.maquinaria.events.PerfilCreado;
import co.com.petProject.produccion.maquinaria.events.TuboCreado;
import co.com.sofka.domain.generic.EventChange;

public class MaquinariaChange extends EventChange {

    public MaquinariaChange(Maquinaria maquinaria){

        apply( (MaquinaCreada event) -> {} );

        apply( (PerfilCreado event) -> {
            var Perfil = new MaquinaPerfil(event.getMaquinaPerfilId(), event.getTipoDeAcero(), event.getNumeroRodillo(), event.getTiporodamiento(), event.getRegistroMantenimiento());
        });

        apply( (TuboCreado event) ->{
            var Tubo = new MaquinaTubo(event.getMaquinaTuboId(), event.getTipoDeAcero(), event.getNumeroRodillo(), event.getTiporodamiento(), event.getRegistroMantenimiento());
        });

    }

}
