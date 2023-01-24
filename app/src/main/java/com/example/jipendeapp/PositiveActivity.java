package com.example.jipendeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PositiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive);
    }

    public void SYMPTOMS(View view) {
        Intent intent = new Intent(PositiveActivity.this,SymptomsActivity.class);
        startActivity(intent);
    }

    public void HOSPITALS(View view) {
    }

    public void RESULTS(View view) {
    }

    public void ABOUT(View view) {
        Intent intent = new Intent(PositiveActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}