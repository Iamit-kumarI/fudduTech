package OPPs.Intro.Concepts.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5,b=0;
//        int c=a/b;//cause exception by dividing 0

        /*now lets handle it*/
        try{
//            int c=a/b;
            //MyException example
            String name="kunale";
            if(name.equals("kunale")){
                throw new MyException("Name is kunal");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {//finally block exicutin hoga hi hoga what ever happens
            divide(a,b);
        }
    }
    static int divide(int a, int b)throws ArithmeticException{
        if(b==0) {
            throw new ArithmeticException("Don't divide by 0");
        }
        return a/b;
    }
}
