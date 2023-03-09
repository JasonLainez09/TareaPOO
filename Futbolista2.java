/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author PCVISION
 */
public class Futbolista2 {
    public String nombre;
    private String equipoActual;
    private int edad;
   
public Futbolista2(String nombre,String equipoActual){
    this.nombre=nombre;
    this.equipoActual=equipoActual;
}
public void imprimirNombre (){
     System.out.println (nombre);
}
public void imprimirEquipo (){
    System.out.println(equipoActual);
}
public void establecerEdad (int _edad){
    this.edad =_edad;
}
public int obtenerEdad (){
    return edad;
}
}