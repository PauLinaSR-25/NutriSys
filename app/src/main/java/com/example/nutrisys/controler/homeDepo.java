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

public class homeDepo extends Fragment implements View.OnClickListener{

    //Atributos
    private Button btnModifica;

    public homeDepo() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }//M.onCreate

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_home_depo, container, false);
        Componentes(root);
        return root;
    }//M.onCreateView

    private void Componentes (View root){
        Botones(root);
    }//M.Componetes

    private void Botones (View root){

        btnModifica=root.findViewById(R.id.btnEditarPDepo);
        btnModifica.setOnClickListener((View.OnClickListener) this);
    }//M.Botones

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnEditarPDepo:
                intent = new Intent(homeDepo.this.getContext(), EDprofileEsp.class);
                startActivity(intent);
                break;
        }//Switch
    }//M.onClick
}//Class