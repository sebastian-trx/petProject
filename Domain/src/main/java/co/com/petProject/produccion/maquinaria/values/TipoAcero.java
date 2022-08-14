package co.com.petProject.produccion.maquinaria.values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoAcero implements ValueObject<TipoAcero.Props> {

    private final String HR;
    private final String CR;

    public TipoAcero(String HR, String CR) {
        this.HR = HR;
        this.CR = CR;
    }

    @Override
    public Props value() {
        return new Props(){
            @Override
            public String HR() {return HR;}
            @Override
            public String CR() {return CR;            }
        };
    }

    public interface Props{
        String HR();
        String CR();
    }

}
