package MAILPRO.DoubleLinkedList;

public class DoubleLinkedList {

    private Node head;

    public DoubleLinkedList() {}

    public void add(int value) {
        Node node = new Node(value);
        if(this.head == null) {
            this.head = node;
        } else {
            node.setNext(this.head);
            node.getnext().setPre(node);
            this.head = node;
        }
    }

    public Node search(int value) {
        Node node = this.head;
        if (node != null) {
            while (node.getnext() != null) {
                if (node.getItem() == value) {
                    return node;
                } else {
                    node = node.getnext();
                }
            }
            if (node.getItem() == value) return node;
        }
        return null;
    }

    public void remove(Node data) {
        Node tmp = data.getPre();
        data.getPre().setNext(data.getnext());
        data.setPre(tmp);
    }

}