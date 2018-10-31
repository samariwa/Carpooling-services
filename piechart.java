/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matatu.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author samue
 */
public class piechart extends JFrame
{
    public piechart(String appTitle,String chartTitle)
    {
        PieDataset dataset=createDataset();
        JFreeChart chart=createchart(dataset,chartTitle);
        ChartPanel chartPanel=new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1800, 900));
        setContentPane(chartPanel);
    }
    private PieDataset createDataset() 
    {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Donholm" , new Double(100) );  
      dataset.setValue( "Kitengela" , new Double(80) );   
      dataset.setValue( "Langata" , new Double(40) );    
      dataset.setValue( "Westlands" , new Double(10) );  
      return dataset;    
    }
    private JFreeChart createchart(PieDataset dataset,String title)
    {
        JFreeChart chart=ChartFactory.createPieChart3D(title, dataset, true, true, true);
        PiePlot3D plot=(PiePlot3D)chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;            
    }
    
}
