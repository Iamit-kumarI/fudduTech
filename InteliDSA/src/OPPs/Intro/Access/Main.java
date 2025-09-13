package OPPs.Intro.Access;

public class Main {
    public static void main(String[] args) {
        A obj=new A(15,"Amit");//and num can be modified the object to the class
//        System.out.println(obj.name);//accessible becz name is not private
//        System.out.println(obj.num);//num can't be accessed becz it is private
//        obj.setNum(10);
        //value of num can modified by setter
        System.out.println(obj.getNum());
    }
}
