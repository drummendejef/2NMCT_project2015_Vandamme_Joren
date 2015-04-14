package be.howest.nmct.Onderbroek.admin;

/**
 * Created by Joren on 14/04/2015.
 */
public class Kledingstuk {
    private String naamKledingstuk;

    public Kledingstuk(String naamKledingstuk)
    {
        super();
        this.naamKledingstuk = naamKledingstuk;
    }

    public String getNaamKledingstuk() {
        return naamKledingstuk;
    }

    public void setNaamKledingstuk(String naamKledingstuk) {
        this.naamKledingstuk = naamKledingstuk;
    }
}
