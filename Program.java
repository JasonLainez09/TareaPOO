/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursos;

/**
 *
 * @author PCVISION
 */

    
 public class Program {
public static void main(String arg[ ]) {
   
Mensajes mensajes = new Mensajes(); 
mensajes.Saludo();                  
mensajes.dibujar(10);               
    }
   
    public static class Mensajes {
  //Método que no recibe parámetro de entrada ni retorna valor
  public void Saludo() {
    System.out.println("Hola a todos");
}
    
  //Método que  recibe parámetro entero para imprimir un valor
public void dibujar(int edad) {
  if (edad > 18){
     System.out.println("Eres mayor de edad");
  }else{
     System.out.println("Eres menor de edad");
     }
    }
   }
  }
