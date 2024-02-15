/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hundirflota;

/**
 *
 * @author raul
 */
public class Tablero {
    
    //Atributos
    
    char[][] tablero;
    Barco[] barcos;
    
    //Constructor
    
    public void tablero(char[][] tablero, Barco[] barcos)
    {
        int columnas = 0;
        int filas = 0;
        
        this.tablero = new char[filas][columnas];
        this.barcos = barcos;
    }
    
    //Metodos
    
    public void Tablero()
    {
        for (int i = 0; i < tablero.length; i++)  //aqui recorro filas
        {
            for (int j = 0; j < tablero[i].length; j++) //aqui recorremos columnas
            {
                
            }
        }
    }
    
    public void imprimirTablero()
    {
        System.out.println("este es el estado actual del tablero" + tablero);
    }
    
    public void colocarBarcos()
    {
       for (int i = 0; i < barcos.length; i++)
       {
           int filasAleatorias;
           int columnasAleatorias;
       }
    }
    
    public boolean puedeColocarBarco(Barco barco, int fila, int columna)
    {
        
        return false;
        
    }
    
    public void colocarBarcoenTablero()
    {
        
    }

    public void jugar()
    {
        
    }
}
