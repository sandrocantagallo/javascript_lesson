package com.yb;

import java.util.Scanner;

public class EsercizioStringhe01 {
    /**
     * Scrivere un programma che, preso in input da tastiera una stringa e un numero, 
     * stampa il carattere che si trova nella posizione indicata dal numero preso in input.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Scrivi una parola: ");
        String parola = scan.nextLine(); //il professore non l'ha spiegata tacci sua
        int lunghezza_parola = parola.length();
        System.out.print("Scrivi un numero compreso tra 0 e "+ lunghezza_parola +": ");
        int numero = scan.nextInt();
        char lettera = parola.charAt(numero);
        System.out.println("In quella posiziona è presente il carattere: " + lettera);
    } 
}
