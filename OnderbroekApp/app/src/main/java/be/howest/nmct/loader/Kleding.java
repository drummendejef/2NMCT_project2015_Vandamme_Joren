package be.howest.nmct.loader;

import android.provider.BaseColumns;

/**
 * Created by Joren on 13/04/2015.
 */
public class Kleding {
    //Houd alle dingen van een kledingstuk bij
    public interface KledijColumns extends BaseColumns
    {
        public static final String COLUMN_KLEDING_NAAM = "kleding_naam";
        public static final String COLUMN_KLEDING_PLAATS = "kleding_plaats";
        public static final String COLUMN_KLEDING_BESCHRIJVING = "kleding_beschrijving";
        public static final String COLUMN_KLEDING_TYPE = "kleding_type";
    }
}
