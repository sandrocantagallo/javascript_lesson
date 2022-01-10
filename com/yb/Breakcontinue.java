package com.yb;

public class Breakcontinue {
    public static void main(String[] args) {

        System.out.println("Creo un ciclo FOR che va da 0 a 5 ma salto il numer tre");
        for (int i =0; i<5; i++) {
            if (i == 3)
                continue;
            System.out.println(i);
        }

        System.out.println("Crep un ciclo FOR che va da 0 a 5 ma mi interrompo arrivati al numero 3");

        for (int j = 0; j < 5; j++) {
            System.out.println(j);
            if (j == 3) {
                break;
            }
            
        }
    }
}
