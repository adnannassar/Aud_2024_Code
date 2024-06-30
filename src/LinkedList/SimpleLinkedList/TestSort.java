package LinkedList.SimpleLinkedList;

public class TestSort {
    public static void main(String[] args) {
        GenericSimpleLinkedList<Integer> list = new GenericSimpleLinkedList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(0);


        // list.sort();

        System.out.println(list);
    }
}
