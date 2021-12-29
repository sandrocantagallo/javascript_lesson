package com.yb;
import java.util.Scanner;

public class Inputtastiera {
    public static void main(String[] args) {
        /**
         * Il poter prendere un imput dalla tastiera ci aiuta tantissimo negli esercizi
         * ma al momento è prematuro spiegare il funzionamento di util.Scanner.
         * 
         * 
         */
        Scanner scan  = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int r = scan.nextInt();
        System.out.println("Il numero inserito è: " + r);
        System.out.println("Adesso in serisci un secondo numero: ");
        int t = scan.nextInt();
        System.out.println("Il numero inserito è: " + t);
        System.out.print("Calcolo la somma dei due numeri: ");
        int somma = r+t;
        System.out.println(somma);


    }
}
