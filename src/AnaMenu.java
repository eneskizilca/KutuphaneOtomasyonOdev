
import javax.swing.JOptionPane;
import pages.KitapEkle;
import pages.KitapListele;
import pages.KullaniciEkle;
import pages.KullaniciListele;

//654,548
public class AnaMenu extends javax.swing.JFrame {

    public AnaMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        dpnEkran = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuItemAddUser = new javax.swing.JMenuItem();
        menuItemListUsers = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemAddBook = new javax.swing.JMenuItem();
        menuItemListBooks = new javax.swing.JMenuItem();
        menuQuit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fırat Üniversitesi Kütüphane Otomasyonu");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kütüphaneye hoş geldiniz!");

        dpnEkran.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpnEkranLayout = new javax.swing.GroupLayout(dpnEkran);
        dpnEkran.setLayout(dpnEkranLayout);
        dpnEkranLayout.setHorizontalGroup(
            dpnEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        dpnEkranLayout.setVerticalGroup(
            dpnEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KIZILCA TECHNOLOGY ® • 2024");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Helvetica Neue", 1, 26)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(3, 6, 3, 6));

        menuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Home.png"))); // NOI18N
        menuHome.setText("Ana Sayfa");
        menuHome.setFont(new java.awt.Font("Helvetica Neue", 1, 21)); // NOI18N
        menuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuHome);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Account.png"))); // NOI18N
        jMenu1.setText("Kullanıcı İşlemleri");
        jMenu1.setFont(new java.awt.Font("Helvetica Neue", 1, 21)); // NOI18N

        menuItemAddUser.setText("Kullanıcı Ekle");
        menuItemAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddUserActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemAddUser);

        menuItemListUsers.setText("Kullanıcıları Listele");
        menuItemListUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListUsersActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemListUsers);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Book Shelf.png"))); // NOI18N
        jMenu2.setText("Kitap İşlemleri");
        jMenu2.setFont(new java.awt.Font("Helvetica Neue", 1, 21)); // NOI18N

        menuItemAddBook.setText("Kitap Ekle");
        menuItemAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddBookActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemAddBook);

        menuItemListBooks.setText("Kitapları Listele");
        menuItemListBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListBooksActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemListBooks);

        jMenuBar1.add(jMenu2);

        menuQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close Window.png"))); // NOI18N
        menuQuit.setText("Çıkış");
        menuQuit.setFont(new java.awt.Font("Helvetica Neue", 1, 21)); // NOI18N
        menuQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuQuitMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuQuit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dpnEkran)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpnEkran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddUserActionPerformed
        KullaniciEkle kullaniciEkle = new KullaniciEkle();
        this.dpnEkran.add(kullaniciEkle);
        kullaniciEkle.show();
    }//GEN-LAST:event_menuItemAddUserActionPerformed

    private void menuItemListUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListUsersActionPerformed
        KullaniciListele kullaniciListele = new KullaniciListele();
        this.dpnEkran.add(kullaniciListele);
        kullaniciListele.show();
    }//GEN-LAST:event_menuItemListUsersActionPerformed

    private void menuQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuQuitMouseClicked
        int onay = JOptionPane.showConfirmDialog(rootPane, "Çıkmak istiyor musunuz?", "UYARI!", JOptionPane.YES_NO_OPTION);

        if (onay == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_menuQuitMouseClicked

    private void menuItemListBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListBooksActionPerformed
        KitapListele kitapListele = new KitapListele();
        this.dpnEkran.add(kitapListele);
        kitapListele.show();
    }//GEN-LAST:event_menuItemListBooksActionPerformed

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked

    }//GEN-LAST:event_menuHomeMouseClicked

    private void menuItemAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddBookActionPerformed
        KitapEkle kitapEkle = new KitapEkle();
        this.dpnEkran.add(kitapEkle);
        kitapEkle.show();
    }//GEN-LAST:event_menuItemAddBookActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnEkran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenuItem menuItemAddBook;
    private javax.swing.JMenuItem menuItemAddUser;
    private javax.swing.JMenuItem menuItemListBooks;
    private javax.swing.JMenuItem menuItemListUsers;
    private javax.swing.JMenu menuQuit;
    // End of variables declaration//GEN-END:variables
}
