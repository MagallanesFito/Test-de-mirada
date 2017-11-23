/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.de.mirada;

/**
 *
 * @author al347039
 */
public class Paciente {
    private String nombre;
    private int edad;
    
    public Paciente(){
        this("",0);
    }
    public Paciente(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
}
