package Komplexität;

import Algorithmen.Beispiele.Fakultät;

public class Praktikum_004 {

    public static void main(String[] args) {
        for(int i = 1 ; i<= 2000; i++ ){
            System.out.println("Beste Algorithm is: A" + (geweinnerFuerN(i) + 1) + " for n = " + i);
        }
    }



    public static int A1(int n) {
        return 1000 * n;
    }
    public static int A2(int n) {
        return 100 * n * (int) Math.log(n+1);
    }
    public static int A3(int n) {
        return 10 * (n * n);
    }
    public static int A4(int n) {
        return  n * n * n;
    }
    public static int A5(int n) {
        return (int) Math.pow(2, n);
    }
    public static int A6(int n) {
        return Fakultät.fakultät(n);
    }



   public static int geweinnerFuerN(int n){
       int [] timeOfAlgorithmen = new int[6];
       timeOfAlgorithmen[0] = A1(n);
       timeOfAlgorithmen[1] = A2(n);
       timeOfAlgorithmen[2] = A3(n);
       timeOfAlgorithmen[3] = A4(n);
       timeOfAlgorithmen[4] = A5(n);
       timeOfAlgorithmen[5] = A6(n);
       return minIndex(timeOfAlgorithmen);
   }

   public static int minIndex(int [] array){
       int min = array[0];
       int index = 0;
       for (int i = 0; i < array.length; i++) {
           if (array[i] < min) {
               min = array[i];
               index = i;
           }
       }
       return index;
   }

}
