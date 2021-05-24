package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DeleteDepo extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    Button btneliminarDE,btncancelarDE;
    ImageButton btnFindDE;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_depo);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btnFindDE=findViewById(R.id.btnfindDE);
        btnFindDE.setOnClickListener((View.OnClickListener) this);
        btneliminarDE=findViewById(R.id.btnEliminarDE);
        btneliminarDE.setOnClickListener((View.OnClickListener) this);
        btncancelarDE=findViewById(R.id.btnCancelarDE);
        btncancelarDE.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnfindDE:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
            case R.id.btnCancelarDE:

                break;
            case R.id.btnEliminarDE:

                break;
        }//Switch
    }//M.onClick
}//class