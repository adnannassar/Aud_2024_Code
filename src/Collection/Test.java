package Collection;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(0);
        collection1.add(1);
        collection1.add(2);


        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(10);
        collection2.add(20);
        collection2.add(31);

        collection1.addAll(collection2);

                Iterator<Integer> it = collection1.iterator();
        while (it.hasNext()) {
            if(it.next() % 2 == 0){
                it.remove();
            }
        }
        System.out.println(collection1);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Test1");
        linkedList.add("Test2");
        linkedList.add("Test3");
        linkedList.add("Test4");
        linkedList.add("ABC");

        List<String> subList = linkedList.subList(1, 4);
        subList.set(0, "ABC");
        System.out.println(linkedList);
        System.out.println(subList);
        linkedList.remove(linkedList.lastIndexOf("ABC"));
        System.out.println(linkedList);

    }

}
