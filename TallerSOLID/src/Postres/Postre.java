/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos = new ArrayList<>();
        this.sabor = sabor;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public void anadirAderezo(Aderezo aderezo){
        aderezos.add(aderezo);
    }
    
    public void quitarAderezo(Aderezo aderezo){
        aderezos.remove(aderezo);
    }
    
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
}
