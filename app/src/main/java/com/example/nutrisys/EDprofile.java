package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class EDprofile extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    private Spinner spnGeneroC;
    String sx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_dprofile);

        ArrayAdapter<CharSequence> TipoGenero;
        TipoGenero = ArrayAdapter.createFromResource(this,R.array.sx, android.R.layout.simple_spinner_item);
        spnGeneroC=findViewById(R.id.spnGeneroC);
        spnGeneroC.setAdapter(TipoGenero);
        spnGeneroC.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spnGeneroC:
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