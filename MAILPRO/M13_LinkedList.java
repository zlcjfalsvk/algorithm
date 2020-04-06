package MAILPRO;

/**
링크드 리스트(linked list)의 머리 노드(head node)와 정수 N이 주어지면, 끝에서 N번째 노드(node)를 제거하고 머리 노드(head node)를 리턴하시오.
단, 리스트를 한번만 돌면서 풀어야합니다. N은 리스트 길이보다 크지 않습니다.
Given a head node of a singly linked list, remove the Nth last element and return the head node.

예제)
Input: 1->2->3->4->5, N=2
Output: 1->2->3->5

Input: 1->2->3, N=3
Output: 2->3

Input: 1, N=1
﻿Output: null
 */
public class M13_LinkedList {

    public static void main(final String[] args) {
        Node item = new Node(1);
        Node item1 = new Node(2);
        Node item2 = new Node(3);
        Node item3 = new Node(4);
        Node item4 = new Node(5);
        item.setNext(item1);
        item1.setNext(item2);
        item2.setNext(item3);
        item3.setNext(item4);

        System.out.println(solution(item, 2));
    }    

    public static String solution(Node head, int n) {
        if(head == null) return null;

        Node first = head;
        Node second = head;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        if (first == null) {
            head = head.next;
            if(head == null) return null;
            return head.toString();
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return head.toString();
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

