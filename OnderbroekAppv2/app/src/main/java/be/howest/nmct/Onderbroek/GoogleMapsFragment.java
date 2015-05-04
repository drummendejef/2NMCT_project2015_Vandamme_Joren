package be.howest.nmct.Onderbroek;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class GoogleMapsFragment extends Fragment implements OnMapReadyCallback{

    MapFragment mfMap;
    private static GoogleMap gMap;
    static final String LAT = "be.howest.nmct.LAT";
    static final String LON = "be.howest.nmct.LON";

    public Double lat, lon;

    //public String lat, lon;

    public GoogleMapsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Als er geen waarden meegegeven zijn, gaat deze ze ophalen.
        if (getArguments() != null){
            lat = Double.valueOf(getArguments().getString(LAT));
            lon = Double.valueOf(getArguments().getString(LON));
            //lat = 50.0;
            //lon = 3.0;
        }
    }

    public static GoogleMapsFragment newInstance(String lat, String lon) {
        GoogleMapsFragment fragment =  new GoogleMapsFragment();
        Bundle args = new Bundle();
        args.putString(LAT, lat);
        args.putString(LON, lon);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_google_maps, container, false);

        mfMap = getMapFragment();
        mfMap.getMapAsync(this);
        return v;
    }

    private MapFragment getMapFragment() {
        FragmentManager fm;
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {

            fm = getFragmentManager();
        } else {

            fm = getChildFragmentManager();
        }
        return (MapFragment) fm.findFragmentById(R.id.map);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng location = new LatLng(lat, lon);
        //LatLng location = new LatLng(50.0, 3.0);

        //googleMap.setMyLocationEnabled(true);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 16));

        googleMap.addMarker(new MarkerOptions()
                .title("Naam van de plaats")
                .snippet("Hier is 'naamkledingsstuk' die je zocht.")
                .position(location));

        /*
        googleMap.setMyLocationEnabled(true);
        googleMap.addMarker(new MarkerOptions().title("Moorsele").snippet("litle town").position(MOORSELE));
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL); */

        /*
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MOORSELE,10));
        //googleMap.addMarker(new MarkerOptions().draggable(true).position(MOORSELE).flat(true).rotation(360));
        Marker path = googleMap.addMarker(new MarkerOptions().draggable(true).position(MOORSELE).flat(true).rotation(360));
        path.getPosition();
        String pos = "" + path.getPosition();
        path.setTitle("huidige lat/long");
        path.setSnippet(pos);
        path.setVisible(true);*/
    }

    @Override
    public void onResume() {
        super.onResume();
        if  (gMap == null){
            gMap = mfMap.getMap();
        }
    }
}
