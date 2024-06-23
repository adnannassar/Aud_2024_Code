package LinkedList.JavaLinkedList;

import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> listInteger = new LinkedList();
        listInteger.add(1);
        listInteger.add(2);

        LinkedList<String> listString = new LinkedList();
        listString.add("Test");

        LinkedList<Boolean> listBoolean= new LinkedList();
        listBoolean.add(true);

        LinkedList<Car> listCar = new LinkedList<>();
        listCar.add(new Car("Tesla", 220));

        if(listBoolean.get(0) == true){
            System.out.println("True");
        }
    }
}

