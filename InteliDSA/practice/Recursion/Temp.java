package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        int[]arr={1,42,7,8,34,32,3,5,6,80};
        List<Integer> list=Arrays.stream(arr).boxed().toList();
        long evenCount = list.stream().filter(x->(x%2)==0).count();
        System.out.println(evenCount);
    }
}
