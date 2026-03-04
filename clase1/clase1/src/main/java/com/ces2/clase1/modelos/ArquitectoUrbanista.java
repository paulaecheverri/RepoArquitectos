package com.ces2.clase1.modelos;

public class ArquitectoUrbanista implements Arquitecto{
    private String nombre;
    private int obrasActuales;

    public ArquitectoUrbanista(String nombre, int obrasActuales){
        this.nombre = nombre;
        this.obrasActuales = obrasActuales;
    }

    public void setObrasActuales(int obrasActuales){
        this.obrasActuales = obrasActuales;
    }

    public int getObrasActuales() {
        return obrasActuales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String disenarEstructura() {
        String resultado = "Este trabajo ha sido degenado para el Arquitecto: " + getNombre();
        resultado += " Obras actaules :" + getObrasActuales() + " se pasa del limite permitido: " + MAX_OBRAS;

        if (this.obrasActuales < MAX_OBRAS){
            this.obrasActuales++;
            resultado = "  Trabajo aprobado para el Arquitecto : " +getNombre();
            resultado += " Inicie su trabajo: ";
            resultado += " Total obras en este moment: "+ getObrasActuales();
        }
        return resultado;
    }
}
