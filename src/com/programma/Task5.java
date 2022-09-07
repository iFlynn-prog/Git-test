package com.programma;
                    //ZADANIE 6
public class Task5 {
    public static void main(String[] args){
        int avg = 0;
        int sum = 0;

        int numbers[] =new int[40];
        for (int i =2; i <40; i+=2) {
            numbers[i] = i;
            System.out.print("|" + numbers[i] + "|" + " ");
            sum = sum + numbers[i];
            avg = sum / numbers.length;

        }

        System.out.println("\nSumma =>>" + " " + sum + " " + "<<==");
        System.out.println("AVG =>>" + " " + avg + " " + "<<==");



    }
}

