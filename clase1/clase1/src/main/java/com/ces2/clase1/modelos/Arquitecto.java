package com.ces2.clase1.modelos;

public interface Arquitecto {
    //ESTO ES QUE SI PASA MAS DE DOS OBRAS NO PODRA DISEÑAR MAS OBRAS YA QUE SE PASA DEL TOPE
    int MAX_OBRAS = 2;

    String disenarEstructura();

    void setObrasActuales(int obrasActuales);

    int getObrasActuales();

    void setNombre(String nombre);

    String getNombre();

}
