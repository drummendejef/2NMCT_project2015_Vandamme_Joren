package be.howest.nmct.Onderbroek.admin;

/**
 * Created by Joren on 14/04/2015.
 */
public class Kledingstuk {
    private String naamKledingstuk, beschrijvingKledingstuk, plaatsKledingstuk, xcoordinaat, ycoordinaat;

    public Kledingstuk(String naamKledingstuk)
    {
        super();
        this.naamKledingstuk = naamKledingstuk;
    }

    public Kledingstuk(String naamKledingstuk, String beschrijvingKledingstuk, String plaatsKledingstuk, String xcoordinaat, String ycoordinaat )
    {
        super();
        this.naamKledingstuk = naamKledingstuk;
        this.beschrijvingKledingstuk = beschrijvingKledingstuk;
        this.plaatsKledingstuk = plaatsKledingstuk;
        this.xcoordinaat = xcoordinaat;
        this.ycoordinaat = ycoordinaat;
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

    public String getXcoordinaat() {
        return xcoordinaat;
    }

    public void setXcoordinaat(String xcoordinaat) {
        this.xcoordinaat = xcoordinaat;
    }

    public String getYcoordinaat() {
        return ycoordinaat;
    }

    public void setYcoordinaat(String ycoordinaat) {
        this.ycoordinaat = ycoordinaat;
    }
}
