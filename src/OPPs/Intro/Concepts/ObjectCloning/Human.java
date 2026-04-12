package OPPs.Intro.Concepts.ObjectCloning;

public class Human implements Cloneable {
    String name;
    int age;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
//    public Human(Human obj){
//        this.name=obj.name;
//        this.age=obj.age;
//    }

    @Override//override cloning method
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
