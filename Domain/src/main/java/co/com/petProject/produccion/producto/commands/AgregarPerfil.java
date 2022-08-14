package co.com.petProject.produccion.producto.commands;

import co.com.petProject.produccion.producto.values.Dimension;
import co.com.petProject.produccion.producto.values.PerfilId;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.Command;

public class AgregarPerfil extends Command {

    private final PerfilId perfilId;

    private final TipoDeAcero tipoDeAcero;

    private final Dimension dimension;

    public AgregarPerfil(PerfilId perfilId, TipoDeAcero tipoDeAcero, Dimension dimension) {
        this.perfilId = perfilId;
        this.tipoDeAcero = tipoDeAcero;
        this.dimension = dimension;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public TipoDeAcero getTipoDeAcero() {
        return tipoDeAcero;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
