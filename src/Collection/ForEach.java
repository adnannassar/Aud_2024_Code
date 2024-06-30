package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForEach {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (String x : list) {
            if(x == "a"){
                System.out.println("First : " + x);
            }else{
                System.out.println(x);
            }
        }
    }
}
