package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.otros.Sonido;
import views.Documento;
import views.DocumentoPrincipal;
import views.MainFrame;

public class DocumentoController implements MouseListener {

    private DocumentoPrincipal dp;
    private Documento d;

    public DocumentoController(DocumentoPrincipal dp) {
        this.dp = dp;
        d = new Documento();
        Documento.lblRetroceder.addMouseListener(this);
        d.setLocation(35, 18);
        d.setVisible(false);
        MainFrame.desktop.add(d);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == DocumentoPrincipal.btnVerDocumento) {
            if (MainFrame.desktop.getWidth() == 495) {
                MainFrame.desktop.setBounds(65, 103, 690, 440);
            }
            dp.setVisible(false);
            d.setVisible(true);
            MainFrame.pnlMenu.setVisible(false);
            Sonido.entrada();

            if (DocumentoPrincipal.ecLineales.isSelected()) {
                d.setVisible(true);
                d.abrirDocumento("src/resources/documentos/EcuacionesLineales.pdf");
            }
            if (DocumentoPrincipal.ecCuadraticas.isSelected()) {
                // d.abrirDocumento("src/resources/documentos/");
            }
            if (DocumentoPrincipal.inecCuadraticas.isSelected()) {
                // d.abrirDocumento("src/resources/documentos/");
            }
            if (DocumentoPrincipal.inecLineales.isSelected()) {
                d.setVisible(true);
                d.abrirDocumento("src/resources/documentos/InecuacionesLineales.pdf");
            }

            if (DocumentoPrincipal.funCuadraticas.isSelected()) {
                // d.abrirDocumento("src/resources/documentos/");
            }

            if (DocumentoPrincipal.funLineal.isSelected()) {
                // d.abrirDocumento("src/resources/documentos/");
            }

            if (DocumentoPrincipal.funCubicas.isSelected()) {
                // d.abrirDocumento("src/resources/documentos/");
            }

        }

        if (e.getSource() == Documento.lblRetroceder) {
            Documento.lblRetroceder.setBackground(new Color(255, 255, 255, 50));
            dp.setVisible(true);
            dp.redimensionar(false);
            MainFrame.pnlMenu.setSize(49, 502);
            MainFrame.pnlMenu.setVisible(true);
            d.setVisible(false);
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
        if (e.getSource() == DocumentoPrincipal.btnVerDocumento) {
           
            DocumentoPrincipal.btnVerDocumento.setSize(170, 50);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == DocumentoPrincipal.btnVerDocumento) {
            DocumentoPrincipal.btnVerDocumento.setSize(160, 30);
        }
    }

}
