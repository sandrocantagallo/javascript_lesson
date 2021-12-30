package com.yb;

/**
 * parliamo di un tipo di variabile
 * 
 * String
 * 
 *  Le stringhe sono case sensitive
 *  quello che metti in una stringa deve essere in doppi apici
 *  
 *  ci sono tantissimi altri metodi sulle stringhe ma per l'elenco completo conviene andarsi a vedere
 *  sulla documentazione java per vedere tutto
 */

public class Lestringhe {
    static public void main(String[] args) {
        String g = "Ciao mamma";
        String h = "Ciao Mamma";

        if (g.equals(h)) {
            System.out.println("Sono uguali le stringhe");
        } else {
            System.out.println("Le stringhe sono differenti");
        }

        //avere la lunghezza di una stringa
        int string_lenght = g.length();
        System.out.println("La stringa: " + g + " è lunga: " + string_lenght + " caratteri.");

        //trasformo una stringa tutto in minuscolo
        String lower = h.toLowerCase();
        System.out.println("In minuscolo si scrive: " + lower);

        //scrivo una stringa in maiuscolo
        System.out.println(g.toUpperCase());

        //unisco due stringhe
        String big = g + " " + h;
        System.out.println(big);

        //funzionalità di replace
        String sostituzione = g.replace("mamma", "papa");
        System.out.println(sostituzione);

        //posizione di un carattere specifico
        int indexof = g.indexOf("mamma");
        if (indexof>0) {
            System.out.println("ho trovato la stringa");
        }
        System.out.println(indexof);
        
        //far ritornare una sottostringa
        String substringa = g.substring(0, 5);
        System.out.println(substringa);

        //che carattere si trova in una determinata posizione
        char lettera = g.charAt(3);
        System.out.println(lettera);
    }
}
