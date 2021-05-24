package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NRegistros extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    Button btnguardarR,btncancelarR;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nregistros);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btnguardarR=findViewById(R.id.btnGuardarR);
        btnguardarR.setOnClickListener((View.OnClickListener) this);
        btncancelarR=findViewById(R.id.btnCancelarR);
        btncancelarR.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnGuardarR:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
            case R.id.btnCancelarR:

                break;
        }//Switch
    }//M.onClick
}//class