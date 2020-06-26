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
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate.
        // a ambos agregarle CREMA y FRUTILLAS
        // y cambiar el tipo de leche a deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDeslactosada());
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.anadirAderezo(new Crema());
            postre.anadirAderezo(new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            System.out.println(ManejadorDePrecios.showPrecioFinal(postre));
        });        

        
    }
}
