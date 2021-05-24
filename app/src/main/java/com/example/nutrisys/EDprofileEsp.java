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

public class EDprofileEsp extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{


    //Atributos
    private Spinner spnGeneroEsp;
    String sx;
    ImageButton btncalendarioEDEsp;
    Button btnGuardarEDEsp,btnCancelarEDEsp;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_dprofile_esp);


        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
        spinnerComponentes();
    }//M.Componentes

    private void spinnerComponentes (){
        ArrayAdapter<CharSequence> TipoGenero;
        TipoGenero = ArrayAdapter.createFromResource(this,R.array.sx, android.R.layout.simple_spinner_item);
        spnGeneroEsp=findViewById(R.id.spnGeneroEDEsp);
        spnGeneroEsp.setAdapter(TipoGenero);
        spnGeneroEsp.setOnItemSelectedListener(this);
    }//M.spinnerComponentes

    private void botones (){
        btncalendarioEDEsp=findViewById(R.id.btnCalendarioEDEsp);
        btncalendarioEDEsp.setOnClickListener((View.OnClickListener) this);
        btnGuardarEDEsp=findViewById(R.id.btnGuardarEDEsp);
        btnGuardarEDEsp.setOnClickListener((View.OnClickListener) this);
        btnCancelarEDEsp=findViewById(R.id.btnCancelarEDEsp);
        btnCancelarEDEsp.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnCalendarioEDEsp:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
            case R.id.btnCancelarEDEsp:

                break;
            case R.id.btnGuardarEDEsp:

                break;
        }//Switch
    }//M.onClick

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spnGeneroEDEsp:
                if (position != 0) {
                    sx = parent.getItemAtPosition(position).toString();
                } else {
                    sx = "";
                }
                break;
        }//Switch
    }//M.onItemSelected

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }//M.onNothingSelected
}//class