/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oparitmeticas;

/**
 *
 * @author PCVISION
 */
public class OpAritmeticas {

    public static void main(String[] args) {
double suma = 0;
double multiplicacion = 0;
double resta = 0;
double division = 0;
double numero1 = 30;
double numero2 = 5;


suma=numero1+numero2;
resta=numero1-numero2;
multiplicacion=numero1*numero2;

if (numero2!=0){
    division=numero1/numero2;
        }

System.out.println("La suma es: " + suma);
System.out.println("La resta es: " + resta);
System.out.println("La multiplicacion es: " + multiplicacion);
System.out.println("La division es: " + division);

    }
 }   