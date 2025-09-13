package LinkedList.Concept;

public class LL {
    private Node head;
    private Node tail;
    private int size;
//    public LL() {
//        this.size=0;
//    }

    public void inserIndex(int val,int index){
        if(index==0){
            inserFirst(val);
            return;
        }
        if(index==size){
            inserLast(val);
            return;
        }
        Node tempindex=head;
        for (int i = 1; i < index; i++) {
            tempindex= tempindex.next;
            //now it will reach at the index we want to insert the value
        }
        Node node=new Node(val,tempindex.next);
        tempindex.next=node;
        size+=1;

    }
    public void inserFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void inserLast(int val){
        if(tail==null){
            inserFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public int deleteFirst() {
        int val=head.value;
        head=head.next;
        if(head==null){//checking if all the items are deleted then head goes to null then
            tail=null;  //tail also should go to null
        }
        size-=1;
        return val;
    }
    public int deleteFromIndex(int index){
        if (index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        /*myway*/
//        Node preIndex=findLastNode(index-1);
//        Node indexToDelete=findLastNode(index);
//        Node toPointNow=findLastNode(index+1);
//        int val=indexToDelete.value;
//        preIndex.next=toPointNow;
//        return val;
        Node preIndex=findLastNode(index-1);
        int val=preIndex.next.value;//this is being deleted
        preIndex.next=preIndex.next.next;//now pointing next to next
        return val;
    }
    public Node findLastNode(int index){
        Node node=head;//we don't have method to go previous we have to go there by iteratively
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=findLastNode(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("List Finished");
    }
    public int searchByValue(int val){
        Node tempNode=head;
        //we always travers by using tempNode or node we don't incremnt head value directly
        //doing so might change the structure of the linkedlsit
        while(tempNode!=null){
            if(tempNode.value==val){
                return val;
            }
            tempNode=tempNode.next;
        }
        return -1;
    }

    /*problem solving*/
    //insert using recursion
    public void insertRecursion(int val,int index){
        head=insertRecursion(val,index,head);
    }
    private Node insertRecursion(int val,int index,Node node){
        if(index==0){//now we can add the values
            Node newNode=new Node(val,node);//node here in parameter tell that new nodes
            //next will be the current node  where index become 0
            size+=1;
            //now here see the notes 7 is added so its connectiong makes with last other
            //nodes 1 but now it is remaning to make connection of 7 -> 1 with 9 -> 7 -> 1
            return newNode;
        }
        node.next= insertRecursion(val,index-1,node.next);//decress index by one and updateing
        //current node
        return node;
    }
    public static LL mergeLL(LL list1,LL list2){
        Node f=list1.head;
        Node s=list2.head;
        LL ans=new LL();//creating this to store answers
        while(f!=null&&s!=null){
            if(f.value<s.value){
                ans.inserLast(f.value);
                f=f.next;
            }else{
                ans.inserLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
//            ans.next=f; // do this i don't know how
            ans.inserLast(f.value);
            f=f.next;
        }
        while(s!=null){
//            ans.next=s; // same this done add na just tell your next is there
            ans.inserLast(s.value);
            s=s.next;
        }
        return ans;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        LL list1=new LL();
        LL list2=new LL();
        for(int i=0;i<5;i++){
            list1.inserLast(i);
        }
        list1.display();
        for(int i=0;i<5;i++){
            list2.inserLast(i*2);
        }
        list2.display();
        LL ans=mergeLL(list1,list2);
        ans.display();
    }
}
