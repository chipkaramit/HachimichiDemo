package com.amit.hachimichidemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnImageDemo, btnSensorDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnImageDemo = findViewById(R.id.btn_image_demo);
        btnSensorDemo = findViewById(R.id.btn_sensor_demo);

        btnImageDemo.setOnClickListener(this);
        btnSensorDemo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_image_demo:
                Intent intentImage = new Intent(MainActivity.this, ImageDemo.class);
                startActivity(intentImage);
                break;

            case R.id.btn_sensor_demo:
                Intent intentSensor = new Intent(MainActivity.this, SensorActivity.class);
                startActivity(intentSensor);
                break;

            default:
                break;
        }
    }
}