package OPPs.Intro.Concepts.ObjectCloning;

public class Main {
//    public static void main(String[] args) {
//        Human amit=new Human(21,"amit");
//        /*earlier we were doing this to clone*/
////        Human camit=new Human(amit);
////        System.out.println(amit.name);
////        System.out.println(camit.name);
//    }

/*  cloning method by clonable class*/
    public static void main(String[] args)  throws CloneNotSupportedException{
        Human amit=new Human(21,"amit");
        System.out.println(amit.name);
        Human camit=(Human)amit.clone();
        System.out.println(camit.name);
    }
}
