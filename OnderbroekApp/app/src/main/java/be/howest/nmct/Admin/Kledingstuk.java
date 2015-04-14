package be.howest.nmct.Admin;

/**
 * Created by Joren on 13/04/2015.
 */
public class Kledingstuk {
    //Properties
    private String naamKleding, beschrijvingKleding, plaatsKleding;

    //Constructor
    public Kledingstuk(String naam, String beschrijving, String plaats)
    {
        this.naamKleding = naam;
        this.beschrijvingKleding = beschrijving;
        this.plaatsKleding = plaats;
    }

    public String getNaamKleding() {
        return naamKleding;
    }

    public String getBeschrijvingKleding() {
        return beschrijvingKleding;
    }

    public String getPlaatsKleding() {
        return plaatsKleding;
    }
}
