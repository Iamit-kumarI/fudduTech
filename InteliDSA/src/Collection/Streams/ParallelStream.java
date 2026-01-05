package Collection.Streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        //a type of stream that enables parallel proccessing of elements
        //allowing multiple threads to process parts of stream simultaneously
        //this can significantly improve performence for large data sets
        //workload is distributed across multiple threads
        List<Integer> list= Stream.iterate(1, x->x+1).limit(2000).toList();
        long start=System.currentTimeMillis();
        List<Long> factorialNo = list.stream().map(ParallelStream::fact).toList();
        long end=System.currentTimeMillis();
        System.out.println("Time taken with stream is "+(end-start)+" ms");

        //parallelStream() is good for cpu intensive task and for large data set
        //and more importently all the result should be indenpendent for others like
        // factorial of 4 dosen't depend on2, 3 so its faster
        start=System.currentTimeMillis();
        factorialNo = list.parallelStream().map(ParallelStream::fact).toList();
        end=System.currentTimeMillis();
        System.out.println("Time taken with parallel stream is "+(end-start)+" ms");
    }
    public static Long fact(int n){
        if(n==1)return 1L;
        return n*fact(n-1);
    }
}
