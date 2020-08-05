package MAILPRO;

import jdk.javadoc.internal.tool.Main.Result;

/**
연결 리스트로 표현된 두 정수 A 와 B 가 있습니다. A 와 B 를 더한 결과를 연결 리스트로 리턴하시오.
Given two integers represented as linked lists, return a linked list that is a sum of the two given linked lists.

Input: 1->2->3, 1->2->3 // 321 + 321
Output: 2->4->6 // 642

Input: 1->5->6, 0->0->4 // 651 + 400
Output: 1->5->0->1 // 1051
 */
public class M_36_Sum {

    public static void main(String[] args) {

        Node node1_4 = new Node(4);
        Node node1_3 = new Node(3, node1_4);
        Node node1_2 = new Node(2, node1_3);
        Node node1_1 = new Node(1, node1_2);

        Node node2_3 = new Node(3);
        Node node2_2 = new Node(2, node2_3);
        Node node2_1 = new Node(1, node2_2);

        Node sum = new Node(0);
        solution(node1_1, node2_1, 0, sum);
        System.out.println(sum.toString());
        
    }

    public static void solution(Node a, Node b, int carry, Node result) {

        if ( a == null && b == null ) {
            result.item = -1;
            return;
        }
        int sum = carry;
        Node next = new Node(0);
        result.next = next;
        if (a == null) {
            result.item = b.item;
            solution(null, b.next, sum / 10, next);            
        } else if(b == null) {
            result.item = a.item;
            solution(a.next, null, sum / 10, next);            
        } else {
            sum = a.item + b.item;
            result.item = sum % 10;
            solution(a.next, b.next, sum / 10, next);            
        }
    }

    private static class Node {
        private int item;
        private Node next;

        public Node(int item) {
            this.item = item;
            this.next = null;
        }
        
        public Node(int item, Node node) {
            this.item = item;
            this.next = node;
        }

        public String toString() {
            return this.item + "" + (this.next == null || this.next.item == -1 ? "" : "->" + this.next.toString());
        }        
    }    
}
