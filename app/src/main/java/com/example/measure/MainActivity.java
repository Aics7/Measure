package com.example.measure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proximity(View view){
        Intent prox=new Intent(MainActivity.this,Proximity.class);
        startActivity(prox);
    }
    public void accelerometer(View view){
        Intent accel=new Intent(MainActivity.this,Accelerometer.class);
        startActivity(accel);
    }

}
