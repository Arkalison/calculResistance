package com.example.calculresistance.utilities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculresistance.Color;
import com.example.calculresistance.R;
import com.example.calculresistance.Resistance;

public class Bandes_4 extends Resistance{

    private View val1;
    private View val2;
    private View multiplicateur;
    private View tolerance;

    Button btn_val1;
    Button btn_val2;
    Button btn_multiplicateur;
    Button btn_tolerance;

    TextView output;

    Color c = new Color();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.res_4_bandes_layout, container, false);

        val1 = view.findViewById(R.id.valeur1);
        val2 = view.findViewById(R.id.valeur2);
        multiplicateur = view.findViewById(R.id.multiplicateur);

        output = (TextView)view.findViewById(R.id.textView1);

        btn_val1 = (Button)view.findViewById(R.id.btn_4_val1);
        btn_val2 = (Button)view.findViewById(R.id.btn_4_val2);
        btn_multiplicateur = (Button)view.findViewById(R.id.btn_4_multiplicateur);
        btn_tolerance = (Button)view.findViewById(R.id.btn_4_tolerance);

        chargerParametreVue(output, getActivity(),4);

        btn_val1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choixCouleur(1, btn_val1, val1);
            }
        });

        btn_val2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choixCouleur(2, btn_val2, val2);
            }
        });

        btn_multiplicateur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choixCouleur(4, btn_multiplicateur, multiplicateur);
            }
        });

        btn_tolerance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choixCouleur(5, btn_tolerance, tolerance);
            }
        });

        return view;
    }
}
