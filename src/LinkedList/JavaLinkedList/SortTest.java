package LinkedList.JavaLinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class SortTest {
    public static void main(String[] args) {
        LinkedList<Car> linkedList = new LinkedList<>();

        linkedList.add(new Car("BMW", 210));
        linkedList.add(new Car("Audi", 190));
        linkedList.add(new Car("Mercedes", 290));
        linkedList.add(new Car("Tesla", 220));



        System.out.println("Before Sort: " + linkedList);
        Collections.sort(linkedList);

        System.out.println("After  Sort: " + linkedList);
    }
}
