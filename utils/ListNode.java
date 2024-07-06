package utils;

public class ListNode {
    private int val;
    private ListNode next;
    public ListNode() {
    }
    public ListNode(int val) {
        this.setVal(val);
    }
    public ListNode(int val, ListNode next) {
        this.setVal(val);
        this.setNext(next);
    }

    // Method to insert a new node at the end of the list
    public void insert(int val) {
        ListNode newNode = new ListNode(val);
        ListNode current = this;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    // Method to display the list
    public void display() {
        ListNode current = this;
        while (current != null) {
            System.out.print(current.getVal() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}