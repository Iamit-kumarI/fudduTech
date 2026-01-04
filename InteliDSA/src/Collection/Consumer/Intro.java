package Collection.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Intro {
    public static void main(String[] args) {
        //this won't return anything will just consume what we have given
        Consumer<Integer>consume=x-> System.out.println(x);
        consume.accept(5);

        List<Integer> list= Arrays.asList(1,2,3);
        Consumer<List<Integer>>printList=x->{
            for(int val:x) System.out.print(val+", ");
        };
        printList.accept(list);
    }
}
