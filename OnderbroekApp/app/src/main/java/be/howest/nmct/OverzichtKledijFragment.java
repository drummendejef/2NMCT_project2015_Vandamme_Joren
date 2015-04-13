package be.howest.nmct;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class OverzichtKledijFragment extends Fragment {


    public OverzichtKledijFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_overzicht_kledij, container, false);
    }

    //Openen van deze fragment nadat deze opgeroepen wordt vanuit "Overzicht"
    public static OverzichtKledijFragment newInstance()
    {
        OverzichtKledijFragment fragment = new OverzichtKledijFragment();

        return fragment;
    }


}
