/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.desigualdades.lineales;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**lo que sale en azul es lo que se elimina
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dat = "-3x+4-9x<11-2x+6x";
        System.out.println( new DesigualdadesLinealesSimples(dat).setParte1());
        System.out.println( new DesigualdadesLinealesSimples(dat).setSigno());
        System.out.println( new DesigualdadesLinealesSimples(dat).setParte3());
        System.out.println( new DesigualdadesLinealesSimples(dat).setTerminosX());
        System.out.println( new DesigualdadesLinealesSimples(dat).setNumeros());
        
        
    }

}
