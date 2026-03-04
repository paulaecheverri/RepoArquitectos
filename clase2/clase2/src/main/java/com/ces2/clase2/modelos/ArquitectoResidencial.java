package com.ces2.clase2.modelos;

public class ArquitectoResidencial extends  Arquitecto{
    public ArquitectoResidencial (String nombre, int obras){
        super(nombre, obras);
    }
    @Override
    public String disenarEstructura() {
        String resultado = "Este trabajo ha sido degenado para el Arquitecto: " + getNombre();
        resultado += " Obras actaules :" + getObrasActuales() + " se pasa del limite permitido: " + MAX_OBRAS;

        if (this.obrasActuales < MAX_OBRAS){
            this.obrasActuales++;
            resultado = "  Trabajo aprobado para el Arquitecto : " +getNombre();
            resultado += " Inicie su trabajo diseñando lo correspondiente a su profesion  ";
            resultado += " Total obras en este momento: "+ getObrasActuales();
        }
        return resultado;
    }
}
