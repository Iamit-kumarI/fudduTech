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
//        doubleIt.andThen(doSomething else very wide ared)//here first double will done then other will be done
//        doubleIt.compose(doSomething else) // in this first dosomething happen then double will be done
        System.out.println(doubleIt.apply(100));
    }
}
