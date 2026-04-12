package OPPs.Intro.Concepts.Statickey;

public class StaticKeyword {
    static int a=4;
    static int b;
    //static block this only runs only once when ob is creted
    static {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticKeyword firstobj=new StaticKeyword();
        System.out.println(StaticKeyword.a+", "+StaticKeyword.b);
        StaticKeyword.b+=3;

        System.out.println(StaticKeyword.a+", "+StaticKeyword.b);
        StaticKeyword secondobj=new StaticKeyword();
        System.out.println(StaticKeyword.a+", "+StaticKeyword.b);
    }

}
