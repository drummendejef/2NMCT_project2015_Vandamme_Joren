package be.howest.nmct.Onderbroek.admin;

/**
 * Created by Joren on 14/04/2015.
 */
public class Kledingstuk {
    private String naamKledingstuk, beschrijvingKledingstuk, plaatsKledingstuk;
    double latKledingstuk, lonKledingstuk;

    public Kledingstuk(String naamKledingstuk)
    {
        super();
        this.naamKledingstuk = naamKledingstuk;
    }

    public Kledingstuk(String naamKledingstuk, String beschrijvingKledingstuk, String plaatsKledingstuk, double latKledingstuk, double lonKledingstuk)
    {
        super();
        this.naamKledingstuk = naamKledingstuk;
        this.beschrijvingKledingstuk = beschrijvingKledingstuk;
        this.plaatsKledingstuk = plaatsKledingstuk;
        this.latKledingstuk = latKledingstuk;
        this.lonKledingstuk = lonKledingstuk;
    }

    public String getNaamKledingstuk() {
        return naamKledingstuk;
    }

    public void setNaamKledingstuk(String naamKledingstuk) {
        this.naamKledingstuk = naamKledingstuk;
    }

    public String getBeschrijvingKledingstuk() {
        return beschrijvingKledingstuk;
    }

    public void setBeschrijvingKledingstuk(String beschrijvingKledingstuk) {
        this.beschrijvingKledingstuk = beschrijvingKledingstuk;
    }

    public String getPlaatsKledingstuk() {
        return plaatsKledingstuk;
    }

    public void setPlaatsKledingstuk(String plaatsKledingstuk) {
        this.plaatsKledingstuk = plaatsKledingstuk;
    }

    public double getLatKledingstuk() {
        return latKledingstuk;
    }

    public double getLonKledingstuk() {
        return lonKledingstuk;
    }

    public void setLatKledingstuk(double latKledingstuk) {
        this.latKledingstuk = latKledingstuk;
    }

    public void setLonKledingstuk(double lonKledingstuk) {
        this.lonKledingstuk = lonKledingstuk;
    }
}
