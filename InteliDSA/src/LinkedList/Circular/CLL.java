package LinkedList.Circular;

public class CLL {
    private Node head;
    private Node tail;
    int size;
    public CLL(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            size+=1;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size+=1;
    }
    public void display(){
        Node tempNode=head;
        //we also need to check if head is null means is list is empty
        if(head!=null){
            do{
                /*since we are working with cricular linked list means there is nobody whos is
                 * pointing to null so in order to get teh values printed we need null earlier in
                 * singly or doubly list but this time we don't have null so what we can do is run
                 * this loop till you find that tempNode is == to tail means if you find that
                 * where you are trying to is already printed so just stop here*/
                System.out.print(tempNode.val+" -> ");
                tempNode=tempNode.next;
            }while(tempNode!=head);
        }
        System.out.println("Reached Head");
    }
    public int delete(int val){
        Node tempNode=head;
        if(tempNode==null){
            return -1;
        }
        if(tempNode.val==val){
            head=head.next;
            tail.next=head;
            return val;
        }
        do{
            Node toDelNode=tempNode.next;
            if(toDelNode.val==val){
                tempNode.next=toDelNode.next;
                return val;
            }
            tempNode=tempNode.next;
        }while(tempNode!=head);
        return -1;
    }
    public class Node{
        private Node next;
        private int val;
        public Node(int val){
            this.val=val;
        }
    }
}
