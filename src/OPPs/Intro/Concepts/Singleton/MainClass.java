package OPPs.Intro.Concepts.Singleton;

public class MainClass {
    public static void main(String[] args) {
        Singletonclass obj1=Singletonclass.getInstance();

        Singletonclass obj2=Singletonclass.getInstance();

        Singletonclass obj3=Singletonclass.getInstance();
    }
}
