package database;

import entities.Kullanici;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KullaniciDataAccess {

    private Connection con;

    public KullaniciDataAccess() {
        con = DataAccessLayer.baglantiKur(con);
    }

    public List<Kullanici> getAllKullanicilar() {
        List<Kullanici> kullanicilar = new ArrayList<>();
        String sorgu = "SELECT * FROM kullanicilar";
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sorgu)) {

            while (rs.next()) {
                Kullanici kullanici = new Kullanici();
                kullanici.setIsim(rs.getString("isim"));
                kullanici.setSoyisim(rs.getString("soyisim"));
                kullanici.setTC(rs.getString("TC"));
                kullanici.setRol(rs.getString("rol"));
                kullanici.setSifre(rs.getString("parola"));
                kullanicilar.add(kullanici);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kullanicilar;
    }
}
