package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AddDepo extends AppCompatActivity {

    ImageButton btnflexicardio, btndfuerza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_depo);


        btndfuerza=findViewById(R.id.btnagregfuerza);
        btndfuerza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),AddDepo3.class);
                startActivity(intent);
            }
        });

        btnflexicardio=findViewById(R.id.btncardioflexibilidad);
        btnflexicardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),AddDepo2.class);
                startActivity(intent);
            }
        });


    }//onCreate
}//class