package MAILPRO;

/**
 * 
 * 이진 트리를 루트 노드를 기준으로 좌우반전 하시오.
    이 문제는 구글이 Homebrew 창시자에게 낸 문제로 유명합니다.
    Given a binary tree root node, reverse the tree horizontally.
 */
public class M16_TreeReverse {

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n3.setLNode(n6);
        n3.setRNode(n7);
        n2.setRNode(n4);
        n2.setLNode(n5);
        n1.setRNode(n2);
        n1.setLNode(n3);

        changeNode(n1);

    }  

    public static Node changeNode(Node node) {
        if(node == null) return null;
        Node r = changeNode(node.rNode);
        Node l = changeNode(node.lNode);
        node.rNode = l;
        node.lNode = r;
        return node;
    }
    

    private static class Node {
        private int item;
        private Node rNode;
        private Node lNode;

        public Node(int item) {
            this.item = item;
            this.rNode = null;
            this.lNode = null;
        }

        public void setRNode(Node node) {
            this.rNode = node;
        }

        public void setLNode(Node node) {
            this.lNode = node;
        }
    }
}