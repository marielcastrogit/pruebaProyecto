package controllers;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import models.otros.Sonido;
import views.Ajustes;
import static views.Ajustes.lblSonido;
import views.MainFrame;
import views.temas.pnlTema1;
import views.temas.Tema1G;
import views.temas.Tema2G;
import views.temas.Tema3G;
import views.temas.pnlTema2;
import views.temas.pnlTema3;

/**
 * @author MarielCastro
 */
public class AjustesControllers implements MouseListener {
    
    public static pnlTema1 sTema1;
    public static pnlTema2 sTema2;
    public static pnlTema3 sTema3;
    private Ajustes ajustes;
    private Tema1G gTema1;
    private Tema2G gTema2;
    private Tema3G gTema3;
    private JPanel panelAnterior;
    public static String tema;
    private int x;
    private MainFrame mf;
    
    public AjustesControllers(Ajustes ajustes) {
        this.ajustes = ajustes;
        mf = MainFrameController.mf;
        
        x = 0;
        tema = "";
        panelAnterior = new JPanel();
        sTema1 = new pnlTema1();
        sTema2 = new pnlTema2();
        sTema3 = new pnlTema3();
        
        gTema1 = new Tema1G();
        gTema2 = new Tema2G();
        gTema3 = new Tema3G();
        
        gTema1.setLocation(35, 18);
        gTema1.setVisible(false);
        MainFrame.desktop.add(gTema1);
        
        gTema2.setLocation(35, 18);
        gTema2.setVisible(false);
        MainFrame.desktop.add(gTema2);
        
        gTema3.setLocation(35, 18);
        gTema3.setVisible(false);
        MainFrame.desktop.add(gTema3);
        
        sTema1.setVisible(true);
        Ajustes.pnlMostrarTemas.add(sTema1);
        sTema1.addMouseListener(this);
        
        sTema2.setVisible(false);
        Ajustes.pnlMostrarTemas.add(sTema2);
        sTema2.addMouseListener(this);
        
        sTema3.setVisible(false);
        Ajustes.pnlMostrarTemas.add(sTema3);
        sTema3.addMouseListener(this);
        
        tema = "com.jtatto.plaf.aero.AeroLookAndFeel";
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Sonido.icono();
        if (e.getSource() == ajustes.lblSonido) {
            x++;
            
            if (x % 2 != 0) {
                ajustes.lblSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-no-audio-35.png")));
                Sonido.setSonido(true);
                
            } else {
                lblSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-audio-35.png")));
                Sonido.setSonido(false);
            }
        }
        
        if (e.getSource() == Ajustes.btnSiguienteTema) {
            if (sTema1.isVisible()) {
                sTema1.setVisible(false);
                sTema2.setVisible(true);
                Ajustes.btnTemaAnterior.setVisible(true);
                Ajustes.btnSiguienteTema.setVisible(true);
                panelAnterior = sTema1;
                tema = "com.formdev.flatlaf.FlatDarculaLaf";
            } else if (sTema2.isVisible()) {
                sTema2.setVisible(false);
                sTema3.setVisible(true);
                Ajustes.btnSiguienteTema.setVisible(false);
                Ajustes.btnTemaAnterior.setVisible(true);
                panelAnterior = sTema2;
                tema = "com.jtattoo.plaf.noire.NoireLookAndFeel";
            }
            
        }
        
        if (e.getSource() == Ajustes.btnTemaAnterior) {
            if (sTema3.isVisible()) {
                sTema3.setVisible(false);
                sTema2.setVisible(true);
                MainFrame.s = true;
                
            } else if (sTema2.isVisible()) {
                sTema2.setVisible(false);
                sTema1.setVisible(true);
                Ajustes.btnTemaAnterior.setVisible(false);
                Ajustes.btnSiguienteTema.setVisible(true);
                tema = "com.jtatto.plaf.aero.AeroLookAndFeel";
            }
            {
                
            }
        }
        
//        if (e.getSource() == Ajustes.btnAplicarTema) {
//            try {
//                UIManager.setLookAndFeel("com.jtatto.plaf.aero.AeroLookAndFeel");
//            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//                
//            }
//            SwingUtilities.updateComponentTreeUI(mf);
//            
//        }
    }

//
//            try {
//
//                LookAndFeelInfo tema = UIManager.getInstalledLookAndFeels()[];
//            } catch () {
//            }
    @Override
    public void mousePressed(MouseEvent e
    ) {
        
    }
    
    @Override
    public void mouseReleased(MouseEvent e
    ) {
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e
    ) {
        if (e.getSource() == sTema1) {
            if (MainFrame.desktop.getWidth() == 690) {
                gTema1.setVisible(true);
            }
        }
        
        if (e.getSource() == sTema2) {
            
            if (MainFrame.desktop.getWidth() == 690) {
                ajustes.setVisible(false);
                gTema2.setVisible(true);
            }
        }
        
        if (e.getSource() == sTema3) {
            if (MainFrame.desktop.getWidth() == 690) {
                gTema3.setVisible(true);
            }
        }
        
    }
    
    @Override
    public void mouseExited(MouseEvent e
    ) {
        if (e.getSource() == sTema1) {
            if (MainFrame.desktop.getWidth() == 690) {
                gTema1.setVisible(false);
            }
        }
        
        if (e.getSource() == sTema2) {
            if (MainFrame.desktop.getWidth() == 690) {
                ajustes.setVisible(true);
                gTema2.setVisible(false);
            }
        }
        
        if (e.getSource() == sTema3) {
            if (MainFrame.desktop.getWidth() == 690) {
                gTema3.setVisible(false);
            }
        }
        
    }
    
}
