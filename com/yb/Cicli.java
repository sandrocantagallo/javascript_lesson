package com.yb;

public class Cicli {
    /**
     * i cicli sono un blocco di istruzioni da eseguire
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("CICLO WHILE");
        int x = 10;
        while(x > 0) { //qui la condizione fine a quando sarà vera fara
            //le istruzioni scritte qui dentro
            System.out.println("Ciao");
            x--; //se non decremento il ciclo sarà infinito e non si fermerà mai
        }

        /**
         * si divide in 3 macroparti
         * 
         * nella prima il contatore
         * il ciclo sarà eseguita finché sarà vera la condizione booleana in mezzo
         * nell'ultima parte incremento il contatore
         */
        System.out.println("CICLO FOR");
        for (int i = 10; i > 0 ; i-- ) {
            System.out.println("Ciao");
        }

    }
}
