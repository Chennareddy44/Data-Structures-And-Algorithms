package Stacks;

public class ArrayStack {
    // Declare an integer array to hold the stack elements
    private int[] arr;

    // Declare an integer to keep track of the top element
    private int top;

    // Constructor to create an empty stack with a given capacity
    public ArrayStack(int capacity) {
        // Initialize the stack with the given capacity
        arr = new int[capacity];
        // Set the top to -1 since the stack is initially empty
        top = -1;
    }

    // Function to add an item to the top of the stack
    public void push(int item) {
        // Check if the stack is full
        if (top == arr.length - 1) {
            // If the stack is full, throw a runtime exception
            throw new RuntimeException("Stack is full");
        }
        // If the stack is not full, increment the top
        top++;
        // Add the new item to the top of the stack
        arr[top] = item;
    }

    // Function to remove and return the item at the top of the stack
    public int pop() {
        // Check if the stack is empty
        if (isEmpty()) {
            // If the stack is empty, throw a runtime exception
            throw new RuntimeException("Stack is empty");
        }
        // If the stack is not empty, remove the top item
        int item = arr[top];
        top--;
        // Return the removed item
        return item;
    }

    // Function to return the item at the top of the stack without removing it
    public int peek() {
        // Check if the stack is empty
        if (isEmpty()) {
            // If the stack is empty, throw a runtime exception
            throw new RuntimeException("Stack is empty");
        }
        // If the stack is not empty, return the top item
        return arr[top];
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Function to return the size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        // Create a new stack with capacity of 5
        ArrayStack stack = new ArrayStack(5);

        // Push some elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element from the stack
        System.out.println("Popped element: " + stack.pop());

        // Push some more elements onto the stack
        stack.push(4);
        stack.push(5);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Check the size of the stack
        System.out.println("Stack size: " + stack.size());

        // Pop all the elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
