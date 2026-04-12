package OPPs.Intro.Abstract;

public class Main {
    public static void main(String[] args) {
        Child child=new Child();
        child.career("hi");

        Dougther dougther=new Dougther();
        dougther.partner("hello",22);
        System.out.println("Java Runtime version: " + System.getProperty("java.version"));

    }
}
