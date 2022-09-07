package com.programma;
import java.util.Random;

public class Task8 {
    public static void main(String[] args){
        int numbers[] = new int[16];
        // Переменная счетчика
        int count = 0;
        Random random = new Random();
        for(int i= 0; i < numbers.length; i++){
            numbers[i] = random.nextInt( 0, 10);
            System.out.print("["+ numbers[i] + "]" + " ");
             }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                // Если число четное, то счетчик +1
                count = count + 1;
        }

        System.out.println ("\nSumma ==>>" + " " +count );

    }

}
