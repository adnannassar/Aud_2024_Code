package Algorithmen.Aufgaben;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(linearSearch(arr, 10));
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

