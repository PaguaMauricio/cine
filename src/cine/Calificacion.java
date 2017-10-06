/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author PaguaMauricio
 */
class Calificacion {
    public String nombre;
    
    public Calificacion(String nom){
        this.setNombre(nom);
    }
    
    private void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public String mostrarCalificacion(){
        return this.nombre;
    }
}
