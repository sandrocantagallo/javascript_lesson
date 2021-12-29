package com.yb;
public class Casting {
    public static void main(String[] args) {
        /**
         * Salvara la variabile di un tipo in una variabile di un altro tipo. Questa operazione è 
         * definita casting.
         * 
         * Le conversioni possono essere fatte a patto che il range della variabile che va a includere
         * la precedente sia uguale o più grande
         * 
         * Nel caso inverso per evitare errore di conversione in un procedimento inverso dobbiamo noi
         * prenderci la responsabilità utilizzando (tipodato) vedere esempio in linea 18
         * 
         * Che cosa succede se vogliamo convertire un intero con valore molto più ampio di quello
         * ammissibile? vedere linea: 23
         */
        short c = 10;
        int d = c;

        int pippo = 10;
        short pluto  = (short)pippo;

        int big = 100000;
        short small = (short)big; //questa operazione non sarà indolore uscirà un numero molto minore

        
    }
}
