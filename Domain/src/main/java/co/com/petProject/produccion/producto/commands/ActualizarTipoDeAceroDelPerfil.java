package co.com.petProject.produccion.producto.commands;

import co.com.petProject.produccion.producto.values.PerfilId;
import co.com.petProject.produccion.producto.values.TipoDeAcero;
import co.com.sofka.domain.generic.Command;

public class ActualizarTipoDeAceroDelPerfil extends Command {
    private final PerfilId perfilId;

    private  final TipoDeAcero tipoDeAcero;

    public ActualizarTipoDeAceroDelPerfil(PerfilId perfilId, TipoDeAcero tipoDeAcero) {
        this.perfilId = perfilId;
        this.tipoDeAcero = tipoDeAcero;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public TipoDeAcero getTipoDeAcero() {
        return tipoDeAcero;
    }
}
