package com.yb;
import java.util.Scanner;
public class Esercizio04 {
    /**
     * Scrivi un programma Java che restituisce il numero di giorni di un mese dato in input dall’utente. Il mese è dato sotto forma di intero, ad esempio 3 corrisponde a marzo. Ignorare gli anni bisestili.
     * Immettere un numero di mese: 2
     * Febbraio ha 28 giorni
     * @param args
     */
    public static void main(String[] args) {
        try (//includo la possibilità di recuperare dati dalla linea di comando
        Scanner scan = new Scanner(System.in)) {
            System.out.print("Indica un numero compreso tra 1 e 12 rappresentante un mese: ");
            int mese = scan.nextInt();
            if ((mese>=1) && (mese<=12)) {
                System.out.println("Il numero indicato è: " + mese);
                if (mese == 1) 
                    System.out.println("Gennaio ha 31 giorni");
                if (mese == 2)
                    System.out.println("Febbraio ha 28 giorni");
                if (mese == 3) 
                    System.out.println("Marzo ha 31 giorni");
                if (mese == 4) 
                    System.out.println("Aprile ha 30 giorni");
                if (mese == 5) 
                    System.out.println("Maggio ha 31 giorni");
                if (mese == 6) 
                    System.out.println("Giugno ha 30 giorni");
                if (mese == 7) 
                    System.out.println("Luglio ha 31 giorni");
                if (mese == 8) 
                    System.out.println("Agosto ha 31 giorni");
                if (mese == 9) 
                    System.out.println("Settembre ha 30 giorni");
                if (mese == 10) 
                    System.out.println("Ottobre ha 31 giorni");
                if (mese == 11) 
                    System.out.println("Novembre ha 30 giorni");
                if (mese == 12) 
                    System.out.println("Dicembre ha 31 giorni");
            } else {
                System.out.println("Il numero indicato non è un mese");
            }
        }
    }
}
