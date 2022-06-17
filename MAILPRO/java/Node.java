package MAILPRO;

public class Node {

    private int item;
    private Node next;

    public Node(){}

    public Node(int item) {
        this.item = item;
        this.next = null;
    }

    public Node(int item, Node node) {
        this.item = item;
        this.next = node;
    }

    public void setNext(final Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next == null ? null : this.next;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getItem() {
        return this.item;
    }

    public String toString() {
        return this.item + "" + (this.next == null ? "" : "->" + this.next.toString());
    }
}  