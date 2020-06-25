/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;
import Postres.*;
import Postres.Helado;
import Postres.Pastel;

/**
 *
 * @author Adrián Litardo
 */
public class ManejadorDePrecio extends Postre {

    public ManejadorDePrecio(String sabor) {
        super(sabor);
    }
    
    public double calcularPrecioFinal(Object postre){
        double precioFinal;
        if(postre.getClass() == Pastel.class){
            precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
            return precioFinal;
        }else{
            precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
            return precioFinal;
        }
        
    }
    
    public String showPrecioFinal(Object postre){
        
        if(postre.getClass() == Pastel.class){
            return "Precio Final: $ " + calcularPrecioFinal(Pastel.class);
        }else{
            return "Precio Final: $ " + calcularPrecioFinal(Helado.class);
        }
       
    }
    
}
