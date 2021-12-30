package com.yb;

import java.util.Scanner;

public class EsercizioStringhe03 {
    /**
     * Scrivere un programma che, prese due stringhe in input, stampi la loro unione.
     * 
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Scrivi una parola: ");
            String parola = scan.nextLine(); //il professore non l'ha spiegata tacci sua
            System.out.print("Scrivi una seconda parola: ");
            String parola_due = scan.nextLine(); //il professore non l'ha spiegata tacci sua
            String parolone = parola + parola_due;
            System.out.println("La parolona: " + parolone);
        }
    } 
}
