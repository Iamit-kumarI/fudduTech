package Trees.BST;
import java.lang.Math;

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
       display(this.root,"Root Node: ");
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
        root=insert(val,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        /*
        * since here we have added the element so height is going to +1 but to decide
        * what is going to the actual height we have to find max height then do
        * height +1
        * */
        return node;//whatever the currect node where we are at the call each time
    }
    /*this case if the array is sorted then it will get into skwed tree which will be O(N) not
    * go so either we can used balancing tree or we can take mid or array each time and pass
    * left of mid and right of mid so this way we can do insert sorted array in tree*/
    /*public void papulate(int [] nums){
        for(int num:nums){
            this.insert(num);
        }
    }*/
    public void papulateSorted(int[]nums){
        papulateSorted(nums,0,nums.length-1);
    }
    private void papulateSorted(int []nums,int s,int e){
        if(s>e) return;
        int mid=s+(e-s)/2;
        this.insert(nums[mid]);
        papulateSorted(nums,s,mid-1);
        papulateSorted(nums,mid+1,e);
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null)return true;
        /*
            int leftHeight=height(node.left);
            int rightHeight=height(node.right);  this
         */
        /*while checking if the tree is balanced return true
        so the condition is each level there should be height diff not more than 0,1 means
        the diff can be either 0 or 1 <=1 at each node

        this is the check for each level so one we have checkd for one node then do check its
        node.left
        node.right
        recursively
        while so keep going till we each that particular call node.left==null so return true only that
        call is ended later go right for that same node and keep going till we traverse each node's
        left
        right
        at the end return true or false by checking if level if <=1
         */
        return Math.abs(height(node.left)-height(node.right))<=1&&balanced(node.left)&&balanced(node.right);
    }
    public void preOrderTraversal(){
        preOrderTraversal(root);
    }
    private void preOrderTraversal(Node node){
        if(node==null)return;
        System.out.print(node.getValue()+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node node){
        if(node==null)return;
        //System.out.print(node.getValue()+" ");
        inOrderTraversal(node.left);
        System.out.print(node.getValue()+" ");
        inOrderTraversal(node.right);
    }
    public void postOrderTraversal(){
        postOrderTraversal(root);
    }
    private void postOrderTraversal(Node node){
        if(node==null)return;
        //System.out.print(node.getValue()+" ");
        postOrderTraversal(node.left);
//        System.out.print(node.getValue()+" ");
        postOrderTraversal(node.right);
        System.out.print(node.getValue()+" ");
    }

}

