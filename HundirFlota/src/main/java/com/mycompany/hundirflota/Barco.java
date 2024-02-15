/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hundirflota;

/**
 *
 * @author raul
 */
public class Barco {
    //Atributos
    
    int longitud;
    String nombre;
    boolean[] partes;
    
    //Constructor
    
    public Barco(int longitud, String nombre, boolean[] partes)
    {
        this.longitud = longitud;
        this.nombre = nombre;
        partes = new boolean [longitud];
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean[] getPartes() {
        return partes;
    }

    public void setPartes(boolean[] partes) {
        this.partes = partes;
    }
    
    //Metodos
    
    public boolean haSidoHundido()
    
    {
        for(int i = 0; i < partes.length; i++)
        {
            if(!partes[i])  //Aqui vemos si ha sido golpeado o no 
            {
                return false;
            }
        }
        
        return false;
    }
    
    public void hundirParte(int parte)  //marca el barco como parte golpeada
    { 
        partes [parte] = true;
    }    
    
}
