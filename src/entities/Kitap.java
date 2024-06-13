package entities;

public class Kitap {

    public String ISBN;
    public String kitapAdi;
    public String yazar;
    public String turu;
    public int sayfaSayisi;

    public String getISBN() {
        return ISBN;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public String getTuru() {
        return turu;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    
    
}
