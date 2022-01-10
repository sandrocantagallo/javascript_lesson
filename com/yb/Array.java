package com.yb;

public class Array {

    public static void main(String[] args) {
        int[] pippo = new int[60];

        pippo[58] = 123;

        for (int i = 0; i<pippo.length;i++) {
            System.out.println(pippo[i]);
        }

    }
    
}
