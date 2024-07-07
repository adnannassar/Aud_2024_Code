package Stack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(5);

        for (int i = 1; i <= 5; i++) {
            stack.push("Test " + i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}
