package com.yb;

import java.util.Scanner;

public class EsercizioStringhe02 {
    /**
     * Scrivere un programma che, preso una stringa e un carattere in input, 
     * stampi la posizione di quel carattere nella stringa.
     * 
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Scrivi una parola: ");
            String parola = scan.nextLine(); //il professore non l'ha spiegata tacci sua
            System.out.print("Scrivi una lettera contenuta nella parola: ");
            String lettera = scan.nextLine();
            int position = parola.indexOf(lettera);
            System.out.println("La prima ricorrezza della lettera si trova in posizione: " + position);
        }
    } 
}
