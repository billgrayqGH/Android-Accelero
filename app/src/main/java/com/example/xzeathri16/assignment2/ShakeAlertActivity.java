package com.example.xzeathri16.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ShakeAlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shake_alert);
    }


    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub

        finish();
        startActivity(new Intent(ShakeAlertActivity.this, MainActivity.class));
    }
}
