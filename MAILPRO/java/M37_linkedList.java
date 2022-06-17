package MAILPRO;


/**
L0→L1→…→Ln-1→Ln 의 단일 연결 리스트가 주어지면 순서를 다음과 같이 바꾸시오: L0→Ln→L1→Ln-1→L2→Ln-2→…
Given a singly linked list L: L0→L1→…→Ln-1→Ln, reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

input: 1 -> 2 -> 3 -> 4
output: 1 -> 4 -> 2 -> 3
 */
public class M37_linkedList {

    public static void main(String[] args) {
        Node node10 = new Node(10);        
        Node node9 = new Node(9, node10);
        Node node8 = new Node(8, node9);
        Node node7 = new Node(7, node8);
        Node node6 = new Node(6, node7);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);        
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3); 
        Node node1 = new Node(1, node2);     

        solution(node1);

    }

    public static void solution(Node node) {
        //  반으로 나눠 이후는 역정렬
        Node middleNode = node;
        Node search_middle = node;
        Node back;

        // 중간 노드 찾기
        while(search_middle.getNext() != null && search_middle.getNext().getNext() != null) {
            middleNode = middleNode.getNext();
            search_middle = search_middle.getNext().getNext();
        }

        back = middleNode.getNext(); // 6 7 8 9 10 
        middleNode.setNext(null);

        //  중간 이후 역정렬
        Node temp_head = new Node();
        temp_head.setNext(back);
        Node p = back.getNext();
        back.setNext(null);

        while(p != null) {
            Node tmp = p ; 
            p = p.getNext();
            tmp.setNext(temp_head.getNext());
            temp_head.setNext(tmp);
        }   
        back = temp_head.getNext();

        Node p1 = node;
        Node p2 = back;

        while(p2 != null) {
            Node t1 = p1.getNext();
            p1.setNext(p2);
            Node t2 = p2.getNext();
            p2.setNext(t1);
            p1 = t1;
            p2 = t2;
        }
        return;
    }
     
}