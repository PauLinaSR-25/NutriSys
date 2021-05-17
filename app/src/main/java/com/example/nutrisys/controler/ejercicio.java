package com.example.nutrisys.controler;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.nutrisys.Cardio;
import com.example.nutrisys.EDprofile;
import com.example.nutrisys.Estiramiento;
import com.example.nutrisys.InfoGeneral;
import com.example.nutrisys.Pesas;
import com.example.nutrisys.R;
import com.example.nutrisys.Registros;
import com.example.nutrisys.TEjercicios;
import com.example.nutrisys.checkin;
import com.example.nutrisys.checkinEspecialistas;
import com.example.nutrisys.main_opcion;

public class ejercicio extends Fragment implements View.OnClickListener{
    //variables
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    private ImageButton btnLEjercicios, btnLRegistros,btnstart, btnstop, btnreset;
    boolean isOn=false;
    TextView crono;
    Thread cronos;
    int mili=0, seg=0, minutos=0;
    ProgressBar Progress;


    Handler h=new Handler();

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
    }//M. onCreateView

    private void Componentes (View root){
        Botones(root);
    }

    private void Botones (View root){
        btnreset = root.findViewById(R.id.btnrepeat);
        btnreset.setOnClickListener(this);
        btnstart = root.findViewById(R.id.btnplay);
        btnstart.setOnClickListener(this);
        btnstop = root.findViewById(R.id.btnstop);
        btnstop.setOnClickListener(this);

        crono = root.findViewById(R.id.TVCrono);
        crono.setOnClickListener(this);
        Progress = root.findViewById(R.id.progress_bar);
        Progress.setOnClickListener(this);

        btnLEjercicios = root.findViewById(R.id.btneLEjercicios);
        btnLEjercicios.setOnClickListener(this);
        btnLRegistros = root.findViewById(R.id.btnregistros);
        btnLRegistros.setOnClickListener(this);

        cronos = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(isOn){
                        try {
                            Thread.sleep(1);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }//catch
                        mili++;
                        if(mili == 999){
                            seg++;
                            mili=0;
                        }//if mili
                        if(seg == 59){
                            minutos++;
                            seg=0;
                        }//if seg
                        h.post(new Runnable() {
                            @Override
                            public void run() {
                                String m="", s="",mi="";
                                if(mili<10){
                                    m="00"+mili;
                                }else if (mili<100){
                                    m="0"+mili;
                                }else {
                                    m=""+mili;
                                }
                                if (seg <10){
                                    s="0"+seg;
                                }else{
                                    s=""+seg;
                                }
                                if (minutos<10){
                                    mi="0"+minutos;
                                }else {
                                    mi=""+minutos;
                                }
                                crono.setText(mi+":"+s+":"+m);
                                Progress.setProgress(100*seg/60);
                            }// run
                        });
                    }//if isOn
                }//while
            }//run
        });//hilo
        cronos.start();
    }//M. Botones

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnplay:
                isOn=true;
                break;
            case R.id.btnstop:
                isOn=false;
                break;
            case R.id.btnrepeat:
                isOn=false;
                mili=0;
                seg=0;
                minutos=0;
                crono.setText("00:00:000");
                Progress.setProgress(0);
                break;
            case R.id.btneLEjercicios: {
                Intent intent = new Intent(ejercicio.this.getContext(), TEjercicios.class);
                startActivity(intent);
            }
                break;
            case R.id.btnregistros: {
                Intent intent = new Intent(ejercicio.this.getContext(), Registros.class);
                startActivity(intent);
            }
                break;
        }//switch
    }
}//class