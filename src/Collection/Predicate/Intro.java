package Collection.Predicate;

import java.util.function.Predicate;

public class Intro {
    // Predicate -> (Functional Interface) boolean valued function
    public static void main(String[] args) {
        Predicate<Integer>isEven=x->x%2==0;//this alsways works on boolean true false
        System.out.println(isEven.test(4));
        Predicate<String>isStartsWith=x->x.toLowerCase().startsWith("m");
        Predicate<String>isEndingWith=x->x.toLowerCase().endsWith("i");
        Predicate<String>combine=isStartsWith.and(isEndingWith);//can joing two predicate
        System.out.println(combine.test("Modi"));
    }
}
