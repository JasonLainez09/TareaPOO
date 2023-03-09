/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.futbolista;

import helpers.Futbolista2;

/**
 *
 * @author PCVISION
 */
public class Futbolista {

    public static void main(String[] args) {
        Futbolista2 futbolista = new Futbolista2("Jason Lainez","Barcelona");
        futbolista.imprimirNombre();
        futbolista.imprimirEquipo();
        futbolista.establecerEdad(20);
        
        System.out.println(futbolista.obtenerEdad());
         
    }
}
