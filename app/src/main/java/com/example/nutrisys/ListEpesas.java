package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ListEpesas extends AppCompatActivity implements View.OnClickListener{

    //Atributos
    ImageButton btnPecho, btnDorsal, btnCuadriceps, btnBiceps, btnTriceps, btnHombros, btnFemoral,
            btnGluteo, btnAbdomen, btnAntebrazo, btnCuello, btnGemelos;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_epesas);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
    }//M.Componentes

    private void botones (){
        btnPecho=findViewById(R.id.btnpecho);
        btnPecho.setOnClickListener((View.OnClickListener) this);
        btnDorsal=findViewById(R.id.btndorsal);
        btnDorsal.setOnClickListener((View.OnClickListener) this);
        btnCuadriceps=findViewById(R.id.btncuadriceps);
        btnCuadriceps.setOnClickListener((View.OnClickListener) this);
        btnBiceps=findViewById(R.id.btnbiceps);
        btnBiceps.setOnClickListener((View.OnClickListener) this);
        btnTriceps=findViewById(R.id.btntriceps);
        btnTriceps.setOnClickListener((View.OnClickListener) this);
        btnHombros=findViewById(R.id.btnhombros);
        btnHombros.setOnClickListener((View.OnClickListener) this);
        btnFemoral=findViewById(R.id.btnfemoral);
        btnFemoral.setOnClickListener((View.OnClickListener) this);
        btnGluteo=findViewById(R.id.btngluteo);
        btnGluteo.setOnClickListener((View.OnClickListener) this);
        btnAbdomen=findViewById(R.id.btnabdomen);
        btnAbdomen.setOnClickListener((View.OnClickListener) this);
        btnAntebrazo=findViewById(R.id.btnantebrazo);
        btnAntebrazo.setOnClickListener((View.OnClickListener) this);
        btnCuello=findViewById(R.id.btncuello);
        btnCuello.setOnClickListener((View.OnClickListener) this);
        btnGemelos=findViewById(R.id.btngemelos);
        btnGemelos.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnpecho:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
            case R.id.btndorsal:

                break;
            case R.id.btncuadriceps:

                break;
            case R.id.btnbiceps:

                break;
            case R.id.btntriceps:

                break;
            case R.id.btnhombros:

                break;
            case R.id.btnfemoral:

                break;
            case R.id.btngluteo:

                break;
            case R.id.btnabdomen:

                break;
            case R.id.btnantebrazo:

                break;
            case R.id.btncuello:

                break;
            case R.id.btngemelos:

                break;
        }//Switch
    }//M.onClick
}//class