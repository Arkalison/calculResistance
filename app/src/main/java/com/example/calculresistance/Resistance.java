package com.example.calculresistance;

import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;
import java.util.List;

import petrov.kristiyan.colorpicker.ColorPicker;

public class Resistance extends Fragment {

    Color c = new Color();

    protected TextView output;
    protected FragmentActivity fa;
    protected int count;

    private double multiplicateur = 1f;
    private String unite = "Ω";

    private double tolerance = 10f;

    private double coefficient = 0f;

    private String[] valeur = {"", "", ""};

    public void chargerParametreVue(TextView textView1, FragmentActivity fa1, int count1){
        this.output = textView1;
        this.fa = fa1;
        this.count = count1;
    }

    public void afficheResultat(String valeur, double tolerance, double coefficient){
        output.setText(valeur + " ± " + tolerance + " % " + coefficient + " ppm");
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public int nombre(String[] nb){
        int val;

        if(count != 4) val = Integer.parseInt(String.join("",nb[0], nb[1], nb[2]));
        else val = Integer.parseInt(String.join("", nb[0], nb[1]));

        return val;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private int convertionNombre(String[] nb){
        int val = 0;

        if(nb[0] == "0") val=0;
        else val = nombre(nb);

        return val;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void afficheBoutonText(Button button, int bandes, int pos){
        String text;
        int val = 0;

        switch (bandes){
            case 1:
                text = Color.valeurCouleursNoms[pos];
                valeur[0] = String.valueOf(pos);
                break;
            case 2:
                text = Color.valeurCouleursNoms[pos];
                valeur[1] = String.valueOf(pos);
                break;
            case 3:
                text = Color.valeurCouleursNoms[pos];
                valeur[2] = String.valueOf(pos);
                break;
            case 4:
                text = Color.multiplicateurCouleurNoms[pos];
                multiplicateur = Color.multiplicateurBandesValeurs[pos];
                unite = Color.multiplicateurCouleurValeurs[pos];
                break;
            case 5:
                text = Color.toleranceCouleurNoms[pos];
                tolerance = Color.toleranceBandesValeurs[pos];
                break;
            case 6:
                text = Color.coefficientCouleurNoms[pos];
                coefficient = Color.coefficientBandesValeurs[pos];
                break;

            default:
                throw new IllegalStateException("Valeur inattendue: " + bandes);
        }

        button.setText(text);

        int nb = convertionNombre(valeur);
        double valAff = nb * multiplicateur;

        if(valAff < 1)afficheResultat(String.valueOf(valAff) + unite, tolerance, coefficient);
        else afficheResultat(String.valueOf((int)valAff) + unite, tolerance, coefficient);
    }

    protected ArrayList<String> chargeCouleur(int[] couleur){
        ArrayList<String> couleurs = new ArrayList<>();

        for(int i = 0; i < couleur.length; i++){
            couleurs.add(String.format("#%06X", couleur[i]));
        }
        return couleurs;
    }

    public int choixCouleur(int bandes, Button bouton, View view){
        int[] couleur = {0};

        ColorPicker colorPicker = new ColorPicker(fa);

        colorPicker.setTitle("Palette de couleur");

        switch (bandes){
            case 1:
                colorPicker.setColors(chargeCouleur(Color.valeurBandesCouleurs));
                break;
            case 2:
                colorPicker.setColors(chargeCouleur(Color.valeurBandesCouleurs));
                break;
            case 3:
                colorPicker.setColors(chargeCouleur(Color.valeurBandesCouleurs));
                break;
            case 4:
                colorPicker.setColors(chargeCouleur(Color.multiplicateurBandesCouleurs));
                break;
            case 5:
                colorPicker.setColors(chargeCouleur(Color.toleranceBandesCouleurs));
                break;
            case 6:
                colorPicker.setColors(chargeCouleur(Color.coefficientBandesCouleurs));
                break;

        }

        colorPicker.setOnFastChooseColorListener(new ColorPicker.OnFastChooseColorListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void setOnFastChooseColorListener(int position, int color) {
                couleur[0] = position;
                view.setBackgroundColor(color);

                afficheBoutonText(bouton,bandes, position);
            }

            @Override
            public void onCancel() {

            }
        }).show();

        return couleur[0];

    }

}
