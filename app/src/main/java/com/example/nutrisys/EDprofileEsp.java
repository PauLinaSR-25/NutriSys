package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class EDprofileEsp extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    private Spinner spnGeneroEsp;
    String sx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_dprofile_esp);

        ArrayAdapter<CharSequence> TipoGenero;
        TipoGenero = ArrayAdapter.createFromResource(this,R.array.sx, android.R.layout.simple_spinner_item);
        spnGeneroEsp=findViewById(R.id.spnGeneroEDEsp);
        spnGeneroEsp.setAdapter(TipoGenero);
        spnGeneroEsp.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {

    }

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
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}