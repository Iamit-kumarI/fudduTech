package Collection.Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Premtives {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        IntStream stream = Arrays.stream(arr);
        //stream. here we can perform our operations
//        System.out.println(IntStream.range(1,5).boxed().toList());
        System.out.println(stream.filter(x->x>4).sum());
    }
}
