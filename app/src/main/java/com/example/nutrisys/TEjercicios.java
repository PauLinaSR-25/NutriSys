package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.nutrisys.controler.ejercicio;

public class TEjercicios extends AppCompatActivity {

    private ImageButton btnFuerza,btnCardio,btnFlexibilidad,btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_ejercicios);


        btnFuerza = findViewById(R.id.btnfuerza);
        btnFuerza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Pesas.class);
                startActivity(intent);
            }
        });

        btnCardio = findViewById(R.id.btncardio);
        btnCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Cardio.class);
                startActivity(intent);
            }
        });

        btnFlexibilidad = findViewById(R.id.btnestira);
        btnFlexibilidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Estiramiento.class);
                startActivity(intent);
            }
        });

        btnInfo = findViewById(R.id.btninfo);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), InfoGeneral.class);
                startActivity(intent);
            }
        });
    }//M. onCreate


}//class