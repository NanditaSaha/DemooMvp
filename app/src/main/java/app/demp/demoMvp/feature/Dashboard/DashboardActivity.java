package app.demp.demoMvp.feature.Dashboard;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import app.demp.demoMvp.R;
import app.demp.demoMvp.feature.HomeFragment.HomeFragment;
import app.demp.demoMvp.feature.OrderFragment.OrderFragment;

public class DashboardActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private Fragment fragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            fragment=null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                        fragment=new HomeFragment();
                        break;


                case R.id.navigation_dashboard:
                   // mTextMessage.setText(R.string.title_dashboard);
                    fragment=new OrderFragment();
                    break;

                case R.id.navigation_notifications:
                   // mTextMessage.setText(R.string.title_notifications);
                    fragment=new OrderFragment();
                    break;

            }



            return loadFragment(fragment);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new HomeFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content_frame, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}
