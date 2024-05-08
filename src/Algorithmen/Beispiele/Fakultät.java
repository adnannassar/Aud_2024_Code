package Algorithmen.Beispiele;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Fakultät {
    // 4! = 1 * 2* 3*  4 = 24;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("X: ");
        int x = scanner.nextInt();
        System.out.println("fakultät von " + x + ": " + fakultät(x));
    }

 public static int fakultät (int x ) {
        assert (x != 0);
     int fak = 1;
     for(int i = 1; i <=x ; i++ ){
         fak = fak * i;
     }
     return fak;
 }
}
