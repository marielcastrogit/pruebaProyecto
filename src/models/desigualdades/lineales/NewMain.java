/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.desigualdades.lineales;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * lo que sale en azul es lo que se elimina
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dat = "-3x-3+8<23+5";
        DesigualdadesLinealesSimples dls = new DesigualdadesLinealesSimples(dat);
        System.out.println(dls.setParte1());
        System.out.println(dls.setSigno());
        System.out.println(dls.setParte3());
        System.out.println(dls.setTerminosX());
        dls.operar(dls.setNumeros());

    }

}
