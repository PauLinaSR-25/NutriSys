package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UpdateDepo extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    ImageButton btnflexicardio, btndfuerza;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_depo);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btndfuerza=findViewById(R.id.btnUagregfuerza);
        btndfuerza.setOnClickListener((View.OnClickListener) this);
        btnflexicardio=findViewById(R.id.btnUcardioflexibilidad);
        btnflexicardio.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnUagregfuerza:
                intent = new Intent(v.getContext(),UpdateDepo3.class);
                startActivity(intent);
                break;
            case R.id.btnUcardioflexibilidad:
                intent = new Intent(v.getContext(),UpdateDepo2.class);
                startActivity(intent);
                break;
        }//Switch
    }//M.onClick
}//class