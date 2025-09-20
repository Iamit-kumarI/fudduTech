package Trees.AVL;
/*
 * AVL is an enample of self balanced binary
 * tree example
 * this always make sure O(N) -> O(longN)
 *
 * like when tree gets unbalanced it balanced
 * it self by AVL algorithm
 * */
import java.lang.Math;
public class AVL {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int val){
            this.value=val;
        }
        public int getValue(){
            return this.value;
        }
    }
    public Node root;
    public AVL(){

    }
    public int height(Node node){
        if(node==null)return -1;
        return node.height;
    }
    public int height(){
        return height(root);
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){
        display(root,"Root Node: ");
    }
    private void display(Node node,String info){
        if(node==null)return;
        System.out.println(info+node.getValue());
        display(node.left,"Left Node "+node.getValue()+" : ");
        display(node.right,"Right Node "+node.getValue()+" : ");
    }
    public void insert(int value){
        root=insert(value,root);
    }
    private Node insert(int val,Node node){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(val<node.getValue())node.left=insert(val,node.left);
        if(val>node.getValue())node.right=insert(val,node.right);
        node.height=Math.max(height(node.left),height(node.right))+1;
        /**
         * one change from bst is here each time we checkif heightdiff>=2 then we will
         * rotate it either way both done by rotate;
         */
        return rotate(node);
    }
    private Node rotate(Node node){
        if(height(node.left)-height(node.right) >1){//on left side
            /*
             * this is the case means we are on the left side because left height
             * greater than node.right
             *
             * */
            if(height(node.left.left)-height(node.left.right)>0){
                //Left-Left case where g is c left means g was smaller than c
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                //Left-Right case where g is right to c means g is bigger than c
                node.left=leftRotate(node.left);//make in line
                return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right) <-1){//on right side
            /*
             * this is the case means we are on the left side because left height
             * greater than node.right
             *
             * */
            if(height(node.right.left)-height(node.right.right)<0){
                //Right-Right case where g is c left means g was smaller than c
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
                //Right-Left case where g is right to c means g is bigger than c
                node.right=rightRotate(node.right);//make in line
                return leftRotate(node);
            }
        }
        return node;
    }
    public Node rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;//p.left.right;
        c.right=p;
        p.left=t;
        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;// the new node
    }
    public Node leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;
        p.left=c;
        c.right=t;

        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return p;
    }
    /* papulate is created to avoid skwed tree like heppens in case
     of insert if the give array is sorted*/
    public void papulate(int []nums){
        papulate(nums,0,nums.length-1);
    }
    private void papulate(int []nums,int s,int e){
        if(s>e){
            return;
        }
        int mid=s+(e-s)/2;
        this.insert(nums[mid]);
        papulate(nums,s,mid-1);
        papulate(nums,mid+1,e);;
    }
    public boolean balance(){
        return balance(root);
    }
    private boolean balance(Node node){
        if(node==null)return true;
        return Math.abs(height(node.left)-height(node.right))<=1&&balance(node.left)&&balance(node.right);
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null)return;
        System.out.println(node.getValue()+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null)return;
        inOrder(node.left);
        System.out.println(node.getValue()+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null)return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.getValue()+" ");
    }
}

