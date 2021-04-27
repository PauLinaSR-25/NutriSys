package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkin extends AppCompatActivity implements View.OnClickListener{

    Button btnregistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);

        btnregistro=findViewById(R.id.btnregis);
        btnregistro.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnregis:
                    Intent intent = new Intent(v.getContext(), main_opcion.class);
                    startActivity(intent);
                break;
        }
    }
}