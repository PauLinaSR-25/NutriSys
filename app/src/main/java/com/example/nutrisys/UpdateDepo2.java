package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class UpdateDepo2 extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    //Atributos
    private Spinner spnTEjercicios;
    String tE;
    Button btnguardarEDCF, btnCancelarEDCF;
    ImageButton btnfindEDCF;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_depo2);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
        spinnerComponentes();
    }//M.Componentes

    private void spinnerComponentes (){
        ArrayAdapter<CharSequence> TipoEAdapter;
        TipoEAdapter = ArrayAdapter.createFromResource(this,R.array.tEjer, android.R.layout.simple_spinner_item);
        spnTEjercicios=findViewById(R.id.spnUTEjercicioCF);
        spnTEjercicios.setAdapter(TipoEAdapter);
        spnTEjercicios.setOnItemSelectedListener(this);
    }//M.spinnerComponentes

    private void botones (){
        btnguardarEDCF=findViewById(R.id.btnGuardarEDCF);
        btnguardarEDCF.setOnClickListener((View.OnClickListener) this);
        btnCancelarEDCF=findViewById(R.id.btnCancelarEDCF);
        btnCancelarEDCF.setOnClickListener((View.OnClickListener) this);
        btnfindEDCF=findViewById(R.id.btnfindEDCF);
        btnfindEDCF.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnGuardarEDCF:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
            case R.id.btnCancelarEDCF:

                break;
            case R.id.btnfindEDCF:

                break;
        }//Switch
    }//M.onClick

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spnUTEjercicioCF:
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