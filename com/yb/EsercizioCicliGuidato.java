package com.yb;

import java.util.Scanner;

public class EsercizioCicliGuidato {

    /**
     * trova tutte le terzine uniche in modo tale che la somma di tutti e tre gli elementi sia uguale al numero specificato rispettand la condizione
     * [x,y,z (x < y < z)]
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Scrivi un numero: ");
        int numero  = scan.nextInt();
        
        for (int x=1; x < numero; x++) {
            for (int y = x+1; y<numero; y++) {
                for (int z = y+1; z<numero; z++) {
                    if (x+y+z == numero ) {
                        System.out.println(x + " + "+ y + " + " +z + " = " + numero);
                    }
                }
            }
        }
    }
}
