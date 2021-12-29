package com.yb;

//importo la libreria che mi occorre per recuperare i dati da tastiera
import java.util.Scanner;


public class Esercizio02 {
    /**
     * Scrivi un programma Java che prende due numeri da tastiera e stampa “I numeri inseriti sono uguali” se i due numeri sono uguali e viceversa stampa “I numeri inseriti sono diversi”.
     * @param args
     */
    public static void main(String[] args) {
        //istanzio la classe scanner 
        Scanner scan  = new Scanner(System.in); //da ricordare a memoria ma cercare di capirne il senso
        System.out.print("Inserire il primo numero: ");
        int x = scan.nextInt();
        //System.out.println(x);
        System.out.print("Inserire il secondo numero: ");
        int y = scan.nextInt();
        if (x == y) 
            System.out.println("I due numeri sono uguali");
        else
            System.out.println("I due numeri non sono uguali");
    }
}
