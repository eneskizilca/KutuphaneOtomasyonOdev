package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import entities.Kitap;

public class KitapDataAccess {

    private Connection con;

    public KitapDataAccess() {
        con = DataAccessLayer.baglantiKur(con);
    }

    public List<Kitap> getAllKitaplar() {
        List<Kitap> kitaplar = new ArrayList<>();
        String sorgu = "SELECT * FROM kitaplar";
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sorgu)) {

            while (rs.next()) {
                Kitap kitap = new Kitap();
                kitap.setISBN(rs.getString("ISBN"));
                kitap.setKitapAdi(rs.getString("adi"));
                kitap.setYazar(rs.getString("yazar"));
                kitap.setTuru(rs.getString("tur"));
                kitap.setSayfaSayisi(rs.getInt("sayfa_sayisi"));
                kitaplar.add(kitap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kitaplar;
    }
}
