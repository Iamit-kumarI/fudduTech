package Collection.List.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1,String s2){
        return s1.length()-s2.length();//{"amit","abc","modi"
        // this will sort the string list like {abc,modi,amit} on the bases of word length
        //changing s1 s2 will get the charater from smallest to biggest and s2-s1 bigest to smallest
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1,Integer o2){
        return o2-o1;//decenting // o1-o2 ascending
    }
}

public class SortingConcepts {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        //sorting list
        // 1. ascending order
        list.sort(null);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(1);
//        Collections.sort(list);

        //2. sort in rev order
//        list.sort(new MyComparator());

        List<String>list1=new ArrayList<>();
        list1.add("amit");
        list1.add("ca");
        list1.add("modiJi");
//        Collections.sort(list1);//this sort in lexographic order
//        System.out.println(list1);
        //sort list according to word length
//        list1.sort(new StringLengthComparator());//sort according to word len
//        System.out.println(list1);

//        using lambda expressiong
        list.sort((a,b)->a-b);//decending b-a
        System.out.println(list);
        //same with string
        list1.sort((a,b)->a.length()-b.length());//decending word length
        System.out.println(list1);
    }
}
