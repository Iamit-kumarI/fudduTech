package Collection.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Intro {
    public static void main(String[] args) {
        // Stream introduces in Java 8
        // By the help of stream we can process the collection of data in a functional and
        //declearative way
        // 1. simplifies data processing(if else wagera)
        // 2. work on functional programming
        // 3. Improve readability and maintainability
        // 4. Enable Easy Parallelsim with useing going in multithreading

        //what is stream
        //a sequence of elements supporting functional and declarative  approach
        // we can convert any collection into stream so the to perfom functional programming

        //How to implement it?
        // source - opertaion - terminal operation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        //numbers -> source
        //tradional way of fining no of even nos
//        int count=0;
//        for(int val:numbers){
//            if(val%2==0)count++;
//        }
//        System.out.println(count);
        //stream way
        System.out.println(numbers.stream().filter(x->(x&1)==0).count());
        String[]arr={"1","One","2"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String>stream1 = Stream.of("1","5","abc");
        Stream<Integer>stream2=Stream.generate(()->1);//infinit stream of 1 we can apply limit here
        Stream.iterate(1,x->x+1);
        //print 1-limit(100)
        System.out.println(Arrays.toString(Stream.iterate(1,x->x+1).limit(100).toArray()));
    }
}
