package com.ces2.clase2.modelos;

public  abstract class Arquitecto {
    private String nombre;
    protected int obrasActuales;
    //ESTO ES QUE SI PASA MAS DE DOS OBRAS NO PODRA DISEÑAR MAS OBRAS YA QUE SE PASA DEL TOPE
    protected int MAX_OBRAS = 2;

    public Arquitecto(String nombre, int obrasActuales){
        this.nombre = nombre;
        this.obrasActuales = obrasActuales;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getObrasActuales(){
        return obrasActuales;
    }
    public void setObrasActuales(int obrasActuales){
        this.obrasActuales = obrasActuales;
    }
    //ME GENERO UN ERROr Y EN LA CORRECION ME APARECIO ESTO:
    public String getTipoArquitecto(){
        return this.getClass().getSimpleName();
    }
    //METODO COMUN IGUAL AL QUE UTILIZAMOR EN LA PARTE 1 DEL TRABAJO DEL POLIMORFISMI
   public abstract String disenarEstructura();
}
