package management;

import database.DataAccessLayer;
import java.sql.*;
import entities.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pages.*;

public class KitapYonetimi {

    Connection con = null;

    public KitapYonetimi() {
        con = DataAccessLayer.baglantiKur(con); // con nesnesini başlatıyoruz
    }
    
    public void kitapEkle(Kitap kitap) {
        String sorgu = "INSERT INTO kitaplar (ISBN, adi, sayfa_sayisi, yazar, tur) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = con.prepareStatement(sorgu)) {
            preparedStatement.setString(1, kitap.getISBN());
            preparedStatement.setString(2, kitap.getKitapAdi());
            preparedStatement.setInt(3, kitap.getSayfaSayisi());
            preparedStatement.setString(4, kitap.getYazar());
            preparedStatement.setString(5, kitap.getTuru());
            
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt başarıyla eklendi!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lütfen girdiğiniz değerleri kontrol ediniz. Hata: " + ex.getMessage(), "Hata Mesajı!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
}
