package com.example.xzeathri16.assignment2;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Fragment frag = new Fragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,frag).commit();
    }
}
