package management;

import database.DataAccessLayer;
import java.sql.*;
import entities.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pages.*;

public class KullaniciYonetimi {

    Connection con = null;

    public KullaniciYonetimi() {
        con = DataAccessLayer.baglantiKur(con); // con nesnesini başlatıyoruz
    }

    public void kullaniciEkle(Kullanici kullanici) {
        String sorgu = "INSERT INTO kullanicilar (isim, soyisim, TC, rol, parola) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = con.prepareStatement(sorgu)) {
            preparedStatement.setString(1, kullanici.getIsim());
            preparedStatement.setString(2, kullanici.getSoyisim());
            preparedStatement.setString(3, kullanici.getTC());
            preparedStatement.setString(4, kullanici.getRol());
            preparedStatement.setString(5, kullanici.getSifre());

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt başarıyla eklendi!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lütfen girdiğiniz değerleri kontrol ediniz. Hata: " + ex.getMessage(), "Hata Mesajı!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
}    