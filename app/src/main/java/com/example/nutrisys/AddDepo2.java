package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddDepo2 extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private Spinner spnTEjercicios;
    String tE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_depo2);

        ArrayAdapter<CharSequence> TipoEAdapter;
        TipoEAdapter = ArrayAdapter.createFromResource(this,R.array.tEjer, android.R.layout.simple_spinner_item);
        spnTEjercicios=findViewById(R.id.spnTEjercicio);
        spnTEjercicios.setAdapter(TipoEAdapter);
        spnTEjercicios.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spnTEjercicio:
                if (position != 0) {
                    tE = parent.getItemAtPosition(position).toString();
                } else {
                    tE = "";
                }
                break;
        }//Switch

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}