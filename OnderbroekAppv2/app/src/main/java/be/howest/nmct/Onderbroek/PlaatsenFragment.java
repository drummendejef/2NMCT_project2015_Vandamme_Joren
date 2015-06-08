package be.howest.nmct.Onderbroek;


import android.app.ListFragment;
import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;

import be.howest.nmct.Onderbroek.loader.Contract;
import be.howest.nmct.Onderbroek.loader.KledingLoader;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaatsenFragment extends ListFragment implements LoaderManager.LoaderCallbacks<Cursor> {
    PlaatsenAdapter mAdapter;



    public PlaatsenFragment() {
        // Required empty public constructor
    }

    public static PlaatsenFragment newInstance()
    {
        return new PlaatsenFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_plaatsen, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter  = new PlaatsenAdapter(getActivity(),
                R.layout.row_plaatsen,
                null,
                new String[]{
                        Contract.KledijColumns.COLUMN_KLEDING_PLAATS,
                        Contract.KledijColumns.COLUMN_X_COORDINAAT,
                        Contract.KledijColumns.COLUMN_Y_COORDINAAT,
                },
                new int[]{R.id.textViewLocatieNaam,
                    R.id.textViewXCoordinaat,
                    R.id.textViewYCoordinaat,},0);

        setListAdapter(mAdapter);

        getLoaderManager().initLoader(0, null, this);
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


    class PlaatsenAdapter extends SimpleCursorAdapter {
        public PlaatsenAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
            super(context, layout, c, from, to, flags);
        }

        @Override
        public void bindView(View view, Context context, Cursor cursor) {
            super.bindView(view, context, cursor);




        }
    }
}
