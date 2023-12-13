package com.atenea.repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.DatePicker;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DatePicker dateCumple = findViewById(R.id.fecha);
        TextInputEditText materialTextViewName = findViewById(R.id.nombreEditText);
        TextInputEditText mailTextViewName = findViewById(R.id.MailEditText);
        //int fecha = dateCumple.getDayOfMonth();

        materialTextViewName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(Security.validarSize(charSequence.toString(),6,12))
                {
                    Toast.makeText(MainActivity.this, "El nombre cumple con el tamano", Toast.LENGTH_LONG).show();
                }else{
                    materialTextViewName.setError("el texto no cumple con las politicas de seguridad");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mailTextViewName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               boolean a = Security.validarMail(charSequence.toString());
               if(a)
               {
                 Toast.makeText(MainActivity.this,"validacion pattern true",Toast.LENGTH_SHORT).show();
               }else {
                   Toast.makeText(MainActivity.this,"validacion pattern false",Toast.LENGTH_SHORT).show();
               }
               boolean b = Security.validarTexto(charSequence.toString());
                if(b)
                {
                    Toast.makeText(MainActivity.this,"validacion manual true",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"validacion manual false",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }





}