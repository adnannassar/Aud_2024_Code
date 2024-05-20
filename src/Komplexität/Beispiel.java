package Komplexität;

public class Beispiel {
    public static void main(String[] args) {
        System.out.println(10); // O(1)

        // O(n)
        int n = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}
