package com.example.calculresistance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Bandes_6 extends Resistance{

    private View val1;
    private View val2;
    private View val3;
    private View multiplicateur;
    private View tolerance;
    private View coefTemperature;

    Button btn_val1;
    Button btn_val2;
    Button btn_val3;
    Button btn_multiplier;
    Button btn_tolerance;
    Button btn_coef;

    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.res_5_bandes_layout, container, false);

        val1 = view.findViewById(R.id.valeur1);
        val2 = view.findViewById(R.id.valeur2);
        val3 = view.findViewById(R.id.valeur3);
        multiplicateur = view.findViewById(R.id.multiplicateur);
        tolerance = view.findViewById(R.id.tolerance);
        coefTemperature = view.findViewById(R.id.temperature_coef);

        textView = (TextView)view.findViewById(R.id.textView2);

        btn_val1 = (Button)view.findViewById(R.id.btn_5_bandes_val1);
        btn_val2 = (Button)view.findViewById(R.id.btn_5_bandes_val2);
        btn_val3 = (Button)view.findViewById(R.id.btn_5_bandes_val3);
        btn_multiplier = (Button)view.findViewById(R.id.btn_5_bandes_multiplicateur);
        btn_tolerance = (Button)view.findViewById(R.id.btn_5_bandes_tolerance);

        chargerParametreVue(textView, getActivity(), 5);

        btn_val1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choixCouleur(1, btn_val1, val1);
            }
        });

        btn_val2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choixCouleur(2, btn_val2, val2);
            }
        });

        btn_val3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choixCouleur(3, btn_val3, val3);
            }
        });

        btn_multiplier.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choixCouleur(4, btn_multiplier, multiplicateur);
            }
        });

        btn_tolerance.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choixCouleur(5, btn_tolerance, tolerance);
            }
        });

        btn_coef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choixCouleur(6, btn_coef, coefTemperature);
            }
        });


        return view;
    }
}
