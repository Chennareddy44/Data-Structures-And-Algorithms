package Stacks;

import java.util.ArrayList;

public class ArrayListStack {
    // Declare an ArrayList to hold the stack elements
    private ArrayList<Integer> stack;

    // Constructor to create an empty stack
    public ArrayListStack() {
        this.stack = new ArrayList<>();
    }

    // Function to add an item to the top of the stack
    public void push(int data) {
        stack.add(data);
    }

    // Function to remove and return the item at the top of the stack
    public int pop() {
        // Check if the stack is empty
        if (isEmpty()) {
            // If the stack is empty, throw a runtime exception
            throw new RuntimeException("Stack is empty");
        }

        // Remove and return the last item in the ArrayList
        return stack.remove(stack.size() - 1);
    }

    // Function to return the item at the top of the stack without removing it
    public int peek() {
        // Check if the stack is empty
        if (isEmpty()) {
            // If the stack is empty, throw a runtime exception
            throw new RuntimeException("Stack is empty");
        }

        // Return the last item in the ArrayList
        return stack.get(stack.size() - 1);
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Function to return the size of the stack
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        // Create a new stack
        ArrayListStack stack = new ArrayListStack();

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

