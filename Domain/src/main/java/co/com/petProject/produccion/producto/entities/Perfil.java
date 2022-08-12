package co.com.petProject.produccion.producto.entities;

import co.com.petProject.produccion.producto.values.Dimension;
import co.com.petProject.produccion.producto.values.PerfilId;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.Entity;

public class Perfil extends Entity<PerfilId> {

    TipoDeAcero tipoDeAcero;
    Dimension dimension;

    public Perfil(PerfilId entityId) {
        super(entityId);
    }
}
