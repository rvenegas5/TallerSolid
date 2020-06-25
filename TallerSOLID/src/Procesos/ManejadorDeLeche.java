/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Leche.LecheDeslactosada;
import Leche.LecheDescremada;
import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorDeLeche {
    private LecheEntera lecheCambio;
    
    public ManejadorDeLeche(LecheEntera Leche){
        lecheCambio = Leche;
    }
    public void cambiarTipoLeche(Postre postre){
        if(!(postre instanceof Pastel)){
            System.out.println("Cambiando tipo de leche a descremada");
        }
    }
    
}
