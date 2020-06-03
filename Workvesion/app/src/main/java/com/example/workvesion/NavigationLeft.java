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
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.workvesion.fragments.FragmentAcadem;
import com.example.workvesion.fragments.FragmentAccount;
import com.example.workvesion.fragments.FragmentAttachment;
import com.example.workvesion.fragments.FragmentEducation;
import com.example.workvesion.fragments.FragmentEntrance;
import com.example.workvesion.fragments.FragmentEqualize;
import com.example.workvesion.fragments.FragmentHome;
import com.example.workvesion.fragments.FragmentMoney;
import com.example.workvesion.fragments.FragmentOctopus;
import com.example.workvesion.fragments.FragmentOne;
import com.example.workvesion.fragments.FragmentProgress;
import com.example.workvesion.fragments.FragmentTwo;
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
    FragmentOctopus fragmentOctopus;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_left);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/telOctoPlus_bot")));
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
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

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentOctopus = new FragmentOctopus();
        fragmentTransaction.replace(R.id.container, fragmentOctopus);
        fragmentTransaction.commit();

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
//            case R.id.profile:
//                FragmentAccount fragmentAccount = new FragmentAccount();
//                fragmentTransaction.replace(R.id.container, fragmentAccount);
//                break;
            case R.id.contact:
                fragmentTransaction.replace(R.id.container, fragmentOctopus);
                break;
            case R.id.about:
                FragmentTwo fragmentTwo = new FragmentTwo();
                fragmentTransaction.replace(R.id.container, fragmentTwo);
                break;
            case R.id.logout:
                //Toast.makeText(this, "Logout Selected", Toast.LENGTH_SHORT).show();
                onBackPressed();
                break;
            case R.id.nav_academ:
                FragmentAcadem fragmentAcadem = new FragmentAcadem();
                fragmentTransaction.replace(R.id.container, fragmentAcadem);
                break;
            case R.id.nav_money:
                FragmentMoney fragmentMoney = new FragmentMoney();
                fragmentTransaction.replace(R.id.container, fragmentMoney);
                break;
            case R.id.nav_education:
                FragmentEducation fragmentEducation = new FragmentEducation();
                fragmentTransaction.replace(R.id.container, fragmentEducation);
                break;
            case R.id.nav_progress:
                FragmentProgress fragmentProgress = new FragmentProgress();
                fragmentTransaction.replace(R.id.container, fragmentProgress);
                break;
            case R.id.nav_entrance:
                FragmentEntrance fragmentEntrance = new FragmentEntrance();
                fragmentTransaction.replace(R.id.container, fragmentEntrance);
                break;
            case R.id.nav_equalizer:
                FragmentEqualize fragmentEqualize = new FragmentEqualize();
                fragmentTransaction.replace(R.id.container, fragmentEqualize);
                break;
            case R.id.nav_home:
                FragmentHome fragmentHome = new FragmentHome();
                fragmentTransaction.replace(R.id.container, fragmentHome);
                break;
            case R.id.nav_attachment:
                FragmentAttachment fragmentAttachment = new FragmentAttachment();
                fragmentTransaction.replace(R.id.container, fragmentAttachment);
                break;
        }

        item.setChecked(true);
        fragmentTransaction.commit();
        return false;
    }

    private static void unCheckAllMenuItems(@NonNull Menu menu) {
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
