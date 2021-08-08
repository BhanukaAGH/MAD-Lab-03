package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    private ConstraintLayout parent;
    private Button btnShowSnackbar;
    private MaterialCardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.parent);
        btnShowSnackbar = findViewById(R.id.button);
        cardView = findViewById(R.id.cardView);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Card clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackbar();
            }
        });
    }

    private void showSnackbar(){
        Snackbar.make(parent,"This is a Snackbar.", Snackbar.LENGTH_INDEFINITE)
            .setAction("Retry", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Retry Clicked.", Toast.LENGTH_SHORT).show();
                }
            }).setActionTextColor(Color.RED)
                .setTextColor(Color.BLUE)
                .show();
    }
}