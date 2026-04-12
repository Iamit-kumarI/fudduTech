package SortingLL;

public class MergeSort {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return mergeTwoLists(left,right);
    }
    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode thead=new ListNode();
        ListNode ttail=thead;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                ttail.next=list1;
                list1=list1.next;
                ttail=ttail.next;
            }else{
                ttail.next=list2;
                list2=list2.next;
                ttail=ttail.next;
            }
        }
        ttail.next=(list1!=null)?list1:list2;
        return thead.next;
    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    /*public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row,int col){
        if(row==0){
            if(col<row){
                Node first=get(col);
                Node second=get(col+1);
            }
            if(first.value>second.value){
                //swap
                if(fisrt==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }else if(second==tail){
                    Node pre=get(col-1);
                    pre.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;
                }else{
                    Node pre=get(col-1);
                    pre.next=second;
                    first.next=second.next;
                    second.next=first;
                }
            }
            bubbleSort(row,col+1);
        }else{
            bubbleSort(row-1,0);
        }
    }*/
    //dry run on 30th
     /*
    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }*/
    /*inplace reversal*/

    public void inPlaceReverse(ListNode head){
        if(head==null||head.next==null){
            return;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode nextNode=head.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=nextNode;
            if(nextNode!=null){
                nextNode=nextNode.next;
            }
        }

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        //lefft-1 node skip
        ListNode pres=head;
        ListNode prev=null;
        for (int i = 0; pres!=null&&i <left-1 ; i++) {
            prev=pres;
            pres=pres.next;
        }
        ListNode last=prev;
        ListNode newEnd=pres;
        //reverse between left and right
        ListNode next=pres.next;
        for (int i = 0; pres!=null&&i < right-left+1; i++) {
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        if(newEnd!=null){
            newEnd.next=pres;
        }
        return head;
    }
    class ListNode {
       int val;
       ListNode next;
       public ListNode(){
       }
       ListNode(int val){
           this.val=val;
           next=null;
       }
      public ListNode(int val,ListNode node){
           this.val=val;
           this.next=node;
       }
   }
}
