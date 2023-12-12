package com.atenea.repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TableLayout;

import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker dateCumple = findViewById(R.id.fecha);
        MaterialTextView materialTextViewName = findViewById(R.id.NombreTextView);
        //int fecha = dateCumple.getDayOfMonth();

        Security.validarSize(materialTextViewName.getText().toString(),6,12);
    }





}