package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.otros.Sonido;
import views.PanelEscribir;
import views.PanelGraficaDesigualdades;
import views.PanelMostrarResultado;
import views.Resolver;

public class ResolverController implements ItemListener, KeyListener, MouseListener {

    private Resolver r;
    private PanelEscribir escribirProblema;
    private PanelMostrarResultado mostrarResultado;
    private PanelGraficaDesigualdades mostrarGraficaDesigualdades;

    public ResolverController(Resolver r) {
        this.r = r;
        escribirProblema = new PanelEscribir();
        mostrarResultado = new PanelMostrarResultado();
        mostrarGraficaDesigualdades = new PanelGraficaDesigualdades();
        agregarPaneles();
        setControllersPanelEscribir();
        setControllersPanelResultado();
        setControllersPanelGrafica();
    }

    private void agregarPaneles() {
        Resolver.pnlCard.add(escribirProblema);
        Resolver.pnlCard.add(mostrarResultado);
        Resolver.pnlCard.add(mostrarGraficaDesigualdades);
    }

    private void setControllersPanelEscribir() {//lugar en el cual se escribe el problema
        escribirProblema.getTxtEscribirProblema().addKeyListener(this);//que se esta misma clase la que se encargue de escuchar al teclado
        escribirProblema.getBtnResultado().addMouseListener(this);
    }

    private void setControllersPanelResultado() {//se resuelve el problema y se muestra
        mostrarResultado.getBtnGrafica().addMouseListener(this);
        mostrarResultado.getLblRetroceder().addMouseListener(this);
    }
     private void setControllersPanelGrafica(){
         mostrarGraficaDesigualdades.getLblRetroceder().addMouseListener(this);
     }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        Sonido.teclado();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Boton de mostrar resultado, panel en el cual se escribe el problema: 
        if (e.getSource() == escribirProblema.getBtnResultado()) {
            escribirProblema.setVisible(false);
            mostrarResultado.setVisible(true);
            r.getListaTemas().setEnabled(false);
        }

        //Boton que me lleva a ver la grafica:
        if (e.getSource() == mostrarResultado.getBtnGrafica()) {
            mostrarResultado.setVisible(false);
            mostrarGraficaDesigualdades.setVisible(true);
            r.getListaTemas().setEnabled(false);
        }

        //Flecha de retroceso en el panel que muestra el resultado que me lleva a escribir el problema
        if (e.getSource() == mostrarResultado.getLblRetroceder()) {
            mostrarResultado.setVisible(false);
            r.getListaTemas().setEnabled(true);
            escribirProblema.setVisible(true);
        }
        
        //Flecha de retroceso en el panel de las graficas que me lleva a ver el resultado
        if(e.getSource() == mostrarGraficaDesigualdades.getLblRetroceder()){
            mostrarGraficaDesigualdades.setVisible(false);
            mostrarResultado.setVisible(true);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }

}
