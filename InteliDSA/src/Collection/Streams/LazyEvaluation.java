package Collection.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Anna","Bob","Charlie","Davic");
        Stream<String>stream=list.stream().filter(name->{
            System.out.println("Filtering Name: "+name);
            return name.length()>3;
        });
        System.out.println("Before Terminal Operation");
        List<String> result = stream.toList();
        System.out.println("After Terminal Operation");
        System.out.println(result);
    }
}
