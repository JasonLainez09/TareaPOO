/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaabstraccion;

import helpers.ACMilan;
import helpers.Barcelona;
import helpers.RealMadrid;



/**
 *
 * @author PCVISION
 */
public class TareaAbstraccion {

    public static void main(String[] args) {
       
        Barcelona barcelona = new Barcelona ();
        RealMadrid realmadrid = new RealMadrid ();
        ACMilan milan = new ACMilan ();
        
        System.out.println (barcelona.getEquipo());
          System.out.println (barcelona.getCapitan());
       System.out.println (realmadrid.getEquipo());
       System.out.println (realmadrid.getCapitan());
       System.out.println (milan.getEquipo());
       System.out.println (milan.getCapitan());
     
          
        
        
        
        
        
        
    }
}
