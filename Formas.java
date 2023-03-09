
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author PCVISION
 */
public class Formas {
    
private String color;   

private String dibujar;

private String area;

private String radio;

private String areaCuadrado;


public Formas(){
    
    }
   
public void establecerColor (String color){
    this.color = color;
}

public String obtenerColor (){
    return this.color;
    
}

public void dibujar (String dibujar){
    this.dibujar = dibujar;
}

public String obtenerdibujar (){
    return this.dibujar;
    
}
public void area (String area){
    this.area = area;
}

public String obtenerarea (){
    return this.area;
    
}
public void radio (String radio){
    this.radio = radio;
}

public String obtenerradio (){
    return this.radio;
    
}
public void areaCuadrado (String areaCuadrado){
    this.areaCuadrado = areaCuadrado;
}

public String obtenerareaCuadrado(){
    return this.areaCuadrado;
    
}
public void imprimirInformacion (){
    
    System.out.println ("Color:"+ color);
    System.out.println ("Figura:"+ dibujar);
    System.out.println ("Area del triangulo:"+ area);
    System.out.println ("Area del Cuadrado:"+ areaCuadrado);
    System.out.println ("Radio:"+ radio);
}
}

