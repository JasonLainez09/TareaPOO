
package com.mycompany.mecanico;

public class Mecanico 
{

    private String identidad;
    private String name;
    
    public Mecanico (){
        
        }
    public Mecanico (String identidad, String name){
        this.setIdentidad(identidad);
        this.setName(name);
        }
    
    public String getIdentidad(){
        return identidad;
        
    }
    public String getName(){
        return name;
    }
    
    public void setIdentidad(String identidad){
        this.identidad = identidad;
        
    }
    public void setName(String name){
        this.name = name;
        
        
        
        
    }
    }
    

