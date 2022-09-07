package com.programma;

import java.util.Random;
                            //ZADANiE 5
public class Task4 {
    public static void main (String[] args){

        int numbers[] = new int[100];
        Random random = new Random();


        for (int i= 0; i<100; i++) {
            numbers[i] = random.nextInt(0, 10);
            System.out.print("[" + numbers[i] + "]"+ " ");
        }
    }
}
