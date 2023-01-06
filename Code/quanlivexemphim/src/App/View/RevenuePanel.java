/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.View;

import App.Dao.FilmDao;
import App.Dao.TicketDao;
import App.Model.Film;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author win10
 */
public class RevenuePanel extends JPanel {

    private ChartPanel chartPanel;

    public RevenuePanel() throws Exception {
        this.init();

        this.setVisible(true);
    }

    public void init() throws Exception {
        this.chartPanel = new ChartPanel(createChart());
        this.chartPanel.setPreferredSize(new java.awt.Dimension(850, 550));
        this.add(this.chartPanel);
        this.chartPanel.setEnabled(true);
    }

    public JFreeChart createChart() throws Exception {
        FilmDao dao = new FilmDao();
        JFreeChart barChart = ChartFactory.createBarChart(
                "BIỂU ĐỒ VÉ XEM PHIM",
                "Tên Phim", "Doanh Thu",
                createDataset(dao.select()), PlotOrientation.VERTICAL, true, true, false);
        barChart.getCategoryPlot().getRangeAxis().setUpperBound(65000 * 9);
        barChart.getCategoryPlot().getRangeAxis().setLowerBound(0);
        return barChart;
    }

    public CategoryDataset createDataset(ArrayList<Film> list) throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        TicketDao dao = new TicketDao();
        for (Film f : list) {
            double count = 0.0;
            count = dao.list2(f.getIdFilm()) * dao.price(f.getIdFilm());
            dataset.addValue(count, "Doanh Thu", f.getNameFilm());
        }
        return dataset;
    }
}
