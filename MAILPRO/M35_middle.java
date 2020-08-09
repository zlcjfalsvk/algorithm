package MAILPRO;

/**
단일 연결 리스트(singly linked list)가 주어지면 리스트의 중간 노드 값을 프린트 하시오. (제일 효율적인 방법으로)
Given a singly linked list, print the value of the node that is in the middle of the list.
 */
public class M35_middle {

    public static void main(String[] args) {

        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        solution(node1);
    }

    public static void solution(Node node) {

        Node one = node;
        Node two = node;

        while(one.next.next != null && two.next != null) {
            one = one.next;
            two = two.next.next;
        }
        System.out.println(one.getItem());
    }
    
    private static class Node{
        private int item;
        private Node next;

        Node(int i, Node next) {
            this.item = i;
            this.next = next;
        }

        public int getItem() {
            return this.item;
        }
    }
}