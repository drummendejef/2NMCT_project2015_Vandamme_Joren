package be.howest.nmct.Admin;

import java.util.ArrayList;
import java.util.List;

import be.howest.nmct.loader.Kleding;

/**
 * Created by Joren on 13/04/2015.
 */
public class KledingAdmin {

    private static List<Kledingstuk> kledingstukken;
    static {
        kledingstukken = new ArrayList<Kledingstuk>();

        Kledingstuk k1 = new Kledingstuk("Blauwe broek", "Maat 38, 32, gekregen van mama voor 15de verjaardag", "Kortrijk");
        Kledingstuk k2 = new Kledingstuk("Witte shirt", "Maat: XL, neutrale witte shirt, deftig.", "Kortrijk");
        Kledingstuk k3 = new Kledingstuk("Zwarte sokken", "Voor op chique feesten", "Kortrijk");

        kledingstukken.add(k1);
        kledingstukken.add(k2);
        kledingstukken.add(k3);

    }

    public static List<Kledingstuk> getKleding() { return kledingstukken; }
}
