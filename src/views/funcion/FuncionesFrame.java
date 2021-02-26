/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.funcion;

import controllers.funciones.FuncionController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import models.funciones.Funcion;
import models.funciones.GraficaFuncion;

/**
 *
 * @author Kenneth Granados
 */
public class FuncionesFrame extends javax.swing.JInternalFrame {

    FuncionController fc;
    GraficaFuncion grafica = new GraficaFuncion("Grafica", "Eje X", "Eje Y");
    
    public FuncionesFrame() {
        initComponents();
        setupController();
        setSize(622,408);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }
    
    public void setupController() {
        fc = new FuncionController(this);
        graficarButton.addActionListener(fc);
        agregarButton.addActionListener(fc);
        cleanButton.addActionListener(fc);
        funcTextField.addKeyListener(fc);//action de teclado
        x0TextField.addKeyListener(fc);
        xnTextField.addKeyListener(fc);
        intervaloTextField.addKeyListener(fc);
    }
    
    public void getgrafica() throws Exception {
         try {
            String func = funcTextField.getText();
            double x0 = Double.parseDouble(x0TextField.getText());
            double xn = Double.parseDouble(xnTextField.getText());
            double d = Double.parseDouble(intervaloTextField.getText());
            Funcion f = new Funcion(func);
            double[] x = f.Rango(x0, xn, d);
            double[] y = f.evaluar(x);
            grafica.CrearGrafica(func, x, y);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Chingue su madre" + e.getMessage());
            }
               
    
    }

    public void addgrafica() throws Exception {
        try {
            String func = funcTextField.getText();
            double x0 = Double.parseDouble(x0TextField.getText());
            double xn = Double.parseDouble(xnTextField.getText());
            double d = Double.parseDouble(intervaloTextField.getText());
            Funcion f = new Funcion(func);
            double[] x = f.Rango(x0, xn, d);
            double[] y = f.evaluar(x);
            grafica.AgregarGrafica(func, x, y);
       
        } catch (NumberFormatException ex) {
            Logger.getLogger(FuncionesFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clean() {
        funcTextField.setText("");
        x0TextField.setText("");
        xnTextField.setText("");
        intervaloTextField.setText("");
        grafica.LimpiarGrafica();
    }

    public JTextField getFuncTextField() {
        return funcTextField;
    }

    public JTextField getX0TextField() {
        return x0TextField;
    }

    public JTextField getXnTextField() {
        return xnTextField;
    }

    public JTextField getIntervaloTextField() {
        return intervaloTextField;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        funcTextField = new javax.swing.JTextField();
        x0TextField = new javax.swing.JTextField();
        xnTextField = new javax.swing.JTextField();
        intervaloTextField = new javax.swing.JTextField();
        graficarButton = new javax.swing.JButton();
        agregarButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        Panel = grafica.ObtenerGrafica()
        ;
        jPanel2 = new javax.swing.JPanel();
        lblRetroceder = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setTitle("Funciones");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Función");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Desde");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Hasta");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Intervalo");

        funcTextField.setBackground(new java.awt.Color(255, 255, 255));
        funcTextField.setForeground(new java.awt.Color(0, 0, 0));
        funcTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        x0TextField.setBackground(new java.awt.Color(255, 255, 255));
        x0TextField.setForeground(new java.awt.Color(0, 0, 0));
        x0TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        xnTextField.setBackground(new java.awt.Color(255, 255, 255));
        xnTextField.setForeground(new java.awt.Color(0, 0, 0));
        xnTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        intervaloTextField.setBackground(new java.awt.Color(255, 255, 255));
        intervaloTextField.setForeground(new java.awt.Color(0, 0, 0));
        intervaloTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        graficarButton.setBackground(new java.awt.Color(0, 0, 0));
        graficarButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        graficarButton.setForeground(new java.awt.Color(255, 255, 255));
        graficarButton.setText("Graficar");

        agregarButton.setBackground(new java.awt.Color(0, 0, 0));
        agregarButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        agregarButton.setForeground(new java.awt.Color(255, 255, 255));
        agregarButton.setText("Agregar");

        cleanButton.setBackground(new java.awt.Color(0, 0, 0));
        cleanButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cleanButton.setForeground(new java.awt.Color(255, 255, 255));
        cleanButton.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(funcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(315, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intervaloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x0TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(graficarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cleanButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(funcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x0TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(xnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(intervaloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(graficarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarButton)
                        .addGap(12, 12, 12)
                        .addComponent(cleanButton)))
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 605, 140);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(Panel);
        Panel.setBounds(10, 170, 600, 200);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons8-arrow-pointing-left-35.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRetroceder)
                .addContainerGap(561, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 620, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton cleanButton;
    private javax.swing.JTextField funcTextField;
    private javax.swing.JButton graficarButton;
    private javax.swing.JTextField intervaloTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblRetroceder;
    private javax.swing.JTextField x0TextField;
    private javax.swing.JTextField xnTextField;
    // End of variables declaration//GEN-END:variables

}
