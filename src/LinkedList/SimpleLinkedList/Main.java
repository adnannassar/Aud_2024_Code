package LinkedList.SimpleLinkedList;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        System.out.println("Before Add: ");
        System.out.println("isEmpty() --> " + simpleLinkedList.isEmpty());
        System.out.println("Get Value from index (0) --> " + simpleLinkedList.getValueByIndex(0)); // -1
        System.out.println("Get Index by value (0) --> " + simpleLinkedList.getValueByIndex(0)); // -1
        simpleLinkedList.add(1);
        simpleLinkedList.add(2);
        simpleLinkedList.add(3);
        simpleLinkedList.add(4);
        simpleLinkedList.add(5);
        simpleLinkedList.add(6);
        System.out.println("\nAfter Add: ");
        System.out.println("isEmpty() --> " + simpleLinkedList.isEmpty());
        simpleLinkedList.print();

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
    }
}
