package Trees.BST;

public class BinarySearchTree {
    private class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
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
    public int height(Node node){
        if(node==null)  return -1;
        return node.height;
    }
    public boolean isEmpty(){
        /*
        if(root==null) return true;
        return false;
         */
        return root==null;
    }
    public void display(){
       display(root,"Root Node");
    }
    private void display(Node node,String info){
        if(node==null)return;
        System.out.println(info+node.getValue());//or node.value if ! private when created
        display(node.left,"Left child of "+node.getValue()+" : ");
        display(node.right,"Right child of "+node.getValue()+" : ");

    }
    /*
    * here comes insertion its difficult why because every time we insert node.val we have
    * to find its right position where to insert in the tree
    *
    * insertion in BST doesn't happen by the choice of the user it happends by the algorithm's
    * choice so the tree can be balances means we don't need to create left and right it will
    * automatically manages by the tree
    * */
    public void insert(int val){
        
    }


}
