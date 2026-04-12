package LinkedList.Doubly;

public class DLLbyKunal {

    Node head;
    Node tail;
    int size;
    public void insertFirst(int val){
        /*when the first time node is created we only given val here so by default on the
        * place of head there is null*/
        Node node=new Node(val);
        node.next=head;
        /*Explanation: the we have just created its pre will be null becz it is the first in the
        * list so node.pre means the node we just created it pre will be null*/
        node.pre=null;
        if(head!=null){
            /*now here the actual magic happens the node where head currently is its pre
            * will be current node so just head.pre=node this makes a chain of pre as well*/
            head.pre=node;
        }
        head=node;
        if(tail==null){
            //maintaing the tail as well not neccessary
            tail=node;
        }
        size+=1;
    }
    public void inserLast(int val){
        Node node=new Node(val);
        Node last=head;
        if(head==null){//check if list exist or not if not then create one new node which head is null
            node.pre=null;
            head=node;
        }
        //not using tail findling the last node so traverse till we find null
        while(last.next!=null){
            last=last.next;
        }
        node.next=null;
        last.next=node;
        node.pre=last;
//        last=node; we don't need to do this becz we are not updating the tail or last
//        tail=node;
        size+=1;
    }
    public void inserAtValue(int toInserAfter,int val) {
        Node node = new Node(val);
        Node nodeAfter = head;
        while (nodeAfter.val != toInserAfter) {
            nodeAfter = nodeAfter.next;
        }
        node.next = nodeAfter.next;
        nodeAfter.next = node;
        node.pre = nodeAfter;
//        if(nodeAfter.next!=null){
//        node.next.pre=node; //this might give exception is there is no last node
//      }
        nodeAfter.next=node;// my thinking this dosen't give exception
        size+=1;

    }
    public void display(){
        Node tempNode=head;
        while(tempNode!=null){
            System.out.print(tempNode.val+" -> ");
            tempNode=tempNode.next;
        }
        System.out.println(" AT End");
    }
    public void displayReverse(){
        Node last=tail;
        while(last!=null){
            System.out.print(last.val+" -> ");
            /*the last node which was at tail going towords the head in order ot travers
            * via pre node*/
            last=last.pre;
        }
        System.out.println(" AT Start");
    }
    public class Node{
        Node next;
        Node pre;
        int val;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node pre){
            this.val=val;
            this.next=head;
            this.pre=pre;
        }
    }
}
