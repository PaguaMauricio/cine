/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import cine.Calificacion;

/**
 *
 * @author PaguaMauricio
 */
public class Pelicula {
    private int anioEstreno;
    private boolean disponible;
    private int duracion;//minutos
    private String nombre;
    private String tituloOriginal;
    private Calificacion calificacion;
    
    public int calcularDuracionEnFuncion(){
        return 0;//falta
    }
    public boolean estaDisponible(){
        return this.disponible;
    }
    public boolean estaEnCartelera(){
        return false;//falta
    }
    public boolean existeNombre(){
        if(this.nombre.equals("")){
            return false;
        }else return true;
    }
    public Calificacion getCalificacion(){
        return this.calificacion;
    }

}
