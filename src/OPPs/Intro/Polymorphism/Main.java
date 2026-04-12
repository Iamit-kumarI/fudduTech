package OPPs.Intro.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();
        Shapes triangle=new Triangle();
//        shape.area();
//        circle.area();
        square.area();
        triangle.area();
        /*
        * here area() is used with multiple objects which shows area() is giving
        * different different output with diff diff refrences
        * Hence this is a classical example of run time polymorphism
        */
    }
}
