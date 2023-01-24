package com.example.jipendeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SymptomsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
    }

    public void POSITIVE(View view) {
        Intent intent = new Intent(SymptomsActivity.this, PositiveActivity.class);
        startActivity(intent);
    }

    public void NEGATIVE(View view) {
        Intent intent = new Intent(SymptomsActivity.this, ItemsActivity.class);
        startActivity(intent);
    }
}