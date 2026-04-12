package OPPs.Intro.Abstract;

public class Dougther extends Parent{
    @Override
    void career(String name) {

        System.out.println("I am Dougther career method "+name);
    }

    @Override
    void partner(String name, int age) {

        System.out.println("I am Dougther partner method "+name+" age "+age);
    }
}
