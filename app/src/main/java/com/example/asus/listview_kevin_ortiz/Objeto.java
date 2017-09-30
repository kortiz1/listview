package com.example.asus.listview_kevin_ortiz;

/**
 * Created by root on 29/09/17.
 */

public class Objeto {

    private String operaciones;
    private String datos;
    private String resultados;

    public Objeto(String operaciones , String datos , String resultados) {
        this.operaciones = operaciones;
        this.datos = datos;
        this.resultados = resultados;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public String getDatos() {
        return datos;
    }

    public String getResultados() {
        return resultados;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public void guardar(){

        Datos.guardar(this);
    }
}





