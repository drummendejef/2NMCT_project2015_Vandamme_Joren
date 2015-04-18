package be.howest.nmct.Onderbroek.admin;

/**
 * Created by Joren on 14/04/2015.
 */
public class Kledingstuk {
    private String naamKledingstuk, beschrijvingKledingstuk, plaatsKledingstuk;

    public Kledingstuk(String naamKledingstuk)
    {
        super();
        this.naamKledingstuk = naamKledingstuk;
    }

    public Kledingstuk(String naamKledingstuk, String beschrijvingKledingstuk, String plaatsKledingstuk )
    {
        super();
        this.naamKledingstuk = naamKledingstuk;
        this.beschrijvingKledingstuk = beschrijvingKledingstuk;
        this.plaatsKledingstuk = plaatsKledingstuk;
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
}
