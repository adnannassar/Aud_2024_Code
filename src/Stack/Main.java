package Stack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(5);

        stack.push("Test1");
        stack.push("Test2");
        stack.push("Test3");
        stack.push("Test4");
        stack.push("Test5");


        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}
