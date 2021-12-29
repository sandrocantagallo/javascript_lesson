package com.yb;

public class Ifesle {
    public static void main(String[] args) {
        /**
         * Se è vera una condizione fai questo altrimenti fai altro
         * gli operatori logici sono simili a PHP
         * 
         * <> == !=  oppure applicare una variabile booleana
         * 
         * if può tranquillamente stare senza else
         * 
         * Se dentro al blocco di condizione c'è solo una istruzione possiamo toglire la parentesi graffe
         * 
         * Come per il PHP gli IF si possono annidare
         */

         int x = 13;

         if (x > 0) { //la condizione deve essere booleana
            //condizione vera
            System.out.println("La variabile x è maggiore di 0 infatti è uguale a: " + x);

            if (x>10) 
                System.out.println("La tua variabile è proprio grossa!");
            

         } else {
            //condizione false
            System.out.println("La variabile x è inferiore a 0 infatti è uguale a: " + x);
         }
    }
}
