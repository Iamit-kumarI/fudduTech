package Trees.BST;

public class BinarySearchTree {
    private class Node{
        int value;
        int height;
        Node left;
        Node right;
        public Node(int val){
            this.value=val;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public BinarySearchTree(){

    }
}
