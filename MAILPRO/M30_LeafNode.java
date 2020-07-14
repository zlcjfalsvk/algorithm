package MAILPRO;

/**
이진트리안에 모든 단말노드(leaf node)의 갯수를 구하시오.
트리의 루트노드가 주어집니다.

Given a root node of a binary tree, count all leaf nodes.
 */
public class M30_LeafNode {

    public static void main(String[] args) {

        // leaf nodes =  [child2, child5, child6, child7, ]
        BinaryTree child5 = new BinaryTree(6);
        BinaryTree child3 = new BinaryTree(4);
        child3.setlNode(child5);
        BinaryTree child6 = new BinaryTree(7);
        BinaryTree child7 = new BinaryTree(8);
        BinaryTree child4 = new BinaryTree(5);
        child4.setlNode(child6);
        child4.setrNode(child7);
        BinaryTree child2 = new BinaryTree(3);
        BinaryTree child1 = new BinaryTree(2, child3, child4);
        BinaryTree root = new BinaryTree(1, child1, child2);

        System.out.println(solution(root));

    }

    public static int solution(BinaryTree node) {
         
        if (node == null) return 0;

        if(isLead(node)) return 1;
        else return solution(node.getlNode()) + solution(node.getrNode());

    }

    public static boolean isLead(BinaryTree node) {
        return (node.getlNode() == null && node.getrNode() == null) ? true : false ;
    }


    private static class BinaryTree {

        private int item;
        private BinaryTree lNode;
        private BinaryTree rNode;

        public BinaryTree(int item) {
            this.item = item;
            this.lNode = null;
            this.rNode = null;
        } 

        public BinaryTree(int item, BinaryTree lNode, BinaryTree rNode) {
            this.item = item;
            this.lNode = lNode;
            this.rNode = rNode;
        }

        public void setlNode(BinaryTree lNode) {
            this.lNode = lNode;
        }

        public BinaryTree getlNode() {
            return this.lNode;
        }

        public void setrNode (BinaryTree rNode) {
            this.rNode = rNode;
        }

        public BinaryTree getrNode() {
            return this.rNode;
        }
    }
}