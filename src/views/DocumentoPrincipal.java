package views;

import controllers.DocumentoController;
import java.awt.CheckboxGroup;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Mariel
 */
public class DocumentoPrincipal extends javax.swing.JInternalFrame {
    
    public DocumentoPrincipal() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setControllers();
    }
    
    private void setControllers() {
        dc = new DocumentoController(this);
        btnVerDocumento.addMouseListener(dc);
    }
    
    private DocumentoController dc;
    
    public void redimensionar(boolean redimensionar) {
        if (redimensionar) {
            System.out.println("HACIENDO MAS PEQUEÑO");
            this.setSize(459, 412);
            jLabel1.setBounds(0, 0, 450, 390);
            jPanel1.setBounds(10, 20, 250, 290);
            jPanel2.setBounds(260, 20, 180, 120);
            btnVerDocumento.setBounds(160, 330, 160, 30);    
        } else {
            this.setSize(622, 408);
            ecLineales.setBounds(20, 30, 160, 28);
            ecCuadraticas.setBounds(20, 80, 180, 28);
            inecLineales.setBounds(20, 130, 170, 28);
            inecCuadraticas.setBounds(20, 180, 180, 28);
            funLineal.setBounds(20, 230, 160, 28);
            btnVerDocumento.setBounds(390, 290, 160, 30);
            funCuadraticas.setBounds(20, 20, 170, 28);
            funCubicas.setBounds(20, 60, 150, 28);
            jPanel2.setBounds(360, 30, 210, 120);
            jLabel1.setBounds(0, 0, 622, 408);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ecLineales = new javax.swing.JRadioButton();
        ecCuadraticas = new javax.swing.JRadioButton();
        inecLineales = new javax.swing.JRadioButton();
        inecCuadraticas = new javax.swing.JRadioButton();
        funLineal = new javax.swing.JRadioButton();
        btnVerDocumento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        funCuadraticas = new javax.swing.JRadioButton();
        funCubicas = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        setMaximumSize(new java.awt.Dimension(622, 408));
        setMinimumSize(new java.awt.Dimension(622, 408));
        setPreferredSize(new java.awt.Dimension(622, 408));
        getContentPane().setLayout(null);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        grupoBotones.add(ecLineales);
        ecLineales.setForeground(new java.awt.Color(255, 255, 255));
        ecLineales.setText("Ecuaciones Lineales");
        jPanel1.add(ecLineales);
        ecLineales.setBounds(20, 30, 160, 28);

        grupoBotones.add(ecCuadraticas);
        ecCuadraticas.setForeground(new java.awt.Color(255, 255, 255));
        ecCuadraticas.setText("Ecuaciones Cuadráticas");
        jPanel1.add(ecCuadraticas);
        ecCuadraticas.setBounds(20, 80, 180, 28);

        grupoBotones.add(inecLineales);
        inecLineales.setForeground(new java.awt.Color(255, 255, 255));
        inecLineales.setText("Inecuaciones Lineales");
        jPanel1.add(inecLineales);
        inecLineales.setBounds(20, 130, 170, 28);

        grupoBotones.add(inecCuadraticas);
        inecCuadraticas.setForeground(new java.awt.Color(255, 255, 255));
        inecCuadraticas.setText("Inecuaciones Cuadráticas");
        jPanel1.add(inecCuadraticas);
        inecCuadraticas.setBounds(20, 180, 180, 28);

        grupoBotones.add(funLineal);
        funLineal.setForeground(new java.awt.Color(255, 255, 255));
        funLineal.setText("Funciones Lineales");
        jPanel1.add(funLineal);
        funLineal.setBounds(20, 230, 160, 28);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 30, 250, 290);

        btnVerDocumento.setBackground(new java.awt.Color(0, 0, 0));
        btnVerDocumento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVerDocumento.setForeground(new java.awt.Color(255, 255, 255));
        btnVerDocumento.setText("Visualizar documento");
        getContentPane().add(btnVerDocumento);
        btnVerDocumento.setBounds(390, 290, 160, 30);

        jPanel2.setLayout(null);

        grupoBotones.add(funCuadraticas);
        funCuadraticas.setForeground(new java.awt.Color(255, 255, 255));
        funCuadraticas.setText("Funciones Cuadráticas");
        jPanel2.add(funCuadraticas);
        funCuadraticas.setBounds(20, 20, 170, 28);

        grupoBotones.add(funCubicas);
        funCubicas.setForeground(new java.awt.Color(255, 255, 255));
        funCubicas.setText("Funciones Cubicas");
        jPanel2.add(funCubicas);
        funCubicas.setBounds(20, 60, 150, 28);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(360, 30, 210, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/fondoOM.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 622, 408);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnVerDocumento;
    public static javax.swing.JRadioButton ecCuadraticas;
    public static javax.swing.JRadioButton ecLineales;
    public static javax.swing.JRadioButton funCuadraticas;
    public static javax.swing.JRadioButton funCubicas;
    public static javax.swing.JRadioButton funLineal;
    public static javax.swing.ButtonGroup grupoBotones;
    public static javax.swing.JRadioButton inecCuadraticas;
    public static javax.swing.JRadioButton inecLineales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
