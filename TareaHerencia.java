/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaherencia;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author PCVISION
 */
public class TareaHerencia {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo ();
        Triangulo triangulo = new Triangulo ();
        Linea linea = new Linea ();
        Cuadrado cuadrado = new Cuadrado ();
        
       
        System.out.println("Forma 1");
        
        
        
          circulo.imprimirInformacion ();
         triangulo.imprimirInformacion ();
          linea.imprimirInformacion ();
           cuadrado.imprimirInformacion ();
    }
}
