package pages;

import database.DataAccessLayer;
import database.KitapDataAccess;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import management.KitapYonetimi;
import entities.*;
import java.sql.*;
import java.util.List;

public class KitapListele extends javax.swing.JInternalFrame {

    private Connection con;
    KitapDataAccess kitapDataAccess = new KitapDataAccess();
    KitapYonetimi kitapYonetimi = new KitapYonetimi();
    
    public KitapListele() {
        initComponents();
        con = DataAccessLayer.baglantiKur(con);
        fillKitapTable();
    }

    private void fillKitapTable() {
        
        List<Kitap> kitaplar = kitapDataAccess.getAllKitaplar();

        String[] columnNames = {"ISBN", "Kitap Adı", "Yazar", "Türü", "Sayfa Sayısı"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Kitap kitap : kitaplar) {
            Object[] row = {kitap.getISBN(), kitap.getKitapAdi(), kitap.getYazar(), kitap.getTuru(), kitap.getSayfaSayisi()};
            model.addRow(row);
        }

        tblKitaplar.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKitaplar = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Kitap Listele");
        setNormalBounds(new java.awt.Rectangle(0, 0, 660, 481));
        setPreferredSize(new java.awt.Dimension(660, 481));
        setSize(new java.awt.Dimension(660, 481));

        tblKitaplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblKitaplar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKitaplar;
    // End of variables declaration//GEN-END:variables
}
