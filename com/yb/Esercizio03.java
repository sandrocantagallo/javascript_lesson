package com.yb;

import java.util.Scanner;

/**
 * Scrivi un programma Java che prende tre numeri da tastiera e stampi il maggiore.
 */

public class Esercizio03 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Digita il primo numero");
        int a = scan.nextInt();
        System.out.println("Digita il secondo numero");
        int b = scan.nextInt();
        System.out.println("Digita il terzo numero");
        int c = scan.nextInt();
        System.out.print("Il numero più grande è: ");
        if ((a > b) && (a > c)) {
            System.out.println(a);
        }
        if ((b > a) && (b > c)) {
            System.out.println(b);
        }
        if ((c > a) && (c > b)) {
            System.out.println(b);
        }
    }
}
