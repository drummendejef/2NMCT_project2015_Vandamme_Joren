package be.howest.nmct.Onderbroek.loader;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.BaseColumns;

import be.howest.nmct.Onderbroek.admin.Kledingstuk;
import be.howest.nmct.Onderbroek.admin.KledingstukAdmin;

/**
 * Created by Joren on 14/04/2015.
 */
public class KledingLoader extends AsyncTaskLoader<Cursor>{

    private Cursor mCursor;

    private final String[]mColumnNames = new String[]{
            BaseColumns._ID,
            Contract.KledijColumns.COLUMN_KLEDING_NAAM,
            Contract.KledijColumns.COLUMN_KLEDING_BESCHRIJVING,
            Contract.KledijColumns.COLUMN_KLEDING_PLAATS,
            Contract.KledijColumns.COLUMN_KLEDING_TYPE
    };

    private static Object lock = new Object();

    public KledingLoader(Context context){
        super(context);
    }

    //Kijken of er al data ingeladen is, of content gewijzigd.
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
    private void loadCursor()
    {
        synchronized (lock)
        {
            if(mCursor != null) return; //Als de cursor al bestaat moet je hem niet opnieuw maken

            MatrixCursor cursor = new MatrixCursor(mColumnNames);
            int id = 1;

            for(Kledingstuk kledingstuk : KledingstukAdmin.getKledingstukken())
            {
                MatrixCursor.RowBuilder row = cursor.newRow();
                row.add(id);
                row.add(kledingstuk.getNaamKledingstuk());
                row.add(kledingstuk.getPlaatsKledingstuk());
                row.add(kledingstuk.getBeschrijvingKledingstuk());
                id++;
            }
            mCursor = cursor;
        }
    }




}
