package com.example.android.zeplin;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import com.example.android.zeplin.fragement.HomeFragement;

/**
 * main activity
 */
public class MainActivity extends AppCompatActivity {
    private HomeFragement homeFragement = new HomeFragement();
    private ImageView ivHeader;
    private DrawerLayout dlSidemenu;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dlSidemenu = (DrawerLayout) findViewById(R.id.drawerLayout);
        ivHeader = (ImageView) findViewById(R.id.iv_header);
        ivHeader.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                dlSidemenu.openDrawer(Gravity.START);
            }
        });

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.framelayout, homeFragement);
        ft.commit();
    }
}
