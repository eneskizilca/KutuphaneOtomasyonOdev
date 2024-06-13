package pages;

import database.DataAccessLayer;
import database.KitapDataAccess;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import management.KullaniciYonetimi;
import entities.*;
import java.sql.Connection;
import management.KullaniciYonetimi;
import database.KullaniciDataAccess;
import java.util.List;

public class KullaniciListele extends javax.swing.JInternalFrame {

    private Connection con;
    KullaniciDataAccess kullaniciDataAccess = new KullaniciDataAccess();
    KullaniciYonetimi kullaniciYonetimi = new KullaniciYonetimi();

    public KullaniciListele() {
        initComponents();
        con = DataAccessLayer.baglantiKur(con);
        fillKullaniciTable();
    }

    private void fillKullaniciTable() {

        List<Kullanici> kullanicilar = kullaniciDataAccess.getAllKullanicilar();

        String[] columnNames = {"İsim", "Soyisim", "TC", "Rol"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Kullanici kullanici : kullanicilar) {
            Object[] row = {kullanici.getIsim(), kullanici.getSoyisim(), kullanici.getTC(), kullanici.getRol()};
            model.addRow(row);
        }

        tblKullanicilar.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKullanicilar = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Kullanıcı Listele");
        setName(""); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 660, 481));
        setPreferredSize(new java.awt.Dimension(660, 481));
        setSize(new java.awt.Dimension(660, 481));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblKullanicilar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblKullanicilar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
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
    public javax.swing.JTable tblKullanicilar;
    // End of variables declaration//GEN-END:variables
}
