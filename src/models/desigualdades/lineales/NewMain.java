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
        String dat = "-2x-3x+4+87<11+9x+76";
        System.out.println( new DesigualdadesLinealesSimples(dat).setParte1());
    }

}
