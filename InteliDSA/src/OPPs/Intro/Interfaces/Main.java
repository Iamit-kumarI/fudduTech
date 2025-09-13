package OPPs.Intro.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car c=new Car();
        c.play();
        c.stop();

        System.out.println(c.hashCode());
    }
}
