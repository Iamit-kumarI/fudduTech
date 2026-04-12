package Collection.Lambda;

public class Intro {
    public static void main(String[] args) {
        //lambda Function -> no name,return type,access modifiers
        MathOperation sum=(a,b)->a+b;
        MathOperation sub=(a,b)->a-b;
        MathOperation mul=(a,b)->a*b;
        MathOperation div=(a,b)->a/b;
        System.out.println(sum.operation(1,2));

    }
}
interface MathOperation{
    int operation(int a,int b);
}
