package LinkedList.SimpleLinkedList;

public class Main_Integer {
    public static void main(String[] args) {
        GenericSimpleLinkedList<Integer> simpleLinkedList = new GenericSimpleLinkedList<>();
        System.out.println("Before Add: ");
        System.out.println("isEmpty() --> " + simpleLinkedList.isEmpty());
        System.out.println("Get Value from index (0) --> " + simpleLinkedList.getValueByIndex(0)); // -1
        System.out.println("Get Index by value (0) --> " + simpleLinkedList.getValueByIndex(0)); // -1

        simpleLinkedList.add(1);
        simpleLinkedList.add(3);
        simpleLinkedList.add(5);
        simpleLinkedList.add(6);

        System.out.println("\nAfter Add: ");
        System.out.println("isEmpty() --> " + simpleLinkedList.isEmpty());
        System.out.println(simpleLinkedList);

        System.out.println("Search (1) --> " + simpleLinkedList.search(1)); // O(1)
        System.out.println("Search (3) --> " + simpleLinkedList.search(3)); // O(n)
        System.out.println("Search (7) --> " + simpleLinkedList.search(6)); // O(n)

        System.out.println("\nGet Value from index (0) --> " + simpleLinkedList.getValueByIndex(0)); // 1
        System.out.println("Get Value from index (3) --> " + simpleLinkedList.getValueByIndex(3)); // 4
        System.out.println("Get Value from index (5) --> " + simpleLinkedList.getValueByIndex(5)); // 6
        System.out.println("Get Value from index (200) --> " + simpleLinkedList.getValueByIndex(200)); // -1
        System.out.println("Get Value from index (-10) --> " + simpleLinkedList.getValueByIndex(-10)); // -1

        System.out.println("\nGet Index by value (1) --> " + simpleLinkedList.getIndexByValue(1)); // 0 --> O(1)
        System.out.println("Get Index by value (3) --> " + simpleLinkedList.getIndexByValue(3)); // 2
        System.out.println("Get Index by value (100) --> " + simpleLinkedList.getIndexByValue(100)); // -1

        simpleLinkedList.addValueAtIndex(9,-10);
        simpleLinkedList.addValueAtIndex(0,0);
        simpleLinkedList.addValueAtIndex(2,1);
        simpleLinkedList.addValueAtIndex(4,3);
        simpleLinkedList.addValueAtIndex(7,6);
        simpleLinkedList.addValueAtIndex(8,100);
        System.out.println("\nAfter Add Value at index: ");
        System.out.println(simpleLinkedList);


        System.out.println("\nAfter delete Value (3): ");
        simpleLinkedList.remove(3);
        System.out.println(simpleLinkedList);
        System.out.println("\nAfter delete Value (0): ");
        simpleLinkedList.remove(0);
        System.out.println(simpleLinkedList);
        System.out.println("\nAfter delete Value (8): ");
        simpleLinkedList.remove(8);
        System.out.println(simpleLinkedList);

    }
}
