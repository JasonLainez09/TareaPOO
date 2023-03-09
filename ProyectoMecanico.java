/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mecanico;

/**
 *
 * @author PCVISION
 */
public class ProyectoMecanico {
    
            
    public static void main (String[] args){
        
        Mecanico op = new Mecanico ();
        
        op.setIdentidad ("0507200200457");
        op.setName("Jason Lainez");
        
        
        System.out.println ("La identidad del mecanico es: "+ op.getIdentidad() );
        System.out.println ("El nombre del mecanico es: " + op.getName());
    }
    
}
