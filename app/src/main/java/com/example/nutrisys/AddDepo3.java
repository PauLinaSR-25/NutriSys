package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddDepo3 extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    private Spinner spnTEpesas;
    String tEp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_depo3);

        ArrayAdapter<CharSequence> TipoEPAdapter;
        TipoEPAdapter = ArrayAdapter.createFromResource(this,R.array.tEpesas, android.R.layout.simple_spinner_item);
        spnTEpesas=findViewById(R.id.spnTEpesas);
        spnTEpesas.setAdapter(TipoEPAdapter);
        spnTEpesas.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {

    }

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
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}