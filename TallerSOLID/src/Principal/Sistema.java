/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.*;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        ManejadorDePrecios manejadorPrecio = new ManejadorDePrecios();
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        helado_vainilla.anadirAderezo(new Frutilla());
        helado_vainilla.anadirAderezo(new Crema());
        System.out.println(helado_vainilla);
//        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        //System.out.println(helado_vainilla.showPrecioFinal());
        System.out.println(manejadorPrecio.showPrecioFinal(helado_vainilla.getPrecioParcial(),helado_vainilla.getAderezos()));
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        pastel_chocolate.quitarAderezo(new Crema());
        pastel_chocolate.anadirAderezo(new Frutilla());
        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(manejadorPrecio.showPrecioFinal(pastel_chocolate.getPrecioParcial(),pastel_chocolate.getAderezos()));
        
        
    }
}
