package com.programma;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int numbers[] = new int[5];
                ;
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10, 100);
            System.out.print("[" + numbers[i] + "]" + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                if (numbers[i - 1] >= numbers[i]){
                    System.out.println("\nne vozrastaet");
                break; //остановить если условие предыдущая ячейка больше или равна текущей
            }}
            //если условие совпало
            if (i== numbers.length - 1)
                System.out.print("vozrastaet");
        }
    }
}



