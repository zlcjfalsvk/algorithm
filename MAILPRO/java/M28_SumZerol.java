package MAILPRO;

/**
    단방향 연결 리스트(singly linked list)가 주어지면 총 합이 0으로 되는 연결된 노드들을 뺀 뒤 남은 노드의 값을 프린트 하시오.
    Given a linked list, remove consecutive nodes that sum to zero. Print the values of leftover nodes.

    input: 3 -> (-5) -> 5 -> 1 -> 2 -> 3
    output: 3 -> 1 -> 2 -> 3

    input: 1 -> 2 -> 3 -> 4 -> (-10) -> 5
    output: 5

    input: 10 -> (-3) -> (-4) -> (-3) -> 1
    output: 1
 */
public class M28_SumZerol {
    public static void main(String[] args) {
        // Node item = new Node(3);
        // Node item1 = new Node(-5);
        // Node item2 = new Node(5);
        // Node item3 = new Node(1);
        // Node item4 = new Node(2);
        // Node item5 = new Node(3);

        // item.setNext(item1);
        // item1.setNext(item2);
        // item2.setNext(item3);
        // item3.setNext(item4);
        // item4.setNext(item5);

        Node item = new Node(1);
        Node item1 = new Node(2);
        Node item2 = new Node(3);
        Node item3 = new Node(4);
        Node item4 = new Node(-10);
        Node item5 = new Node(5);

        item.setNext(item1);
        item1.setNext(item2);
        item2.setNext(item3);
        item3.setNext(item4);
        item4.setNext(item5);
        
        solution(item);
    }

    public static void solution(Node head) {
              
        Node node1 = head;
        Node node2 = head;

        while(true) {
            int sum = 0;  
            boolean skip = false;  
            node2 = node1;
            while(true) {
                sum += node2.item;
                if(sum == 0) {
                    node1 = node2;
                    skip = true;
                    break;
                }
                if(node2.next == null) break;
                else node2 = node2.next;
            }
            if(!skip) {
                System.out.println(node1.item);
            }
            if(node1.next == null) break;
            else node1 = node1.next;
        }
    }

    private static class Node {
        private int item;
        private Node next;

        public Node(int item) {
            this.item = item;
            this.next = null;
        }

        public void setNext(final Node next) {
            this.next = next;
        }

        public String toString() {
            return this.item + "" + (this.next == null ? "" : "->" + this.next.toString());
        }
    }
}