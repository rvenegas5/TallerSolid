/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author micha
 */
public class Crema extends Aderezo{
    
    public Crema(){
        setNombre();
    }
    
    @Override
    void setNombre() {
        super.nombre= "Crema";
    }
    
}
