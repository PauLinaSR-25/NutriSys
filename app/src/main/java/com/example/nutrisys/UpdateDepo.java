package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UpdateDepo extends AppCompatActivity {

    ImageButton btnflexicardio, btndfuerza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_depo);

        btndfuerza=findViewById(R.id.btnUagregfuerza);
        btndfuerza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),UpdateDepo3.class);
                startActivity(intent);
            }
        });

        btnflexicardio=findViewById(R.id.btnUcardioflexibilidad);
        btnflexicardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),UpdateDepo2.class);
                startActivity(intent);
            }
        });
    }//M.onCreate
}//class