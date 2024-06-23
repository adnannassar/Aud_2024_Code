package LinkedList.SimpleLinkedList;

public class Test {
    public static void main(String[] args) {
        GenericSimpleLinkedList<Integer> list = new GenericSimpleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println("value at Index " + (i++) + ": " +  iterator.next());
        }
    }
}
