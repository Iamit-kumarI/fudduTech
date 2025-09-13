package Trees.Implementation;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int val){
            this.value=val;
        }
    }
    private Node root;
    // insert elements
    /* its concepts only
    public void insert(int value){
        insert(left);
        insert(right);
    }
    */
    public void papulate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int val=scanner.nextInt();
        root=new Node(val);
        //first time take root and for the others take left or right
        papulate(scanner,root);
    }
    private void papulate(Scanner scanner,Node node){
        System.out.println("Do you want to insert left of "+ node.value);
        boolean left=scanner.nextBoolean();//true means on left side false means i don't want insert left
        if(left){//so if left says thenn
            System.out.println("Enter the Left value of: "+ node.value);
            int val=scanner.nextInt();
            node.left=new Node(val);//new node created and chain maked
            papulate(scanner,node.left);
        }
        //if says no i don't want insert left then ask do you want insert right of it
        System.out.println("Do you want to insert right of "+ node.value);
        boolean right=scanner.nextBoolean();//true means on right side false means i don't want insert right
        if(right){//so if left says then
            System.out.println("Enter the right value of: "+ node.value);
            int val=scanner.nextInt();
            node.right=new Node(val);//new node created and chain maked
            papulate(scanner,node.right);
        }
    }
}
