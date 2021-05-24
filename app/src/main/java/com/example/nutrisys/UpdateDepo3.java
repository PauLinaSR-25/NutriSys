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

public class UpdateDepo3 extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    //Atributos
    private Spinner spnTEpesas;
    String tEp;
    Button btnguardarEDF, btnCancelarEDF;
    ImageButton btnfindEDF;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_depo3);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
        spinnerComponentes();
    }//M.Componentes

    private void spinnerComponentes (){
        ArrayAdapter<CharSequence> TipoEPAdapter;
        TipoEPAdapter = ArrayAdapter.createFromResource(this,R.array.tEpesas, android.R.layout.simple_spinner_item);
        spnTEpesas=findViewById(R.id.spnUTEpesas);
        spnTEpesas.setAdapter(TipoEPAdapter);
        spnTEpesas.setOnItemSelectedListener(this);
    }//M.spinnerComponentes

    private void botones (){
        btnguardarEDF=findViewById(R.id.btnGuardarEDF);
        btnguardarEDF.setOnClickListener((View.OnClickListener) this);
        btnCancelarEDF=findViewById(R.id.btnCancelarEDF);
        btnCancelarEDF.setOnClickListener((View.OnClickListener) this);
        btnfindEDF=findViewById(R.id.btnfindEDF);
        btnfindEDF.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnGuardarEDF:
                // intent = new Intent(v.getContext(),AddDepo3.class);
                // startActivity(intent);
                break;
            case R.id.btnCancelarEDF:

                break;
            case R.id.btnfindEDF:

                break;
        }//Switch
    }//M.onClick

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {

            case R.id.spnUTEpesas:
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