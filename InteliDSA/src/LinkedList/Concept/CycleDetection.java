package LinkedList.Concept;

public class CycleDetection {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
            slow=slow.next;
        }
        return false;
    }
    public int cycleLen(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            if(fast==slow){/*
                ListNode tempslow=slow.next;
                int cyclelenght=1;
                while(tempslow!=fast){
                    tempslow=tempslow.next;
                    cyclelenght+=1;
                }*/
                int cyclelenght=0;
                do{
                    slow=slow.next;//initially it was eqqual but it updated now it it will be eqqual
                    cyclelenght+=1;//again when it comes via cycle only
                }while(slow!=fast);
            }
            slow=slow.next;
        }
        return 0;
    }
    public boolean isHappy(int num){
        int slow=num;
        int fast=num;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(fast!=slow);
        if(slow==1){
            return true;
        }
        return false;
    }
    private int findSquare(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
  }
}
