package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();


        for (int i = 0; i < 100000; i++) {
            linkedList.add("Test Of " + Math.random());
            arrayList.add("Test Of " + Math.random());
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            String o = linkedList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Duration of linkedList: " + (end - start) + " ms");


        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            String o = arrayList.get(i);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("Duration of arrayList: " + (end2 - start2) + " ms");
    }
}
