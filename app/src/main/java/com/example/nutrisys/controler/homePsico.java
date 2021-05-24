package com.example.nutrisys.controler;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nutrisys.EDprofileEsp;
import com.example.nutrisys.R;

public class homePsico extends Fragment implements View.OnClickListener{

    //Atributos
    private Button btnModifica;

    public homePsico() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_home_psico, container, false);
        Componentes(root);
        return root;
    }//M.onCreateView

    private void Componentes (View root){
        Botones(root);
    }//M.componentes

    private void Botones (View root){
        btnModifica=root.findViewById(R.id.btnEditarPPsico);
        btnModifica.setOnClickListener((View.OnClickListener) this);

    }//Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnEditarPPsico:
                intent = new Intent(homePsico.this.getContext(), EDprofileEsp.class);
                startActivity(intent);
                break;
        }//Switch
    }//M.onClick
}//Class