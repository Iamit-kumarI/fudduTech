package SortingLL;
//created for debuging
//debuged LTC 2 "Add Two Numbers"
public class AddTwoNosList {
    private Node head;//don't work with tail it makes us poor
    int size=0;
    //desing method to inset the values in the list so the we can debug LTC 2
    public void insertValue(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            return;
        }
        Node thead=head;
        while(thead.next!=null){
            //if head exist so we have to go to end only then we can insert so gone to end
            thead=thead.next;
        }
        thead.next=node;
        size+=1;
    }
    public void display(){
        Node tnode=head;
        if(tnode==null){
            return;
        }
        while(tnode!=null){
            System.out.print(tnode.val+" -> ");
            tnode=tnode.next;
        }
        System.out.println("List Finished");
    }

    class Node{
        private Node next;
        int val;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node node){
            this.val=val;
            this.next=node;
        }
    }
}
