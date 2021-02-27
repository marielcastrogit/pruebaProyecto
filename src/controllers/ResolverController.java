package controllers;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import models.desigualdades.cuadraticas.DesigualdadesCuadraticasSimples;
import models.desigualdades.lineales.DesigualdadesLinealesParentesis;
import models.desigualdades.lineales.DesigualdadesLinealesSimples;
import models.otros.Sonido;
import views.ecuacion.EcuacionesCuadraticas;
import views.ecuacion.EcuacionesLineales;
import views.MainFrame;
import views.desigualdades.PanelEscribir;
import views.desigualdades.PanelMostrarResultado;
import views.Resolver;
import static views.Resolver.pnlCard;
import views.funcion.FuncionesFrame;

public class ResolverController implements ItemListener, KeyListener, MouseListener {

    private Resolver r;
    //Desigualdades: 
    private PanelEscribir escribirProblema;
    private PanelMostrarResultado mostrarResultado;
    private JInternalFrame internoAnterior;
    private String internoAnterior1;
    //Ecuaciones: 
    private EcuacionesLineales ecl;
    private EcuacionesCuadraticas ecC;
    //Funciones: 
    private FuncionesFrame funciones;

    public ResolverController(Resolver r) {
        this.r = r;
        setItemsLista();//establezco los items de la lista

        //Desigualdades: 
        escribirProblema = new PanelEscribir();
        mostrarResultado = new PanelMostrarResultado();
        agregarPaneles();
        setControllersPanelEscribir();
        setControllersPanelResultado();
        internoAnterior = new JInternalFrame();
        internoAnterior1 = "";

        //Ecuaciones: 
        ecl = new EcuacionesLineales();
        ecC = new EcuacionesCuadraticas();
        ecl.setLocation(35, 18);
        ecC.setLocation(35, 18);
        ecl.setVisible(false);
        ecC.setVisible(false);
        MainFrame.desktop.add(ecl);
        MainFrame.desktop.add(ecC);
        controlEcuaciones();

        //Funciones: 
        funciones = new FuncionesFrame();
        funciones.setLocation(35, 18);
        funciones.setVisible(false);
        MainFrame.desktop.add(funciones);
        FuncionesFrame.lblRetroceder.addMouseListener(this);

    }

    private void setItemsLista() {
        String[] items = new String[]{"Ecuaciones Lineales", "Ecuaciones Cuadráticas", "Desigualdades Lineales", "Desigualdades Cuadráticas", "Funciones"};
        r.getListaTemas().setModel(new DefaultComboBoxModel(items));
        r.getListaTemas().setSelectedIndex(-1);
    }

    private void agregarPaneles() {
        Resolver.pnlCard.add(escribirProblema);
        Resolver.pnlCard.add(mostrarResultado);
    }

    private void setControllersPanelEscribir() {//lugar en el cual se escribe el problema
        escribirProblema.getTxtEscribirProblema().addKeyListener(this);//que se esta misma clase la que se encargue de escuchar al teclado
        escribirProblema.getBtnResultado().addMouseListener(this);
        escribirProblema.getBtnResultado().setEnabled(false);
    }

    private void setControllersPanelResultado() {//se resuelve el problema y se muestra
        mostrarResultado.getLblRetroceder().addMouseListener(this);
    }

    private void controlEcuaciones() {
        EcuacionesCuadraticas.lblRetroceder.addMouseListener(this);
        EcuacionesLineales.lblRetroceder.addMouseListener(this);
    }

    private void limpiarDesigualdades() {
        escribirProblema.getTxtEscribirProblema().setText("");

        mostrarResultado.getLblMostrarResultado().setText("");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //Si en la lista se selecciona un string que este en la posicion de 0 en adelante
        if (r.getListaTemas().getSelectedIndex() >= 0) {
            if (e.getSource() == r.getListaTemas()) {
                switch (r.getListaTemas().getSelectedItem().toString()) {
                    case "Ecuaciones Lineales":
                        //Con esta instruccion logramos ocultar el menu: 
                        if (MainFrame.desktop.getWidth() == 495) {
                            MainFrame.desktop.setBounds(65, 103, 690, 440);
                        }
                        MainFrame.pnlMenu.setVisible(false);

                        //----------------------------------------
                        if (internoAnterior1.equals("pnlCard")) {
                            pnlCard.setVisible(false);
                        }
                        internoAnterior.setVisible(false);
                        ecl.limpiar();
                        ecl.setVisible(true);
                        internoAnterior = ecl;
                        break;
                    case "Ecuaciones Cuadráticas":
                        if (MainFrame.desktop.getWidth() == 495) {
                            MainFrame.desktop.setBounds(65, 103, 690, 440);
                        }
                        MainFrame.pnlMenu.setVisible(false);

                        if (internoAnterior1.equals("pnlCard")) {
                            pnlCard.setVisible(false);
                        }
                        internoAnterior.setVisible(false);
                        ecC.limpiar();
                        ecC.setVisible(true);
                        internoAnterior = ecC;
                        break;
                    case "Desigualdades Lineales":
                        if (MainFrame.desktop.getWidth() == 495) {
                            MainFrame.desktop.setBounds(65, 103, 690, 440);
                        }
                        MainFrame.pnlMenu.setSize(49, 502);
                        limpiarDesigualdades();
                        r.redimensionar(false);
                        Resolver.pnlCard.setVisible(true);
                        internoAnterior1 = "pnlCard";
                        break;
                    case "Desigualdades Cuadráticas":
                        if (MainFrame.desktop.getWidth() == 495) {
                            MainFrame.desktop.setBounds(65, 103, 690, 440);
                        }
                        MainFrame.pnlMenu.setSize(49, 502);
                        limpiarDesigualdades();
                        r.redimensionar(false);
                        Resolver.pnlCard.setVisible(true);
                        internoAnterior1 = "pnlCard";
                        break;
                    case "Funciones":
                        if (MainFrame.desktop.getWidth() == 495) {
                            MainFrame.desktop.setBounds(65, 103, 690, 440);
                        }
                        MainFrame.pnlMenu.setVisible(false);

                        if (internoAnterior1.equals("pnlCard")) {
                            pnlCard.setVisible(false);
                        }
                        funciones.clean();
                        funciones.setVisible(true);
                        internoAnterior = funciones;
                        break;
                }
            }
        }
    }

    private void resolverDesigualdadLineal(String txtEscribirProblema) {

        Pattern patronLinealSimple = Pattern.compile("(([+-]*\\d*x{1})|([+-]*\\d{1,}x*))+[<|>|≥|≤](([+-]*\\d*x{1})|([+-]*\\d{1,}x*))+");

//        int noCoincide = 0; //si no coincide con ninguna expresion regular
        if (patronLinealSimple.matcher(txtEscribirProblema).matches()) {//es de las que no tienen parentesis
            DesigualdadesLinealesSimples dls = new DesigualdadesLinealesSimples(txtEscribirProblema);
            dls.getParte1();
            dls.getSigno();
            dls.getParte3();
            mostrarResultado.getLblMostrarResultado().setText(dls.resultado());
        }

        //para desigualdades lineales con parentesis: 
        if (txtEscribirProblema.contains("(") | txtEscribirProblema.contains(")")) {
            if (numCorrectoParentesis(txtEscribirProblema)) {
                try {
                    DesigualdadesLinealesParentesis dlp = new DesigualdadesLinealesParentesis(txtEscribirProblema);
                    mostrarResultado.getLblMostrarResultado().setText(dlp.getResultadoFinal());
                } catch (Exception ex) {
                    mostrarResultado.getLblMostrarResultado().setFont(new java.awt.Font("Dialog", Font.BOLD, 12));
                    mostrarResultado.getLblMostrarResultado().setText("No es lineal");
                }
            } else {
                mostrarResultado.getLblMostrarResultado().setFont(new java.awt.Font("Dialog", Font.BOLD, 12));
                mostrarResultado.getLblMostrarResultado().setText("Ubicación de paréntesis incorrecta");
            }
        }

        if (txtEscribirProblema.contains("x^2") && !txtEscribirProblema.contains(")") && !txtEscribirProblema.contains("(")) {
            try {
                DesigualdadesCuadraticasSimples dcs = new DesigualdadesCuadraticasSimples(txtEscribirProblema);
                mostrarResultado.getLblMostrarResultado().setText(dcs.resolver());
            } catch (Exception ex) {
            }
        }

    }

    private void resolverDesigualdadCuadratica(String txtEscribirProblema) {
        if (txtEscribirProblema.contains("x^2") && !txtEscribirProblema.contains(")") && !txtEscribirProblema.contains("(")) {
            DesigualdadesCuadraticasSimples dcs = new DesigualdadesCuadraticasSimples(txtEscribirProblema);
            mostrarResultado.getLblMostrarResultado().setText(dcs.resolver());
        }
    }

    private boolean numCorrectoParentesis(String cadena) {
        char[] toCharArray = cadena.toCharArray();
        int numParentesisApertura = 0, numParentesisCierre = 0;
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] == '(') {
                numParentesisApertura++;
            }
            if (toCharArray[i] == ')') {
                numParentesisCierre++;
            }
        }
        if (numParentesisApertura == numParentesisCierre) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Sonido.teclado();
        if (e.getKeyChar() == ' ') {
            e.consume();
        }
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
            if (!escribirProblema.getTxtEscribirProblema().getText().isEmpty()) {
                escribirProblema.setVisible(false);
                mostrarResultado.setVisible(true);
                r.getListaTemas().setEnabled(false);
            }

            //Si estamos trabajando con desigualdades lineales: 
            if (r.getListaTemas().getSelectedItem().toString().equals("Desigualdades Lineales")) {
                try {
                    resolverDesigualdadLineal(escribirProblema.getTxtEscribirProblema().getText());
                } catch (Exception ex) {
                }

                if (mostrarResultado.getLblMostrarResultado().getText().isEmpty()) {
                    mostrarResultado.getLblMostrarResultado().setText("Solucion no encontrada");
                }
            }

            //Si estamos trabajando con desigualdades cuadraticas: 
            if (r.getListaTemas().getSelectedItem().toString().equals("Desigualdades Cuadráticas")) {
                try {
                    resolverDesigualdadCuadratica(escribirProblema.getTxtEscribirProblema().getText());
                } catch (Exception ex) {
                }

                if (mostrarResultado.getLblMostrarResultado().getText().isEmpty()) {
                    mostrarResultado.getLblMostrarResultado().setText("Solucion no encontrada");
                }
            }
        }
        //////////////////////////////////////////////////////////////////////////////////////////

        //Boton que me lleva a ver la grafica:
        //Flecha de retroceso en el panel que muestra el resultado que me lleva a escribir el problema
        if (e.getSource() == mostrarResultado.getLblRetroceder()) {

            mostrarResultado.setVisible(false);
            r.getListaTemas().setEnabled(true);
            escribirProblema.setVisible(true);
        }

        //Flecha de retroceso en el panel de las graficas que me lleva a ver el resultado
        //////////////////////////////////////////////////////////////////////////
        //Ecuaciones
        if (e.getSource() == EcuacionesCuadraticas.lblRetroceder) {
            ecC.setVisible(false);
            r.getListaTemas().setSelectedItem(null);
            MainFrame.pnlMenu.setSize(49, 502);
            MainFrame.pnlMenu.setVisible(true);
            MainFrame.desktop.setBounds(65, 103, 690, 440);
            if (MainFrame.desktop.getWidth() == 690) {
                r.redimensionar(false);
            } else {
                r.redimensionar(true);
            }
            r.setVisible(true);
        }

        if (e.getSource() == EcuacionesLineales.lblRetroceder) {
            ecl.setVisible(false);
            r.getListaTemas().setSelectedItem(null);
            MainFrame.pnlMenu.setSize(49, 502);
            MainFrame.pnlMenu.setVisible(true);
            MainFrame.desktop.setBounds(65, 103, 690, 440);
            if (MainFrame.desktop.getWidth() == 690) {
                r.redimensionar(false);
            } else {
                r.redimensionar(true);
            }
            r.setVisible(true);
        }

        if (e.getSource() == FuncionesFrame.lblRetroceder) {
            funciones.setVisible(false);
            r.getListaTemas().setSelectedItem(null);
            MainFrame.pnlMenu.setSize(49, 502);
            MainFrame.pnlMenu.setVisible(true);
            MainFrame.desktop.setBounds(65, 103, 690, 440);
            if (MainFrame.desktop.getWidth() == 690) {
                r.redimensionar(false);
            } else {
                r.redimensionar(true);
            }
            r.setVisible(true);
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
        if (e.getSource() == escribirProblema.getBtnResultado()) {
            if (!escribirProblema.getTxtEscribirProblema().getText().isEmpty()) {
                escribirProblema.getBtnResultado().setEnabled(true);
            } else {
                escribirProblema.getBtnResultado().setEnabled(false);
            }
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
