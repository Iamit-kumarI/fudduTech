package LinkedList.Doubly;
                        /*explanation not that much efficent because pre will be
                                    * the part of node*/
public class DLLbyMe {
    private Node head;/*will be always in the start of the list*/
    /*will have the record of the previous node*/
    private Node tail;/*will be always in the end of the list*/
    private int size;/*size of the list*/

    public void insertFirst(int val){
        /*when the first time node is created we only given val here so by default on the
         * place of head there is null*/
        /*creating a new node "node" and assining the value val to the current var val
        * yet the node not pointing anywhere its null*/
        Node node=new Node(val);
        /*now told this newly created node that you have to point to the next index where
        * head currently is so its next will was null earlier is now poinitng to the node where
        * head currently is*/
        node.next=head;

        /*here we are createing double linked list meands we want to have a track of the
        * previous node as well so just told the its means this node's previous pre node will be
        * head */
        node.pre=null;
        if(head!=null){
            /*now here the actual magic happens the node where head currently is its pre
             * will be current node so just head.pre=node this makes a chain of pre as well*/
            head.pre=node;
        }
        /*here as said said head should always point to the satrt of the list so we just moved
         * head to the first node which is newly added*/
        head=node;
        if(tail==null){
            /*here when we are creating the list first time so we have to assign the tail
            * means only one node is added supposee [4] is added to [4,tail]
            * now when we add suppose [5] so it will be [5,head] -> [4,tail]
            * since we are adding at the start so we don't need to do anything with the tail
            * it is going to the end of the list by the addition of the new node*/
            tail=head;
        }
        size+=1;
    }
    public void display(){
        Node tempNode=head;
//        Node tempPreNode=pre;
        while(tempNode!=null){
            System.out.print(tempNode.val+" -> ");
            tempNode=tempNode.next;
        }
        System.out.println("Used Head");
//        while (tempPreNode!=null){
//            System.out.print(tempPreNode.val+" -> ");
//            tempPreNode=tempPreNode.next;
//        }
//        System.out.println("List pre");
    }
    private class Node{
        private Node next;
        private Node pre;
        private int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next,Node pre,int val){
            this.next=next;
            this.val=val;
            this.pre=pre;
        }
    }
}
