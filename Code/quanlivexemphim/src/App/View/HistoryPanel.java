/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package App.View;

import App.Dao.FilmDao;
import App.Model.Film;
import App.Model.Ticket_model;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author win10
 */
public class HistoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form HistoryPanel
     */
    private DefaultTableModel dtbModel = new DefaultTableModel();
    public HistoryPanel() {
        initComponents();
    }

    public void setList(ArrayList<Ticket_model> list){
        dtbModel = (DefaultTableModel) jTable_history.getModel();
        FilmDao dao = new FilmDao();
        Film film = new Film();
        dtbModel.setRowCount(0);
        for(Ticket_model t : list){
            try {
                film = dao.check(t.getIdFilm());
            } catch (Exception ex) {
                Logger.getLogger(HistoryPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            String[] row = new String[]{
                t.getPhoneNumber(),t.getIdTicket(),film.getNameFilm(),t.getPrice()+""
            };
            dtbModel.addRow(row);
        }
        dtbModel.fireTableDataChanged();
        
    }
//    public void setHistory(){
//        dtbModel = (DefaultTableModel) jTable_history.getModel();
//        FilmDao dao = new FilmDao();
//        Film film = new Film();
//        dtbModel.setRowCount(0);
//        for(Ticket_model t : list){
//            System.out.println(t.getIdTicket());
//            try {
//                film = dao.check(t.getIdFilm());
//            } catch (Exception ex) {
//                Logger.getLogger(HistoryPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            String[] row = new String[]{
//                t.getPhoneNumber(),t.getIdTicket(),film.getNameFilm(),t.getPrice()+""
//            };
//            dtbModel.addRow(row);
//        }
//        dtbModel.fireTableDataChanged();
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_history = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Lịch sử");

        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTable_history.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Số Điện Thoại", "ID vé", "Tên Phim", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_history);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_history;
    // End of variables declaration//GEN-END:variables
}
