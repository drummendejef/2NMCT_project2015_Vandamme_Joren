package be.howest.nmct;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Joren on 13/04/2015.
 */
public class OverzichtFragment extends Fragment {

    //Controls aanmaken
    private Button btnOverzichtKledij, btnOverzichtPlaats;


    //Properties aanmaken
    private onOverzichtKledijFragmentListener onOverzichtKledijFragmentListener;

    //Interface toevoegen
    public interface onOverzichtKledijFragmentListener {
        //public void
    }



    //Noodzakelijk, default constructor
    public OverzichtFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_overzicht, container, false);

        //Controls koppelen
        btnOverzichtKledij = (Button) v.findViewById(R.id.btnKledijOverzicht);
        btnOverzichtPlaats = (Button) v.findViewById(R.id.btnPlaatsenOverzicht);

        //Listener aan de button koppelen
        btnOverzichtKledij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOverzichtKledijFragment();
            }
        });


        //View teruggeven
        return v;
    }

    private void showOverzichtKledijFragment()
    {

    }
}
