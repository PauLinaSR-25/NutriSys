package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.nutrisys.controler.ejercicio;

public class TEjercicios extends AppCompatActivity implements View.OnClickListener{


    //Atributos
    private ImageButton btnFuerza,btnCardio,btnFlexibilidad,btnInfo;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_ejercicios);

        componentes();
    }//M. onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btnFuerza=findViewById(R.id.btnfuerza);
        btnFuerza.setOnClickListener((View.OnClickListener) this);
        btnCardio=findViewById(R.id.btncardio);
        btnCardio.setOnClickListener((View.OnClickListener) this);
        btnFlexibilidad=findViewById(R.id.btnestira);
        btnFlexibilidad.setOnClickListener((View.OnClickListener) this);
        btnInfo=findViewById(R.id.btninfo);
        btnInfo.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnfuerza:
                intent = new Intent(v.getContext(), Pesas.class);
                startActivity(intent);
                break;
            case R.id.btncardio:
                intent = new Intent(v.getContext(), Cardio.class);
                startActivity(intent);
                break;
            case R.id.btnestira:
                intent = new Intent(v.getContext(), Estiramiento.class);
                startActivity(intent);
                break;
            case R.id.btninfo:
                intent = new Intent(v.getContext(), InfoGeneral.class);
                startActivity(intent);
                break;
        }//Switch
    }//M.onClick
}//class