package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class AddDepo3 extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    //Atributos
    private Spinner spnTEpesas;
    String tEp;
    Button btnguardarNF,btncancelarNF;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_depo3);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
        spinnerComponentes();
    }//M.Componentes

    private void spinnerComponentes (){
        ArrayAdapter<CharSequence> TipoEPAdapter;
        TipoEPAdapter = ArrayAdapter.createFromResource(this,R.array.tEpesas, android.R.layout.simple_spinner_item);
        spnTEpesas=findViewById(R.id.spnTEpesas);
        spnTEpesas.setAdapter(TipoEPAdapter);
        spnTEpesas.setOnItemSelectedListener(this);
    }//M.spinnerComponentes

    private void botones (){
        btnguardarNF=findViewById(R.id.btnGuardarNF);
        btnguardarNF.setOnClickListener((View.OnClickListener) this);
        btncancelarNF=findViewById(R.id.btnCancelarNF);
        btncancelarNF.setOnClickListener((View.OnClickListener) this);
    }//M.botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnGuardarNF:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
            case R.id.btnCancelarNF:

                break;
        }//Switch
    }//M.onClick

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spnTEpesas:
                if (position != 0) {
                    tEp = parent.getItemAtPosition(position).toString();
                } else {
                    tEp = "";
                }
                break;
        }//Switch
    }//M.onItemSelected

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }//M.onNothingSelected
}//class