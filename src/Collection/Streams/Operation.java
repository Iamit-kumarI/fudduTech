package Collection.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Operation {
    public static void main(String[] args) {
        //intermediate operation transform a strem into another stream
        // they won't exicute untill teminal operation exicute

        //1. Filter //takes predicate
        List<String>list= Arrays.asList("Akshit","Ram","Shyam","Ghanshyam","Akshit");
        long filterStream = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(filterStream);

        //2. Map  //takes function
        Stream<String> mapStream = list.stream().map(String::toUpperCase);
        System.out.println(mapStream.toList());

        //3. Sorted Operations
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparstor = list.stream().sorted((a, b) -> a.length() - b.length());
        System.out.println(sortedStreamUsingComparstor.toList());

        //4. Distinct ( unique)
        Stream<String> filterDistinctStringStartsWIthCharA = list.stream().filter(x -> x.startsWith("A")).distinct();
        System.out.println(filterDistinctStringStartsWIthCharA.toList());

        //5. limit
        System.out.println(Stream.generate(()->1).limit(15).toList());
        System.out.println(Stream.iterate(1,x->x+1).limit(15).toList());

        //6. skip
        System.out.println(Stream.iterate(1,x->x+1).skip(3).limit(15).toList());

        // ________________________ StateFull && StateLess Operation _______________________
        //stateless -> don't know what happen with others just doing where currently at
        //statefull -> like sorted knows what was the last element, like distinct

        //7. peek like forEach but it never terminate the process(its not a teminaloperation)
        Stream.iterate(1,x->x+1).limit(100).peek(System.out::print).count();//peek is like for each but i dosent terminalte the process
        System.out.println();
        //8. flatMap
        //handle streams of collections, lists, or arrays, where each element itself is a collection
        //Flatten nested structers (list of list) it used to flatten into a sisngle list
        //Transform and flattern  at same time
        List<List<String >>list4=Arrays.asList(
                Arrays.asList("apple","banana"),
                Arrays.asList("orange","kiwi"),
                Arrays.asList("pear","grape")
        );
        List<String> flatMap = list4.stream().flatMap(x -> x.stream())
                .map(x->x.toUpperCase()).toList();
        System.out.println(flatMap);//we can perform some opertions as well
    }

}
