package com.yb;

public class Datiprimitivi {
    public static void main(String[] args) {
        
        /**
         * Lezione sulle variabili e i tipi di dati primitivi.
         * Su JAva i tipi di dati sono:
         * 
         * byte     numero compresi tra -128 e +128 (ma in realtà se scrivo 128 mi da già errore)
         * short    numero compreso tra -32768 a +32768 gli short includono ovviamente i byte
         * int      numero compreso fino a +- 21 milioni
         * long     numero più grandi fino a 90 miliardi
         * double   numeri con la virgola
         * float    numeri con la virgola ma possiamo scrivere meno cifre rispetto a double
         * char     ci possiamo inserire una carattere
         * boolean  può avere solo due valore true o false
         */
        byte b;
        b = 127;
        short s;
        s=32767;
        long l;
        l = 99L; //sta a dichiarare un numero lungo
        double num = -45.3;
        float numf  = 55.099F;
        char rdue = 'r';
        boolean check = true;
        check  = false;
        
        //in questa variabile posso metterci soltando numeri
        int x;
        //assegno un valore alla varabile x
        x = 20;
        x = 40;
        //posso dichiarare e dare subito valore
        int i = 30;

        //i tipi di dati primitivi sono:
        //
        
        //tutti i tipi di numeri interi
        int numeri = 1;

        /**
         * Esercizi di riepilogo del corso
         */

        // Creare una variabile del tipo opportuno per contenere una media aritmetica
        float media_aritmetica; //in questo moto dovrebbe contenere anche risultati con numeri periodici

        //Creare una variabile del tipo opportuno per contenere una potenza del due
        int potenza_del_due; //ma qui non ne sono molto sicuro

        //Creare una variabile del tipo opportuno per contenere una frazione
        long frazione; //necessario? nel dubbio uso il massimo che ho a disposizione

        //Creare una variabile del tipo opportuno per contenere il peso di una persona
        double peso_di_una_persona; //credo sia più che sufficente per una rappresentazione in Kg/gr

        //Creare una variabile intera e assegnare come valore 30
        int var_int = 30;
    }
}