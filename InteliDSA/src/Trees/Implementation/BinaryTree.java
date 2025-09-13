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
    public void papulate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int val=scanner.nextInt();
        root=new Node(val);
        //first time take root and for the others take left or right
        papulate(scanner,root);
    }
    /*Implementing binaryTree papulate method to insert the node.values here  is
    how it works: first it ask to insert the root node simple and for the first time
    it created the root node and while creating it addeds the values ..................
    .. and it papulate another papulate private function which is actually inserting
    values left or right this is like helper function of recursion you got the point ......
    ....... now here is ask first do you wan tinsert left if you yes yes then  i will ask
    you to enter the values and later it will create a nedd node pay attention
    NODE.LEFT=NEW NODE(VAL) by this is created a new node and also make the chain
    from the node here passed like i nthis case it wass root node so values is assigned to
    node and chain is created again this will call this papulate function recursively and keep
    in mind this time passed node is left node suppose last time you have insert 15 as root
    and you have inserted 6 as left............. again the call happen with 6 wali node and
    same ask you left or right if you again said this time yes left so again will do same and
    add the valeus to root 15 left 6 left 8 okey now again recursive call ................. but
     with 8 node will ask do you want insert left you said now so this will go next and ask .
     ............. with 8 node do you want insert right you said no so i goes back...... 8 is
     out now will call for 6 and 6 left is called ......... right is remaning so call do you want
      insert right you said yes 9 so insert by creating new node as node.right=new Node(val)
      chain maked with 6 node and will again for 9 ........do you want left you said false ....
      .....call again right you said false out of 9 and .... out of 6 as well because both call
      end now ask did you want right of 15 which is root node you said false recursive call over
       and ended the insertion function*/
    private void papulate(Scanner scanner,Node node){//left right  chaining elplanation
        System.out.println("Do you want to insert left of "+ node.value);
        boolean left=scanner.nextBoolean();//true means on left side false means i don't want insert left
        if(left){//so if left says thenn //nn for explanation of papulate method
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
