package Algorithmen.Beispiele;

import java.util.Scanner;

public class Logarithmus {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        logarithmus();
    }

    public static void logarithmus(){
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("X: ");
        int x = scanner.nextInt();
        int n = 0;

        while (x >= b) {
            x = x / b;
            n = n+1;
        }
        System.out.println("N = " + n);
    }
}


