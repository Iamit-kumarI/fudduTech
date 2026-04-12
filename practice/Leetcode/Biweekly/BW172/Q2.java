package Leetcode.Biweekly.BW172;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 {
    public int maximumSum(int[] nums) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>lsit2=new ArrayList<>();
        ArrayList<Integer>lsit3=new ArrayList<>();
        for(int cur:nums){
            if(cur%3==0)list1.add(cur);
            else if(cur%3==1)lsit2.add(cur);
            else lsit3.add(cur);
        }
        lsit2.sort(Collections.reverseOrder());
        lsit3.sort(Collections.reverseOrder());
        list1.sort(Collections.reverseOrder());
        int res=0;
        if(list1.size()>=3){
            res=Math.max(res,list1.get(0)+list1.get(1)+list1.get(2));
        }
        if(lsit2.size()>=3){
            res=Math.max(res,lsit2.get(0)+lsit2.get(1)+lsit2.get(2));
        }
        if(lsit3.size()>=3){
            res=Math.max(res,lsit3.get(0)+lsit3.get(1)+lsit3.get(2));
        }
        if(!list1.isEmpty()&&!lsit2.isEmpty()&&!lsit3.isEmpty()){
            res=Math.max(res,list1.get(0)+lsit2.get(0)+lsit3.get(0));
        }
        return res;
    }
}
