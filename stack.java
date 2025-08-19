public class Stack {
    int maxSize;
    int[] stack;
    int top;
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1; // stack is empty
    }
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println(value + " added.");
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(5);
        s.push(10);
        s.push(15);
        s.display();
        System.out.println("Top is: " + s.peek());
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
