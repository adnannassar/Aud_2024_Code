package Stack;

public class Stack<T> {
    private int top;
    private final T[] stack;

    public Stack(int size) {
        stack =  (T[]) new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(T data) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        stack[++top] = data;
    }
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }
}
