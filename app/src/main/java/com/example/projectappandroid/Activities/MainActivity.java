package com.example.projectappandroid.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.ClipData;
import android.graphics.Typeface;
import android.net.Network;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.projectappandroid.Fragments.CallUs;
import com.example.projectappandroid.Fragments.FindUs;
import com.example.projectappandroid.Fragments.Homefragment;
import com.example.projectappandroid.Fragments.Main;
import com.example.projectappandroid.Fragments.ShoppingCart;
import com.example.projectappandroid.Fragments.favorite;
import com.example.projectappandroid.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Fragment myFragment = null;
        //change title setting
        setTitle("Charl's Tacos");
        //TextView title = (TextView) findViewById(android.R.id.title);
        //title.setGravity(Gravity.CENTER);


        mDrawerlayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerlayout, R.string.open, R.string.close);
        mDrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationViewDrawer = (NavigationView) findViewById(R.id.nvdrawer);
        mToggle.syncState();
        setupDrawerContent(navigationViewDrawer);





    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void selectItemDrawer (MenuItem menuItem){
        Fragment myFragment = null;
        Class fragmentClass;
        switch (menuItem.getItemId()){
            case R.id.favorite:
                fragmentClass = favorite.class;
                break;
            case R.id.main:
                fragmentClass = Main.class;
                break;
            case R.id.starter:
                fragmentClass = Main.class;
                break;
            case R.id.dessert:
                fragmentClass = Main.class;
                break;
            case R.id.side:
                fragmentClass = Main.class;
                break;
            case R.id.sc:
                fragmentClass = ShoppingCart.class;
                break;
            case R.id.call:
                fragmentClass = CallUs.class;
                break;
            case R.id.location:
                fragmentClass = FindUs.class;
                break;
            default:
                fragmentClass = Homefragment.class;
        }
        try {
            myFragment = (Fragment) fragmentClass.newInstance();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flcontent,myFragment).commit();
        menuItem.setChecked(true);
        mDrawerlayout.closeDrawers();

    }
    private void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                selectItemDrawer(menuItem);
                return true;
            }
        });
    }

    public void popBackStackTillEntry(int entryIndex) {

        if (getSupportFragmentManager() == null) {
            return;
        }
        if (getSupportFragmentManager().getBackStackEntryCount() <= entryIndex) {
            return;
        }
        FragmentManager.BackStackEntry entry = getSupportFragmentManager().getBackStackEntryAt(
                entryIndex);
        if (entry != null) {
            getSupportFragmentManager().popBackStackImmediate(entry.getId(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }


    }
}
