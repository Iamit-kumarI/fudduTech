package Stream;

import java.util.Arrays;
import java.util.List;

public class PracticeFirst {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Anna","Bob","Charlie","Davic");
        List<String> filterStringLengthMoreThanThree = list.stream().filter(x -> x.length() > 3).toList();
//        System.out.println(filterStringLengthMoreThanThree);

        List<Integer>lsit1=Arrays.asList(5,2,9,1,6);
//        System.out.println(lsit1.stream().map(x->x*x).sorted().toList());

        List<Integer>list2=Arrays.asList(1,2,3,4,5);
//        System.out.println(list2.stream().reduce((x,y)->x+y).get());
//        System.out.println(list2.stream().reduce(Integer::sum).get());

        String word="Hello World";//occurrence of 'l'
        System.out.println(word.chars().filter(x->x=='l').count());//chars creates stream from stirng onlly


    }
}
