package com.yb;

public class EsercizioCicli {
    /**
     * Stampare da 1 a 100 tutti i numeri divisibili per 3
     * Stampare da 1 a 100 tutti i numeri divisibili per 5
     * Stampare da 1 a 100 tutti i numeri divisibili sia per 3 che per 5ß
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Stampo tutti i numeri da 1 a 100 divisibili per 3");
        for (int i = 1; i<=100; i++) {
            boolean divisibile = i % 3 == 0;
            if (divisibile) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Stampo tutti i numeri da 1 a 100 divisibili per 5");
        for (int i = 1; i<=100; i++) {
            boolean divisibile = i % 5 == 0;
            if (divisibile) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Stampo tutti i numeri da 1 a 100 divisibili per 3 e 5");
        for (int i = 1; i<=100; i++) {
            boolean divisibile = i % 5 == 0;
            boolean divisibile_tre = i % 3 == 0;
            if (divisibile && divisibile_tre) {
                System.out.print(i + " ");
            }
        }
    }
}
