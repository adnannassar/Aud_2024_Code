package Algorithmen.Aufgaben;

import java.util.Date;
import java.util.Scanner;

public class Ficonacii {
    public static void main(String[] args) {
        // lösungShahd();
        // lösungZana();
        // thirdPower();
        System.out.println("2^3 = "+ raiseAnyNumber(2, 3));
        System.out.println("2^4 = "+ raiseAnyNumber(2, 4));
        System.out.println("2^5 = "+ raiseAnyNumber(2, 5));
    }

    public static int raiseAnyNumber(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = base * result;
        }
        return result;
    }

    public static void thirdPower() {
        System.out.print("x: ");
        int x = new Scanner(System.in).nextInt();
        int erg = x * x * x;
        System.out.println("Third Power of " + x + ": " + erg);
    }

    public static int[] lösungZana() {
        System.out.print("x: ");
        int size = new Scanner(System.in).nextInt();
        int b[] = new int[size];

        int x = 0;
        for (int i : b) {
            x = b[i] + b[i - 1];
            b[i] = x;
        }
        return b;
    }

    public static void lösungShahd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        // 1,1,2,3,5,8,13,21…
        int nr1 = 1, nr2 = 1;
        int nr3;

        System.out.print(nr1 + " ");
        System.out.print(nr2 + " ");

        for (int x = 0; x <= n; x++) {
            nr3 = nr1 + nr2;
            System.out.print(nr3 + " ");
            nr1 = nr2;
            nr2 = nr3;
        }
    }
}

