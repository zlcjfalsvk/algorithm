package MAILPRO;

/**
두개의 정렬된(sorted) 정수 링크드리스트(linked list)가 주어지면, 두 리스트를 합친 정렬된 링크드리스트를 만드시오.
Given two sorted integer linked lists, merge the two linked lists. Merged linked list must also be sorted.

예제)
Input: 1->2->3, 1->2->3
Output: 1->1->2->2->3->3

Input: 1->3->5->6, 2->4
Output: 1->2->3->4->5->6
 */
public class M14_LinkedList {

    public static void main(String[] args) {
        Node item1 = new Node(1);
        Node item1_1 = new Node(2);
        Node item2_1 = new Node(3);
        item1.setNext(item1_1);
        item1_1.setNext(item2_1);

        Node item2 = new Node(1);
        Node item1_2 = new Node(2);
        Node item2_2 = new Node(3);
        item2.setNext(item1_2);
        item1_2.setNext(item2_2);

        System.out.println(solution(item1, item2));

    }

    public static String solution(Node node1, Node node2) {
        Node ret = new Node();
        Node add = ret;
        while(node1 != null && node2 != null) {
            if(node1.item > node2.item) {
                add.setNext(node2);
                node2 = node2.next;
            } else {
                add.setNext(node1);
                node1 = node1.next;
            }
            add = add.next;
        }
        
        if (node1 == null) {
            add.next = node2;
        }
        else {
            add.next = node1;
        }

        return ret.next.toString();
    }




    private static class Node {
        private int item;
        private Node next;

        public Node(){};
        public Node(int item) {
            this.item = item;
            this.next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String toString() {
            return this.item + "" + (this.next == null ? "" : "->" + this.next.toString());
        }
    }
    
}