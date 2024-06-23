package LinkedList.SimpleLinkedList;

public class Main_String {
    public static void main(String[] args) {
        GenericSimpleLinkedList<String> simpleLinkedList = new GenericSimpleLinkedList<>();
        System.out.println("Before Add: ");
        System.out.println("isEmpty() --> " + simpleLinkedList.isEmpty());
        System.out.println("Get Value from index (0) --> " + simpleLinkedList.getValueByIndex(0)); // -1
        System.out.println("Get Index by value (0) --> " + simpleLinkedList.getValueByIndex(0)); // -1

        simpleLinkedList.add("Zana");
        simpleLinkedList.add("Abdulkader");
        simpleLinkedList.add("Shahd");
        simpleLinkedList.add("Ahmad");

        System.out.println("\nAfter Add: ");
        System.out.println("isEmpty() --> " + simpleLinkedList.isEmpty());
        System.out.println(simpleLinkedList);

        System.out.println("Search (Zana) --> " + simpleLinkedList.search("Zana")); // O(1)
        System.out.println("Search (Shahd) --> " + simpleLinkedList.search("Shahd")); // O(n)
        System.out.println("Search (Test) --> " + simpleLinkedList.search("Test")); // O(n)

        System.out.println("\nGet Value from index (0) --> " + simpleLinkedList.getValueByIndex(0));
        System.out.println("Get Value from index (3) --> " + simpleLinkedList.getValueByIndex(3));
        System.out.println("Get Value from index (5) --> " + simpleLinkedList.getValueByIndex(5));
        System.out.println("Get Value from index (200) --> " + simpleLinkedList.getValueByIndex(200));
        System.out.println("Get Value from index (-10) --> " + simpleLinkedList.getValueByIndex(-10));

        System.out.println("\nGet Index by value (Zana) --> " + simpleLinkedList.getIndexByValue("Zana")); // 0 --> O(1)
        System.out.println("Get Index by value (Shahd) --> " + simpleLinkedList.getIndexByValue("Shahd")); // 2
        System.out.println("Get Index by value (Test) --> " + simpleLinkedList.getIndexByValue("Test")); // -1

        simpleLinkedList.addValueAtIndex("Ali",-10);
        simpleLinkedList.addValueAtIndex("Ruaa",0);
        simpleLinkedList.addValueAtIndex("Sara",1);
        simpleLinkedList.addValueAtIndex("A",3);
        simpleLinkedList.addValueAtIndex("B",6);
        simpleLinkedList.addValueAtIndex("C",100);
        System.out.println("\nAfter Add Value at index: ");
        System.out.println(simpleLinkedList);


        System.out.println("\nAfter delete Value (3): ");
        simpleLinkedList.remove("Zana");
        System.out.println(simpleLinkedList);
        System.out.println("\nAfter delete Value (0): ");
        simpleLinkedList.remove("Ali");
        System.out.println(simpleLinkedList);
        System.out.println("\nAfter delete Value (8): ");
        simpleLinkedList.remove("B");
        System.out.println(simpleLinkedList);

    }
}
