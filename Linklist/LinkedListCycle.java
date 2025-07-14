package Linklist;

public class LinkedListCycle {
    public static boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1 step
            fast = fast.next.next; // Move fast by 2 steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // Example usage of LinkedListCycle
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Creating a cycle

        System.out.println(hasCycle(head)); // Should print true
    }
}
