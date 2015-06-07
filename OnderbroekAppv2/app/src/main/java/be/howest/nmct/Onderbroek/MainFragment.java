package be.howest.nmct.Onderbroek;

import android.app.Activity;
import android.app.ListFragment;
import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;

import be.howest.nmct.Onderbroek.loader.Contract;
import be.howest.nmct.Onderbroek.loader.KledingLoader;

/**
 * Created by Joren on 14/04/2015.
 */
public class MainFragment extends ListFragment implements LoaderManager.LoaderCallbacks<Cursor> {
    KledingAdapter mAdapter;
    Button btnToonPlaatsen;

    private OnMainFragmentListener mListener;

    //Required, lege constructor
    public MainFragment() {
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new KledingAdapter(getActivity(),
                R.layout.row_kledingstuk,
                null,
                new String[]{
                        Contract.KledijColumns.COLUMN_KLEDING_NAAM,
                        Contract.KledijColumns.COLUMN_KLEDING_BESCHRIJVING,
                        Contract.KledijColumns.COLUMN_KLEDING_PLAATS,
                        Contract.KledijColumns.COLUMN_KLEDING_TYPE
                },
                new int[]{R.id.txtViewKledingNaam,
                R.id.txtViewKledingBeschrijving,
                R.id.txtViewPlaats},0);

        setListAdapter(mAdapter);

        getLoaderManager().initLoader(0, null, this);

    }

    //Om van fragment te wisselen (deze te openen)
    public static MainFragment newInstance()
    {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        btnToonPlaatsen = (Button)v.findViewById(R.id.buttontoonplaatsen);

        //Buttonknop actie opvangen
        btnToonPlaatsen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.demandPlaatsenFragment();
            }
        });

        return v;
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return new KledingLoader(getActivity());
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        mAdapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        mAdapter.swapCursor(null);
    }

    /*@Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnMainFragmentListener) activity;
        } catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()
                    + " moet OnFragmentInteractionListener Implementeren");
        }
    }*/

    public interface OnMainFragmentListener {
        public void demandPlaatsenFragment();
    }

    class KledingAdapter extends SimpleCursorAdapter {
        public KledingAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
            super(context, layout, c, from, to, flags);
        }

        @Override
        public void bindView(View view, Context context, Cursor cursor) {
            super.bindView(view, context, cursor);




        }
    }
}
