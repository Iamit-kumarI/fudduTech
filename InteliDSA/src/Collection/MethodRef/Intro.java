package Collection.MethodRef;

import java.util.Arrays;
import java.util.List;

public class Intro {
    public static void main(String[] args) {
        //method ref provide us facility to use a method without invoking it
        //this is used on the place of lambda expression
        List<String> list = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        list.forEach(x-> System.out.println(x));//this is lambda ways
        list.forEach(System.out::println);//this is method ref

    }
}
