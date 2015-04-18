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

        Kledingstuk k1 = new Kledingstuk("Groene broek", "Kortrijk", "Gekregen voor plechtige communie");
        Kledingstuk k2 = new Kledingstuk("Rode shirt", "Mama", "Met GTA logo");
        Kledingstuk k3 = new Kledingstuk("Witte kousen", "Papa", "Standaard witte kousen");

        kledingstukken.add(k1);
        kledingstukken.add(k2);
        kledingstukken.add(k3);

   }

    public static List<Kledingstuk> getKledingstukken() {
        return kledingstukken;
    }

    public static void setKledingstukken(List<Kledingstuk> kledingstukken) {
        KledingstukAdmin.kledingstukken = kledingstukken;
    }
}
