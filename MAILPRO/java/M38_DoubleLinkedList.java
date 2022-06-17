package MAILPRO;

import MAILPRO.DoubleLinkedList.DoubleLinkedList;

/**

add(value): 주어진 value를 리스트 처음 노드로 등록.
search(value): Value 를 가진 노드를 리턴.
remove(node): 주어진 노드를 연결 리스트에서 제거.

 */
public class M38_DoubleLinkedList {

    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.add(3);
        dl.add(5);
        dl.add(10);

        System.out.println(dl.search(3));


    }
    
    
}