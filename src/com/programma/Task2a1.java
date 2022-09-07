package com.programma;

public class Task2a1 {
  public static void main (String[] args) {

        int numbers[] = new int[] {-4, -3, -2, -1, 0, 1, 2, 3, 4};

       for (int i = 0; i < numbers.length; i++) {
           System.out.print("{" + numbers[i] + "}" + " ");
        }
        System.out.println();
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0)
                j = j + 1;
            System.out.print("|" + numbers[i] + "|" + "");
        }
        System.out.println();
        System.out.print("Kolichestvo polozhitelnih elementov" + " >> " + j + " <<");
        System.out.println();

      for (int i = numbers.length -1; i>= 0; i--){
          System.out.print(numbers[i]);}

      System.out.println();
      System.out.println("=======================================");
      System.out.println();


      int reverse[] = new int[8];
      int n = numbers.length;
      for (int i = 0; i < numbers.length /2; i++){
         numbers[n - i -1]

          a++;

      }
      System.out.print(a);
    }
}
