package OPPs.Intro.Abstract;

public class Child extends Parent{
    @Override
    void career(String name) {
        System.out.println("I am Child career method "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I am Child partner method "+name+" age "+age);
    }
}
