package lab.tiyo.trigonometry;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import lab.tiyo.trigonometry.fragments.RightTriangleFragment;
import lab.tiyo.trigonometry.fragments.TriSegitigaSiku;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RightTriangleFragment rightTriangleFragment = new RightTriangleFragment();

        getFragmentManager().beginTransaction().replace(R.id.fragmentContainer, rightTriangleFragment).commit();
    }


}
