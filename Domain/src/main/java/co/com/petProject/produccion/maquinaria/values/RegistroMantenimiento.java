package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.ValueObject;

public class RegistroMantenimiento implements ValueObject<RegistroMantenimiento.Props> {

    private final String HoraRegistro;
    private final String FechaRegistro;

    public RegistroMantenimiento(String horaRegistro, String fechaRegistro) {
        this.HoraRegistro = horaRegistro;
        this.FechaRegistro = fechaRegistro;
    }

    @Override
    public Props value() {
        return new Props(){

            @Override
            public String HoraRegistro(){return HoraRegistro;}

            @Override
            public String FechaRegistro(){return FechaRegistro;}

        };
    }

    public interface Props{
        String HoraRegistro();
        String FechaRegistro();
    }

}
