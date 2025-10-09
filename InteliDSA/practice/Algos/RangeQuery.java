package Algos;

import java.util.Arrays;

public class RangeQuery {
    public static void main(String[] args) {
        int [] arr={1,3,5,2,7,6,3,1,4,8};
        int len=arr.length;
        int sqrt=(int)Math.sqrt(len);
        int blocksIndex=-1;
        int []blocks=new int[sqrt+1];
        for(int i=0;i<len;i++){
            if(i%sqrt==0){//new block starts here
                blocksIndex++;
            }
            blocks[blocksIndex]+=arr[i];
        }
        System.out.println(query(blocks,arr,2,7,3));
    }
    public static int query(int []blocks,int []arr,int left,int right,int sqrt){
        int ans=0;
        //left case
        while(left%sqrt!=0&&left<right&&left!=0){
            ans+=arr[left++];
        }
        //middle part
        while(left+sqrt<=right){
            ans+=blocks[left/sqrt];
            left+=sqrt;
        }
        //right part
        while(left<=right){
            ans+=arr[left++];
        }
        return ans;
    }
    public static void update(int []blocks,int []arr,int index,int val,int sqrt){
        int blockindex=index/sqrt;
        blocks[blockindex]+=(val-arr[index]);
        arr[index]=val;
    }
}
