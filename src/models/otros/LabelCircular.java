
package models.otros;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.border.AbstractBorder;


public class LabelCircular extends JLabel {

   private AbstractBorder circleBorder = new BordeCircular();       
   private int lineBorder=1; 
   private Color lineColor= Color.BLACK;

    /** Constructor */
     public LabelCircular()
     {
        Dimension d = new Dimension(100,100);
        setSize(d);
        setPreferredSize(d);       
        setText("CLabel");
        setOpaque(true);
        setHorizontalAlignment(CENTER);       
        setVisible(true);       
        setBorder(circleBorder); 
     }

    //Color de borde
    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color color) {
        circleBorder = new BordeCircular(color, lineBorder);
        lineColor = color;
        setBorder(circleBorder); 
    }

    //Grosor de borde
    public int getLineBorder() {
        return lineBorder;        
    }

    public void setLineBorder(int lineBorder) {
        circleBorder = new BordeCircular(lineColor, lineBorder);
        this.lineBorder = lineBorder;        
        setBorder(circleBorder); 
    }
}
