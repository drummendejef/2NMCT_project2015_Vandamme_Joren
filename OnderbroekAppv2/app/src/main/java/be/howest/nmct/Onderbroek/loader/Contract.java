package be.howest.nmct.Onderbroek.loader;

import android.provider.BaseColumns;

/**
 * Created by Joren on 14/04/2015.
 */
public class Contract {
    //Houd alle dingen van een kledingstuk bij
    public interface KledijColumns extends BaseColumns
    {
        public static final String COLUMN_KLEDING_NAAM = "kleding_naam";
        public static final String COLUMN_KLEDING_PLAATS = "kleding_plaats";
        public static final String COLUMN_KLEDING_BESCHRIJVING = "kleding_beschrijving";
        public static final String COLUMN_KLEDING_TYPE = "kleding_type";
        public static final String COLUMN_X_COORDINAAT = "kleding_x_coordinaat";
        public static final String COLUMN_Y_COORDINAAT = "kleding_y_coordinaat";
    }
}
