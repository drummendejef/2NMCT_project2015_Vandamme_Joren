package be.howest.nmct.Onderbroek.admin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joren on 14/04/2015.
 */
public class KledingstukAdmin {

    private static List<Kledingstuk> kledingstukken;

    static  {
        kledingstukken = new ArrayList<Kledingstuk>();

        Kledingstuk k1 = new Kledingstuk("Groene broek", "Kortrijk", "Gekregen voor plechtige communie", "50.8248942", "3.258114");
        Kledingstuk k2 = new Kledingstuk("Rode shirt", "Mama", "Met GTA logo", "50.9776751", "4.44978");
        Kledingstuk k3 = new Kledingstuk("Witte kousen", "Papa", "Standaard witte kousen", "51.0029651", "4.713465");
        Kledingstuk k4 = new Kledingstuk("Dikke trui", "Kortrijk", "Egaal, erg dik", "50.8248942", "3.258114");

        kledingstukken.add(k1);
        kledingstukken.add(k2);
        kledingstukken.add(k3);
        kledingstukken.add(k4);

   }

    public static List<Kledingstuk> getKledingstukken() {
        return kledingstukken;
    }

    public static void setKledingstukken(List<Kledingstuk> kledingstukken) {
        KledingstukAdmin.kledingstukken = kledingstukken;
    }
}
