package MAILPRO.DoubleLinkedList;

public class Node {
    private Node pre;
    private int item;        
    private Node next;

    Node(int item) {
        this.item = item;
        this.pre = null;
        this.next = null;
    }

    Node(Node pre, int item, Node next) {
        this.pre = pre;
        this.item = item;
        this.next = next;
    }

    public Node getPre() {
        return this.pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public int getItem() {
        return this.item;
    }

    public Node getnext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}