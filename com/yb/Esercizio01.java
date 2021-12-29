package com.yb;

//importo la libreria che mi occorre per recuperare i dati da tastiera
import java.util.Scanner;


public class Esercizio01 {
    /**
     * Scrivi un programma Java che prende due numeri da tastiera e stampa quello è più grande.
     *  Esempio 
     *  Dati di test:
     *  Inserire il primo numero: 10
     *  Inserire il secondo numero: 5
     *  Uscita prevista:
     *  Il primo numero è più grande del secondo
     * 
     *  prendere a modello quanto scritto sul file Inputtastiera.java
     */
    public static void main(String[] args) {
        //istanzio la classe scanner 
        Scanner scan  = new Scanner(System.in); //da ricordare a memoria ma cercare di capirne il senso
        System.out.print("Inserire il primo numero: ");
        int x = scan.nextInt();
        //System.out.println(x);
        System.out.print("Inserire il secondo numero: ");
        int y = scan.nextInt();
        if (x>y) 
            System.out.println("Il pirmo numero: " + x + " è più grande del secondo numero : " + y);
        else
            System.out.println("Il secondo numero: " + y +" è più grande del primo numero : " + x);
    }
}
