package com.programma;

public class Task2a2 {
    public static void main (String[] args) {
        int numbers [] = new int[] {54, 7, 41, 2, 4, 2, 89, 33, -5, 12};

        for (int i = 0; i < numbers.length; i++){
            System.out.print("{" + numbers[i] + "}" + " ");
        }
        System.out.println();
        int count = 0;
                for ( int i = 0; i < numbers.length; i++ ){
                    count = count + 1;
                   // System.out.print ("||" + count);

                    for ( int j = 0; j < numbers.length; j++ ) {
                    System.out.print("== " + " ");
                    }

        }

    }
}
