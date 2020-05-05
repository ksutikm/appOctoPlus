package com.example.workvesion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class NavigationLeft extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_left);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigationView);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawerOpen, R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorWhite));

        navigationView.setNavigationItemSelectedListener(this);

        //fragmentManager = getSupportFragmentManager();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int size_menu = navigationView.getMenu().size();
        for (int i = 0; i < size_menu; i++) {
            final MenuItem items = navigationView.getMenu().getItem(i);
            if (items.hasSubMenu()) {
                unCheckAllMenuItems(items.getSubMenu());
            } else {
                items.setChecked(false);
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        switch (item.getItemId()) {
            case R.id.profile:
                FragmentAccount fragmentAccount = new FragmentAccount();
                fragmentTransaction.replace(R.id.container, fragmentAccount);
                break;
            case R.id.contact:
                FragmentOne fragmentOne = new FragmentOne();
                fragmentTransaction.replace(R.id.container, fragmentOne);
                break;
            case R.id.about:
                FragmentTwo fragmentTwo = new FragmentTwo();
                fragmentTransaction.replace(R.id.container, fragmentTwo);
                break;
            case R.id.logout:
                Toast.makeText(this, "Logout Selected", Toast.LENGTH_SHORT).show();
                break;
        }

        item.setChecked(true);
        fragmentTransaction.commit();
        return false;
    }

    private static void unCheckAllMenuItems(Menu menu) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            if(item.hasSubMenu()) {
                unCheckAllMenuItems(item.getSubMenu());
            } else {
                item.setChecked(false);
            }
        }
    }
}
