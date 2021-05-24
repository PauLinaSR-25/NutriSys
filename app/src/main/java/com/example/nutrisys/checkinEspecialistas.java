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

public class checkinEspecialistas extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    //Atributos
    Button btnregistrarnewE;
    private Spinner spnTespecialidad;
    String tE;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin_especialistas);

        componentes();
    }//M.onCreate

    private void componentes (){
        botones();
        spinnerComponentes();
    }//M.Componentes

    private void spinnerComponentes (){
        ArrayAdapter<CharSequence> TipoEAdapter;
        TipoEAdapter = ArrayAdapter.createFromResource(this,R.array.tE, android.R.layout.simple_spinner_item);
        spnTespecialidad=findViewById(R.id.spnTEspecialidadNewE);
        spnTespecialidad.setAdapter(TipoEAdapter);
        spnTespecialidad.setOnItemSelectedListener(this);
    }//M.spinnerComponentes

    private void botones (){
        btnregistrarnewE=findViewById(R.id.btnregisNewE);
        btnregistrarnewE.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnregisNewE:
                if(obtenerPosicionItem(spnTespecialidad,tE)==0) {
                    Intent intent = new Intent(v.getContext(), main_opcionNutri.class);
                    startActivity(intent);
                }//menu de nutriologo
                if(obtenerPosicionItem(spnTespecialidad,tE)==1) {
                    Intent intent = new Intent(v.getContext(), main_opcionPsico.class);
                    startActivity(intent);
                }//menu de psicologo
                if(obtenerPosicionItem(spnTespecialidad,tE)==2) {
                    Intent intent = new Intent(v.getContext(), main_opcionDepo.class);
                    startActivity(intent);
                }//menu de deportista
                break;
        }//switch
    }//M.onClick

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spnTEspecialidadNewE:
                if (position != 0) {
                    tE = parent.getItemAtPosition(position).toString();
                } else {
                    tE = "";
                }
                break;
        }//switch
    }//M.onItemSelected

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }//M.onNothingSelected

    public static int obtenerPosicionItem(Spinner spinner, String fruta) {
        //Creamos la variable posicion y lo inicializamos en 0
        int posicion = 0;
        //Recorre el spinner en busca del ítem que coincida con el parametro `String fruta`
        //que lo pasaremos posteriormente
        for (int i = 0; i < spinner.getCount(); i++) {
            //Almacena la posición del ítem que coincida con la búsqueda
            if (spinner.getItemAtPosition(i).toString().equalsIgnoreCase(fruta)) {
                posicion = i;
            }
        }
        //Devuelve un valor entero (si encontro una coincidencia devuelve la
        // posición 0 o N, de lo contrario devuelve 0 = posición inicial)
        return posicion;
    }//M.obtenerPosicionItem
}//class