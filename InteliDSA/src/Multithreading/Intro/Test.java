package Multithreading.Intro;


public class Test {
    public static void main(String[] args) {
        World world=new World();
//        world.start(); //when extends Thred
        Thread t1=new Thread(world);
        t1.start();
        for(int i=0;i<100;i++){
            System.out.println("Hello ");
        }
    }
}
