package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pesas extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    Button btnverListaP;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesas);

        componentes();

        btnverListaP=findViewById(R.id.btnVerP);
        btnverListaP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ListEpesas.class);
                startActivity(intent);
            }
        });
    }//M.onCreate

    private void componentes (){
        botones();
    }//M.Componentes


    private void botones (){
        btnverListaP=findViewById(R.id.btnVerP);
        btnverListaP.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnVerP:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
        }//Switch
    }//M.onClick
}//class