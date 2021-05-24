package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Registros extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    ImageButton btnregistro;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btnregistro=findViewById(R.id.btnregistroA);
        btnregistro.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnregistroA:
                intent = new Intent(v.getContext(),NRegistros.class);
                startActivity(intent);
                break;
        }//Switch
    }//M.onClick
}//class