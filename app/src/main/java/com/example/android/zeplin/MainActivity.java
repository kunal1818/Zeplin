package com.example.android.zeplin;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.android.zeplin.fragement.HomeFragement;

/**
 * main activity
 */
public class MainActivity extends AppCompatActivity {
    private HomeFragement homeFragement = new HomeFragement();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.framelayout, homeFragement);
        ft.commit();
    }
}
