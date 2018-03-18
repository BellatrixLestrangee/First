package com.example.bellatrix.college.activity;

import android.app.ActionBar;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.bellatrix.college.R;




public class MainActivity extends AppCompatActivity {
private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //ActionBar actionbar = getSupportActionBar();
        //actionbar.setDisplayShowHomeEnabled(true);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationview= findViewById(R.id.nav_view);
        navigationview.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                      // MenuItem.setChecked(true);
                       mDrawerLayout.closeDrawers();
                        return true;
                    }
                }
        );


    }
}
