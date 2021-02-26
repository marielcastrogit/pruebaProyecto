/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.funciones;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Kenneth Granados
 */
public class GraficaFuncion {
    JFreeChart grafica;
    XYSeriesCollection datos = new XYSeriesCollection();
    String name,x,y;

    public GraficaFuncion() {
        this("Sin titulo","x","Y");
    }

    public GraficaFuncion(String name, String x, String y) {
        this.name = name;
        this.x = x;
        this.y = y;
        grafica=ChartFactory.createXYLineChart(name, x, y, datos, PlotOrientation.VERTICAL, true, true, true);
     
    }
    
    public void AgregarGrafica(String id,double[] x,double[] y){
        XYSeries s = new XYSeries(id);
        int n = x.length;
        for (int i = 0; i < n; i++) {
            s.add(x[i],y[i]);
        }
        datos.addSeries(s);
    }
    
    public void CrearGrafica(String id,double[] x,double[] y){
        datos.removeAllSeries();
        AgregarGrafica(id, x, y);
    }
    
    public void LimpiarGrafica(){
        datos.removeAllSeries();
    }
    public JPanel ObtenerGrafica(){
        return new ChartPanel(grafica);
    }
}
