package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class checkin extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    Button btnregistro;
    ImageButton btngooglenewc,btnfacebooknewc;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btnregistro=findViewById(R.id.btnregisNewC);
        btnregistro.setOnClickListener((View.OnClickListener) this);
        btngooglenewc=findViewById(R.id.btngoogleNewC);
        btngooglenewc.setOnClickListener((View.OnClickListener) this);
        btnfacebooknewc=findViewById(R.id.btnfacebookNewC);
        btnfacebooknewc.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnregisNewC:
                    intent = new Intent(v.getContext(), main_opcion.class);
                    startActivity(intent);
                break;
            case R.id.btngoogleNewC:

                break;
            case R.id.btnfacebookNewC:

                break;
        }//Switch
    }//M.onClick

}//class