package Collection.Supplier;

import java.util.function.Supplier;

public class Intro {
    public static void main(String[] args) {
        //take noting just return
        Supplier<String>supplier=()->"Hello World";
        System.out.println(supplier.get());
    }
}
