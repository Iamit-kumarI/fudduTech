package Trees.AVL;

public class AVL {
    public class Node{
        int value;
        Node left;
        Node right;
        int heigth;
        public Node(int val){
            this.value=val;
        }
        public int getValue(){
            return this.value;
        }
    }
}
