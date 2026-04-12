package Leetcode.String;

import java.sql.PseudoColumnUsage;
import java.util.Arrays;

public class POTDLtc944 {
    public static void main(String[] args) {
        String[]str={"abc", "bce", "cae"};
        System.out.println(minDeletionSize(str));
    }
    public static int minDeletionSize(String[] strs) {
        int row=strs.length,col=strs[0].length();
        int count=0;
        for(int i=0;i<col;i++){
            for(int j=1;j<row;j++){
                if(strs[j].charAt(i)<strs[j].charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
