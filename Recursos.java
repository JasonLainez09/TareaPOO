
package com.mycompany.recursos;

import javax.swing.JOptionPane;


public class Recursos {
     public static void main (String []args){
       Recursos op = new Recursos ();
       op.leerMensaje();
       op.leerEdad();
       op.leerMultiplicacion();
       op.leerContador();
 }
     
int edad;
int multiplicacion;
int numero1;
int numero2;

public void leerMensaje (){
    System.out.println("Programacion Orientada a Objetos 2023");
    
         } 
 
public void leerEdad (){
edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad para determinar si es mayor o menor de edad"));
   if (edad>20){
       System.out.println("Usted es mayor de edad");} 
       else {
                System.out.println("Usted es menor de edad");
   }
    
         } 

public void leerMultiplicacion (){
   numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para multiplicar"));
   numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero para multiplicar"));
   
multiplicacion= (numero1*numero2);
System.out.println("La respuesta es " + multiplicacion); 
}

public void leerContador (){

   for (int i=0 ; i < edad ; i++)
       System.out.println(i+1);
}
}




  
