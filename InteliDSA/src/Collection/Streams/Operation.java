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

    }

}
