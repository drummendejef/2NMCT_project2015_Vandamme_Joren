package be.howest.nmct.loader;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.BaseColumns;

import java.util.Objects;

import be.howest.nmct.Admin.KledingAdmin;
import be.howest.nmct.Admin.Kledingstuk;

/**
 * Created by Joren on 13/04/2015.
 */
public class KledingLoader extends AsyncTaskLoader<Cursor>{
    //Deze klasse gaat alles in de background inladen, om te zorgen
    //dat de app niet bevriest.

    private Cursor mCursor;

    private final String[] mColumnNames = new String[]{
            BaseColumns._ID,
            Kleding.KledijColumns.COLUMN_KLEDING_NAAM,
            Kleding.KledijColumns.COLUMN_KLEDING_PLAATS,
            Kleding.KledijColumns.COLUMN_KLEDING_BESCHRIJVING,
            Kleding.KledijColumns.COLUMN_KLEDING_TYPE
    };

    private static Object lock = new Object();

    //Constructor, moet.
    public KledingLoader(Context context) { super(context);}

    //Kijken of er al data ingeladen is, of de content gewijzigd.

    @Override
    protected void onStartLoading() {
        if(mCursor != null)//mCursor is al ingevuld.
        {
            deliverResult(mCursor);
        }
        if(takeContentChanged() || mCursor == null)//Cursor nog niet aangemaakt of inhoud veranderd.
            forceLoad();
    }

    @Override
    public Cursor loadInBackground() {
        if(mCursor == null)
            loadCursor();

        return mCursor;
    }

    //creëert een MatrixCursor.
    //http://developer.android.com/reference/android/database/MatrixCursor.html
    private void loadCursor() {
        synchronized (lock)
        {
            if(mCursor != null) return;//Als de cursor al bestaat moet je hem niet nog eens aanmaken

            MatrixCursor cursor = new MatrixCursor(mColumnNames);
            int id = 1;

            for(Kledingstuk kledingstuk : KledingAdmin.getKleding())
            {
                MatrixCursor.RowBuilder row = cursor.newRow();
                row.add(id);
                row.add(Kledingstuk.getNaamKleding());
                row.add(student.getVoornaamStudent());
                row.add(student.getEmailStudent());
                row.add(student.getTotaleScoreStudent());
                id++;
            }
            mCursor = cursor;


        }

    }
}
