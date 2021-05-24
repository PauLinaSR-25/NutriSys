package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Estiramiento extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    Button btnMverF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estiramiento);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btnMverF=findViewById(R.id.btnVerF);
        btnMverF.setOnClickListener((View.OnClickListener) this);
    }//M.Botones
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnVerF:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
        }//Switch
    }//M.onClick
}//class