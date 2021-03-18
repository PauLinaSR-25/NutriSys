package com.example.nutrisys.controler;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.nutrisys.Cardio;
import com.example.nutrisys.EDprofile;
import com.example.nutrisys.Estiramiento;
import com.example.nutrisys.InfoGeneral;
import com.example.nutrisys.Pesas;
import com.example.nutrisys.R;

public class ejercicio extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ImageButton btnFuerza,btnCardio,btnFlexibilidad,btnInfo;

    public ejercicio() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ejercicio newInstance(String param1, String param2) {
        ejercicio fragment = new ejercicio();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_ejercicio, container, false);
        Componentes(root);
        return root;
    }

    private void Componentes (View root){
        Botones(root);
    }

    private void Botones (View root){

        btnFuerza = root.findViewById(R.id.btnfuerza);
        btnFuerza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ejercicio.this.getContext(), Pesas.class);
                startActivity(intent);
            }
        });

        btnCardio = root.findViewById(R.id.btncardio);
        btnCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ejercicio.this.getContext(), Cardio.class);
                startActivity(intent);
            }
        });

        btnFlexibilidad = root.findViewById(R.id.btnestira);
        btnFlexibilidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ejercicio.this.getContext(), Estiramiento.class);
                startActivity(intent);
            }
        });

        btnInfo = root.findViewById(R.id.btninfo);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ejercicio.this.getContext(), InfoGeneral.class);
                startActivity(intent);
            }
        });
    }
}