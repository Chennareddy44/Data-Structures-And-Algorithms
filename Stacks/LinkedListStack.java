package Stacks;
public class LinkedListStack {
    // Node class to represent a node in the linked list
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Declare a top pointer to keep track of the top of the stack
    private Node top;

    // Constructor to create an empty stack
    public LinkedListStack() {
        this.top = null;
    }

    // Function to add an item to the top of the stack
    public void push(int data) {
        // Create a new node for the item
        Node node = new Node(data);

        // Set the next pointer of the new node to the current top
        node.next = top;

        // Update the top pointer to point to the new node
        top = node;
    }

    // Function to remove and return the item at the top of the stack
    public int pop() {
        // Check if the stack is empty
        if (isEmpty()) {
            // If the stack is empty, throw a runtime exception
            throw new RuntimeException("Stack is empty");
        }

        // Store the data of the top node in a temporary variable
        int data = top.data;

        // Update the top pointer to point to the next node
        top = top.next;

        // Return the data of the top node
        return data;
    }

    // Function to return the item at the top of the stack without removing it
    public int peek() {
        // Check if the stack is empty
        if (isEmpty()) {
            // If the stack is empty, throw a runtime exception
            throw new RuntimeException("Stack is empty");
        }

        // Return the data of the top node
        return top.data;
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Function to return the size of the stack
    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Create a new stack
        LinkedListStack stack = new LinkedListStack();

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
