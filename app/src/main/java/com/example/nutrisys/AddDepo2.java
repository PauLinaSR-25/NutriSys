package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class AddDepo2 extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    //Atributos
    private Spinner spnNCFTEjercicios;
    String tE;
    Button btnguardarNCF,btncancelarNCF;


    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_depo2);

        componentes();
    }//M.onCreate


    private void componentes (){
        botones();
        spinnerComponentes();
    }//M.Componentes

    private void spinnerComponentes (){
        ArrayAdapter<CharSequence> TipoEAdapter;
        TipoEAdapter = ArrayAdapter.createFromResource(this,R.array.tEjer, android.R.layout.simple_spinner_item);

        spnNCFTEjercicios=findViewById(R.id.spnTEjercicioNCF);
        spnNCFTEjercicios.setAdapter(TipoEAdapter);
        spnNCFTEjercicios.setOnItemSelectedListener(this);
    }//M.spinnerComponentes

    private void botones (){
        btnguardarNCF=findViewById(R.id.btnGuardarNCF);
        btnguardarNCF.setOnClickListener((View.OnClickListener) this);
        btncancelarNCF=findViewById(R.id.btnCancelarNCF);
        btncancelarNCF.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnGuardarNCF:
               // intent = new Intent(v.getContext(),AddDepo3.class);
               // startActivity(intent);
                break;
            case R.id.btnCancelarNCF:

                break;
        }//Switch
    }//M.onClick

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spnTEjercicioNCF:
                if (position != 0) {
                    tE = parent.getItemAtPosition(position).toString();
                } else {
                    tE = "";
                }
                break;
        }//Switch
    }//M.onItemSelected

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }//M.onNothingSelected
}//class