package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cardio extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    Button btnMverC;
    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btnMverC=findViewById(R.id.btnVerC);
        btnMverC.setOnClickListener((View.OnClickListener) this);
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