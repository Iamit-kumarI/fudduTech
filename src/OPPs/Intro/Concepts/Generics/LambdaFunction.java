package OPPs.Intro.Concepts.Generics;

public class LambdaFunction {
    public static void main(String[] args) {
        Operation sum=(a,b)->a+b;
        Operation prod=(a,b)->a*b;
        Operation sub=(a,b)->a-b;

        LambdaFunction myCalculator=new LambdaFunction();
        System.out.println(myCalculator.operate(5,3,sum));
        System.out.println(myCalculator.operate(5,3,prod));
        System.out.println(myCalculator.operate(5,3,sub));
    }
    private int operate(int a,int b, Operation op){
        return op.operation(a,b);
    }

    interface Operation{
        int operation(int a,int b);
    }
}
