package OPPs.Intro.Polymorphism;

public class Circle extends Shapes{
    @Override/*this anotation tell us if a no is overriden or not*/
    void area(){
        System.out.println("Area of circle is pir* r^2");
    }
}
