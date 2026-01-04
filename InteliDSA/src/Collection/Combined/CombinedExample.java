package Collection.Combined;

import java.util.function.*;

public class CombinedExample {
    //Predicate + Supplier + Consumer + Function
    public static void main(String[] args) {
        Predicate<Integer>predicate=x->x%2==0;
        Function<Integer,Integer>function=x->x*x;
        Consumer<Integer> consumer=x-> System.out.println(x);
        Supplier<Integer>supplier=()->100;
        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
        //now all these predicate, function, comsumer all takes only one argument here
        //but they aslo take two argurment like this
//        BiFunction, BiConsumer, BiPredicate
        BiPredicate<Integer,Integer>biPredicate=(x,y)->(x+y)%2==0;
        System.out.println(biPredicate.test(4,8));
        BiConsumer<Integer,Integer>biConsumer=(x,y)->{
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<Integer,Integer,Boolean>biFunction=(x,y)->x/y>6;
        System.out.println(biFunction.apply(4,9));
    }
}
