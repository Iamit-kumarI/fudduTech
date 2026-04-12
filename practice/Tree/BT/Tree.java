package Tree.BT;

import java.util.Scanner;

public class Tree {
    class Node {
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public Node root;
    public void papulate(Scanner inpt){
        System.out.println("Enter the root node - ");
        root=new Node(inpt.nextInt());
        insert(root,inpt);
    }
    public void insert(Node node,Scanner inpt){
        boolean left=false;
        System.out.println("Do you want insert left of - "+node.val);
        if(inpt.nextBoolean()){
            System.out.println("Enter the value now - ");
            node.left=new Node(inpt.nextInt());
            insert(node.left,inpt);
        }
        System.out.println("Do you want insert right of -"+node.val);
        if(inpt.nextBoolean()){
            System.out.println("Enter the value now - ");
            node.right=new Node(inpt.nextInt());
            insert(node.right,inpt);
        }
    }
    public void display(){
        display(root);
    }
    private void display(Node node){
        // pre order
        if(node==null)return;
        display(node.left);
        System.out.println(" ----> "+node.val);
        display(node.right);
    }
    // need to balance the tree
}
