package com.example.calculresistance;

public class Color {

    public static final String[] valeurCouleursNoms = {
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple",
            "gray",
            "white"
    };

    public static final String[] multiplicateurCouleurNoms = {
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple",
            "gray",
            "white",
            "gold",
            "silver"
    };

    public static final String[] multiplicateurCouleurValeurs = {
            "Ω",
            "Ω",
            "Ω",
            "kΩ",
            "kΩ",
            "kΩ",
            "MΩ",
            "MΩ",
            "MΩ",
            "GΩ",
            "Ω",
            "Ω"
    };

    public static final String[] toleranceCouleurNoms = {
            "brown",
            "red",
            "green",
            "blue",
            "purple",
            "gray",
            "gold",
            "silver"
    };

    public static final String[] coefficientCouleurNoms =  {
            "brown",
            "red",
            "orange",
            "yellow",
            "blue",
            "purple"
    };

    public static final int[] valeurBandesCouleurs = {
            0x000000,       // Black
            0x91672C,       // Brown
            0xFF0000,       // Red
            0xFF6600,       // Orange
            0xFFFF00,       // Yellow
            0x00FF00,       // Green
            0x2169F3,       // Blue
            0x7F00FF,       // Purple
            0x808080,       // Gray
            0xFFFFFF        // White
    };

    public static final int[] multiplicateurBandesCouleurs = {
            0x000000,       //"Ω"  Black
            0x91672C,       //"Ω"  Brown
            0xFF0000,       //"Ω"  Red
            0xFF6600,       //"kΩ" Orange
            0xFFFF00,       //"kΩ" Yellow
            0x00FF00,       //"kΩ" Green
            0x2169F3,       //"MΩ" Blue
            0x7F00FF,       //"MΩ" Purple
            0x808080,       //"MΩ" Gray
            0xFFFFFF,       //"GΩ" White
            0xD4AF37,       //"Ω"  Gold
            0xBEC2CB        //"Ω"  Silver
    };

    public static final int[] toleranceBandesCouleurs = {
            0x91672C,       //1%        Brown
            0xFF0000,       //2%        Red
            0x00FF00,       //.5%       Green
            0x2196F3,       //.25%      Blue
            0x7F00FF,       //.1%       Purple
            0x808080,       //.05%      Gray
            0xD4AF37,       //5%        Gold
            0xBEC2CB        //10%       Silver
    };

    public static final int[] coefficientBandesCouleurs = {
            0x91672C,       //100   Brown
            0xFF0000,       //50    Red
            0xFF6600,       //15    Orange
            0xFFFF00,       //25    Yellow
            0x2196F3,       //10    Blue
            0x7F00FF        //5     Purple

    };

    public static final double[] toleranceBandesValeurs = {
            1,
            2,
            0.5,
            0.25,
            0.1,
            0.05,
            5,
            10
    };

    public static final int[] coefficientBandesValue ={
            100,
            50,
            15,
            25,
            10,
            5
    };

}
