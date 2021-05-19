package com.example.nutrisys.controler;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.nutrisys.AddDepo;
import com.example.nutrisys.DeleteDepo;
import com.example.nutrisys.ListDepo;
import com.example.nutrisys.R;
import com.example.nutrisys.Registros;
import com.example.nutrisys.TEjercicios;
import com.example.nutrisys.UpdateDepo;

public class ejercicioDepo extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private ImageButton btnNew, btnList,btnEdit, btnDel;

    public ejercicioDepo() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ejercicioDepo newInstance(String param1, String param2) {
        ejercicioDepo fragment = new ejercicioDepo();
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
        View root= inflater.inflate(R.layout.fragment_ejercicio_depo, container, false);
        Componentes(root);
        return root;
    }

    private void Componentes (View root){
        Botones(root);
    }


    private void Botones (View root) {
        btnNew = root.findViewById(R.id.btnadd);
        btnNew.setOnClickListener(this);

        btnEdit = root.findViewById(R.id.btneditar);
        btnEdit.setOnClickListener(this);

        btnDel = root.findViewById(R.id.btneliminar);
        btnDel.setOnClickListener(this);

        btnList = root.findViewById(R.id.btnregistros);
        btnList.setOnClickListener(this);
    }//Botones


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnadd:
                Intent intent = new Intent(ejercicioDepo.this.getContext(), AddDepo.class);
                startActivity(intent);
            break;
            /*
            case R.id.btneditar:
                Intent intent1 = new Intent(ejercicioDepo.this.getContext(), UpdateDepo.class);
                startActivity(intent1);

            break;
            case R.id.btneliminar:
                Intent intent2 = new Intent(ejercicioDepo.this.getContext(), DeleteDepo.class);
                startActivity(intent2);
            break;
            case R.id.btnregistros:
                Intent intent3 = new Intent(ejercicioDepo.this.getContext(), ListDepo.class);
                startActivity(intent3);
            break;
            */
        }//switch
    }//onClick
}//class