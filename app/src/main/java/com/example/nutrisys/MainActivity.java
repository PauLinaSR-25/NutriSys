package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{

    //Atributos
    private Spinner spnTusuario;
    String tU;
    Button btnlogin, btnregistrar;


    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        componentes();
    }//M. onCreate

    private void componentes (){
        botones();
        spinnerComponentes();
    }//M.Componentes

    private void botones (){
        btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener((View.OnClickListener) this);

        btnregistrar=findViewById(R.id.btnregis);
        btnregistrar.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    private void spinnerComponentes (){
        ArrayAdapter<CharSequence> TipoUAdapter;
        TipoUAdapter = ArrayAdapter.createFromResource(this,R.array.tu, android.R.layout.simple_spinner_item);
        spnTusuario=findViewById(R.id.spnTUsuario);
        spnTusuario.setAdapter(TipoUAdapter);
        spnTusuario.setOnItemSelectedListener(this);
    }//M.spinnerComponentes

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spnTUsuario:
                if (position != 0) {
                    tU = parent.getItemAtPosition(position).toString();
                } else {
                    tU = "";
                }
                break;
        }//Switch
    }//M.onItemSelected

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }//M.onNothingSelected

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogin:
                        if(obtenerPosicionItem(spnTusuario,tU)==1) {
                            Intent intent = new Intent(v.getContext(), main_opcion.class);
                            startActivity(intent);
                        }//Menu de cliente
                        else{

                        }//Menú de especialista
                break;

            case R.id.btnregis:
                if(obtenerPosicionItem(spnTusuario,tU)==1) {
                    Intent intent = new Intent(v.getContext(), checkin.class);
                    startActivity(intent);
                }//registro de cliente
                else{
                    Intent intent = new Intent(v.getContext(), checkinEspecialistas.class);
                    startActivity(intent);
                }//registro de especialista
                break;
        }//switch
    }//M.onClick

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