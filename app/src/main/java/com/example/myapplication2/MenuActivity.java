package com.example.myapplication2;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity implements NavigationHost{

    BottomNavigationView nbottonNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container, new MenuCatFragment()).commit();
        }

        setContentView(R.layout.activity_menu);
        nbottonNavigation = (BottomNavigationView) findViewById(R.id.menu_btn);

        nbottonNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.heart) {
                        navigateTo(new MenuCatFragment(),true);
                }else if(menuItem.getItemId() == R.id.camara){
                    navigateTo(new CamaraFragment(),true);
                }

                return true;
            }
        });



    }
        private void showSelectedFragment(Fragment fragment){

            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();

    }


    @Override
    public void navigateTo(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment);
        if(addToBackStack == true){
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }


    @Override
    public void hideShowFragment(androidx.fragment.app.Fragment oldFragment, androidx.fragment.app.Fragment newFragment, String tag) {

    }
}
