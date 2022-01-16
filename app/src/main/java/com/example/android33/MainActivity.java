package com.example.android33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static boolean isMainFragment = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new com.example.android33.Fragment_Main()).commit();

    }

    @Override
    public void onBackPressed() {
        if (isMainFragment) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new com.example.android33.Fragment_Main()).commit();
            isMainFragment = true;
        }
    }
}