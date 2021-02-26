package controllers;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import models.desigualdades.lineales.DesigualdadesLinealesSimples;
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
        setItemsLista();//establezco los items de la lista
        escribirProblema = new PanelEscribir();
        mostrarResultado = new PanelMostrarResultado();
        mostrarGraficaDesigualdades = new PanelGraficaDesigualdades();
        agregarPaneles();
        setControllersPanelEscribir();
        setControllersPanelResultado();
        setControllersPanelGrafica();
    }

    private void setItemsLista() {
        String[] items = new String[]{"Ecuaciones Lineales", "Ecuaciones Cuadráticas", "Desigualdades Lineales", "Desigualdades Cuadráticas", "Funciones"};
        r.getListaTemas().setModel(new DefaultComboBoxModel(items));
        r.getListaTemas().setSelectedIndex(-1);
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

    private void setControllersPanelGrafica() {
        mostrarGraficaDesigualdades.getLblRetroceder().addMouseListener(this);
    }

    private void limpiarDesigualdades() {
        escribirProblema.getTxtEscribirProblema().setText("");
        mostrarResultado.getLblMostrarIntervalo().setText("");
        mostrarResultado.getLblMostrarResultado().setText("");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //Si en la lista se selecciona un string que este en la posicion de 0 en adelante
        if (r.getListaTemas().getSelectedIndex() >= 0) {
            if (e.getSource() == r.getListaTemas()) {
                switch (r.getListaTemas().getSelectedItem().toString()) {
                    case "Ecuaciones Lineales":
                        break;
                    case "Ecuaciones Cuadráticas":

                        break;
                    case "Desigualdades Lineales":
                        limpiarDesigualdades();
                        Resolver.pnlCard.setVisible(true);
                        break;
                    case "Desigualdades Cuadráticas":
                        limpiarDesigualdades();
                        Resolver.pnlCard.setVisible(true);
                        break;
                    case "Funciones":
                        break;
                }
            }
        }
    }

    private void resolverDesigualdadLineal(String txtEscribirProblema) {

        Pattern patronLinealSimple = Pattern.compile("(([+-]*\\d*x{1})|([+-]*\\d{1,}x*))+[<|>|≥|≤](([+-]*\\d*x{1})|([+-]*\\d{1,}x*))+");
        Pattern patronLinealParentesis = Pattern.compile("");

//        int noCoincide = 0; //si no coincide con ninguna expresion regular

        if (patronLinealSimple.matcher(txtEscribirProblema).matches()) {//es de las que no tienen parentesis
            DesigualdadesLinealesSimples dls = new DesigualdadesLinealesSimples(txtEscribirProblema);
            dls.getParte1();
            dls.getSigno();
            dls.getParte3();
            mostrarResultado.getLblMostrarResultado().setText(dls.resultado());
        }
        
        
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

            //Si estamos trabajando con desigualdades lineales: 
            if (r.getListaTemas().getSelectedItem().toString().equals("Desigualdades Lineales")) {
                resolverDesigualdadLineal(escribirProblema.getTxtEscribirProblema().getText());
            }

            //Si estamos trabajando con desigualdades cuadraticas: 
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
        if (e.getSource() == mostrarGraficaDesigualdades.getLblRetroceder()) {
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
