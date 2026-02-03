package Multithreading.LambdaExpression;

public class LambdaExpression {
    public static void main(String[] args) {
        Thread task1=new Thread(()->{
            System.out.println("Hi I am thread 1");
        });
        task1.start();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Execution finished");
    }
}
