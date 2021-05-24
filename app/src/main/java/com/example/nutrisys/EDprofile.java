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

public class EDprofile extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    //Atributos
    private Spinner spnGeneroC;
    String sx;
    ImageButton btncalendarioEDC;
    Button btnGuardarEDC,btnCancelarEDC;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_dprofile);

        componentes();

    }//M.onCreate

    private void componentes (){
        botones();
        spinnerComponentes();
    }//M.Componentes

    private void spinnerComponentes (){
        ArrayAdapter<CharSequence> TipoGenero;
        TipoGenero = ArrayAdapter.createFromResource(this,R.array.sx, android.R.layout.simple_spinner_item);
        spnGeneroC=findViewById(R.id.spnGeneroEDC);
        spnGeneroC.setAdapter(TipoGenero);
        spnGeneroC.setOnItemSelectedListener(this);
    }//M.spinnerComponentes

    private void botones (){
        btncalendarioEDC=findViewById(R.id.btnCalendarioEDC);
        btncalendarioEDC.setOnClickListener((View.OnClickListener) this);
        btnGuardarEDC=findViewById(R.id.btnGuardarEDC);
        btnGuardarEDC.setOnClickListener((View.OnClickListener) this);
        btnCancelarEDC=findViewById(R.id.btnCancelarEDC);
        btnCancelarEDC.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnCalendarioEDC:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
            case R.id.btnCancelarEDC:

                break;
            case R.id.btnGuardarEDC:

                break;
        }//Switch
    }//M.onClick

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spnGeneroEDC:
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