package be.howest.nmct.Onderbroek;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    //.add(R.id.container, new MainFragment())
                    .add(R.id.container, new GoogleMapsFragment())
                    .addToBackStack(null)
                    .commit();
        }
    }

    //Code om te wisselen van fragment
    public void showMainFragment()
    {
        // Create new fragment and transaction
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MainFragment mainFragment = MainFragment.newInstance();
        fragmentTransaction.replace(R.id.container, mainFragment);

        //Vangt de back toets op
        fragmentTransaction.addToBackStack("showMainFragment");
        fragmentTransaction.commit();

        setTitle("MainFragment");
    }

    public void showGoogleMapsFragment(String lat, String lon)
    {
        //Create new fragment and transaction
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //Nieuwe instantie aanmaken en open trekken.
        GoogleMapsFragment googleMapsFragment = GoogleMapsFragment.newInstance(lat, lon);
        fragmentTransaction.replace(R.id.container, googleMapsFragment);

        //Vangt de back toets op
        fragmentTransaction.addToBackStack("showGoogleMapsFragment");
        fragmentTransaction.commit();

        setTitle("Map");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
