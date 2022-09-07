package com.programma;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int numbers[] = new int[9];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 11);
            System.out.print("[" + numbers[i] + "]" + " ");

        }
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                numbers[i] = 0;
            }
        }

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("{" + numbers[i] + "}" + " ");
        }


    }
}