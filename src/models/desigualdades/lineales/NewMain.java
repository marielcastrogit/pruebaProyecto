/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.desigualdades.lineales;

public class NewMain {

    /**
     * lo que sale en azul es lo que se elimina
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dat = "x-4-2-4<3+2+6-2x-3x-3x";
        DesigualdadesLinealesSimples dls = new DesigualdadesLinealesSimples(dat);
        dls.setParte1();
        dls.setSigno();
        dls.setParte3();
        System.out.println("numeros:");
        System.out.println(dls.operar(dls.setNumeros()));
        System.out.println();
        System.out.println("numeros x:");
        System.out.println(dls.operar(dls.setTerminosX()));

    }

}
