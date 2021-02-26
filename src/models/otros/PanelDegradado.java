/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.otros;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author Mariel
 */
public class PanelDegradado extends JPanel {

    Color c1, c2;
    //new Color(r,g,b)

    public PanelDegradado() {
        c1 = new Color(59, 10, 86);
        c2 = new Color(20, 194, 115);
    }
    
    public PanelDegradado(Color c1, Color c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public void paintComponent(Graphics g) {
        //Cast de Graphics a Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        Rectangle panel = g2.getClipBounds();
   
        Point p1 = new Point(panel.width / 4, 0);

        Point p2 = new Point(panel.width / 2, 0);

        g2.setPaint(new GradientPaint(p1, c1, p2,c2 ));
        //Ahora llamanos al metodo fillRect para que rellene el rectangulo, es decir al label con el degradado
        //**El metodo getClipBounds lo que hace es devolver el area delimitada en la que se encuentra el label(rectangulo)
        //x,y es la localizacion y width, height es el ancho, alto respectivamente
        g2.fillRect(g2.getClipBounds().x, g2.getClipBounds().y, g2.getClipBounds().width, g2.getClipBounds().height);

    }

    public void setColor1(Color c1) {
        this.c1 = c1;
    }

    public void setColor2(Color c2) {
        this.c2 = c2;
    }
}
