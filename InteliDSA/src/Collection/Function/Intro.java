package Collection.Function;

import java.util.function.Function;

public class Intro {
    public static void main(String[] args) {
        // most userfull
        Function<Integer,Boolean>isEven=x->x%2==0;
        System.out.println(isEven.apply(100));

        //we can perform any opertion
//        Function<type of value we are giving, type of valve we want>functionName=operation;
        Function<Integer,Integer>doubleIt=x->x*2;
        System.out.println(doubleIt.apply(100));
    }
}
