package LinkedList.Concept;

import SortingLL.MergeSort;

import java.util.List;

public class LLisPalindrome {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode inPlaceReverse(ListNode head){
        if(head==null||head.next==null){
            return head;
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
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
//        ListNode tempNode=head;
//        while(tempNode!=null&&tempNode.next!=null){
//            if(tempNode.val==tempNode.next.val){
//                tempNode=tempNode.next.next;
//            }
//        }
//        return tempNode==head;
        ListNode mid=middleNode(head);
        ListNode headSecondHalf=inPlaceReverse(mid);
        ListNode reRevHead=headSecondHalf;
        while(head!=null&&headSecondHalf!=null){
            if(head.val!=headSecondHalf.val){
//                return false; //don't return we need to revers it also
            }
            head=head.next;
            headSecondHalf=headSecondHalf.next;
        }
        inPlaceReverse(reRevHead);
        return head==headSecondHalf;
    }
    public void reorderList(ListNode head) {
        //take middle and swap and then do s+e+s+e .. just
        if(head==null||head.next==null){
            return;
        }
        ListNode mid=middleNode(head);
        ListNode shead=inPlaceReverse(mid);
        ListNode fhead=head;
        // now do s+e+s+e+s.. till null
        while(fhead!=null&&shead!=null){
            ListNode temp=fhead.next;
            fhead.next=shead;
            fhead=temp;
            //going in second
            temp=shead.next;
            shead.next=fhead;
            shead=temp;
        }
        if(fhead!=null){
            fhead=null;
        }
    }//now doing for
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1||head==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        while(pres!=null){
            //lefft-1 node skip
//            ListNode pres=head;
//            ListNode prev=null;
//            for (int i = 0; pres!=null&&i <left-1 ; i++) {
//                prev=pres;
//                pres=pres.next;
//            }
            ListNode check = pres;
            int count = 0;
            while (check != null && count < k) {
                check = check.next;
                count++;
            }
            if(count<k){
                break;
            }
            ListNode last=prev;
            ListNode newEnd=pres;
            //reverse between left and right
            ListNode next=pres.next;
            for (int i = 0;pres!=null&&i < k; i++) {
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
//            if(pres==null){
//                break;
//            }
//            prev=newEnd;
            //skip the k node
            for (int i = 0; pres!=null&&i <k ; i++) {
                prev=pres;
                pres=pres.next;//doing alternatively
            }
        }
        return head;
    }
    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}
