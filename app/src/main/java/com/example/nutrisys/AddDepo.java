package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AddDepo extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    ImageButton btnflexicardio, btndfuerza;


    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_depo);

        componentes();
    }//onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btndfuerza=findViewById(R.id.btnagregfuerza);
        btndfuerza.setOnClickListener((View.OnClickListener) this);

        btnflexicardio=findViewById(R.id.btncardioflexibilidad);
        btnflexicardio.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnagregfuerza:
                intent = new Intent(v.getContext(),AddDepo3.class);
                startActivity(intent);
                break;
            case R.id.btncardioflexibilidad:
                intent = new Intent(v.getContext(),AddDepo2.class);
                startActivity(intent);
                break;
        }//Switch
    }//M.onClick

}//class