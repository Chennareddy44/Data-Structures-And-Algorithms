package Stacks;
import java.util.LinkedList;

public class DequeStack {
    // Declare a LinkedList to hold the deque elements
    private LinkedList<Integer> deque;

    // Constructor to create an empty deque
    public DequeStack() {
        this.deque = new LinkedList<>();
    }

    // Function to add an item to the top of the deque
    public void push(int data) {
        deque.addLast(data);
    }

    // Function to remove and return the item at the top of the deque
    public int pop() {
        // Check if the deque is empty
        if (isEmpty()) {
            // If the deque is empty, throw a runtime exception
            throw new RuntimeException("Deque is empty");
        }

        // Remove and return the last item in the LinkedList
        return deque.removeLast();
    }

    // Function to return the item at the top of the deque without removing it
    public int peek() {
        // Check if the deque is empty
        if (isEmpty()) {
            // If the deque is empty, throw a runtime exception
            throw new RuntimeException("Deque is empty");
        }

        // Return the last item in the LinkedList
        return deque.getLast();
    }

    // Function to add an item to the bottom of the deque
    public void enqueue(int data) {
        deque.addFirst(data);
    }

    // Function to remove and return the item at the bottom of the deque
    public int dequeue() {
        // Check if the deque is empty
        if (isEmpty()) {
            // If the deque is empty, throw a runtime exception
            throw new RuntimeException("Deque is empty");
        }

        // Remove and return the first item in the LinkedList
        return deque.removeFirst();
    }

    // Function to check if the deque is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Function to return the size of the deque
    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        // Create a new deque stack
        DequeStack stack = new DequeStack();

        // Push some elements onto the top of the deque
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element from the top of the deque
        System.out.println("Popped element: " + stack.pop());

        // Push some more elements onto the top of the deque
        stack.push(4);
        stack.push(5);

        // Enqueue some elements onto the bottom of the deque
        stack.enqueue(0);
        stack.enqueue(-1);

        // Dequeue an element from the bottom of the deque
        System.out.println("Dequeued element: " + stack.dequeue());

        // Check if the deque is empty
        System.out.println("Is deque empty? " + stack.isEmpty());

        // Check the size of the deque
        System.out.println("Deque size: " + stack.size());

        // Pop all the elements from the top of the deque
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}
