package com.example.nutrisys.controler;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nutrisys.EDprofile;
import com.example.nutrisys.EDprofileEsp;
import com.example.nutrisys.R;

public class homePsico extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button btnModifica;

    public homePsico() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static homePsico newInstance(String param1, String param2) {
        homePsico fragment = new homePsico();
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
        View root= inflater.inflate(R.layout.fragment_home_psico, container, false);
        Componentes(root);
        return root;
    }

    private void Componentes (View root){
        Botones(root);
    }

    private void Botones (View root){

        btnModifica = root.findViewById(R.id.btnEditarPPsico);
        btnModifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homePsico.this.getContext(), EDprofileEsp.class);
                startActivity(intent);
            }
        });
    }

}//Class