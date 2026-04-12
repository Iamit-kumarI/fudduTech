package OPPs.Intro.Interfaces;

public class Car implements Engine,Break, Media{
    @Override
    public void brake() {
        System.out.println("I apply break");
    }

    @Override
    public void start() {
        System.out.println("I start the ");
    }

    @Override
    public void stop() {
        System.out.println("I stopped the engine");
    }

    @Override
    public void accerelate() {
        System.out.println("I accerelated the engine");
    }

    @Override
    public void play() {
        System.out.println("I play the media");
    }

    @Override
    public void change(){
        System.out.println("I change the media");
    }
    @Override
    public void pause() {
        System.out.println("I pause the music");
    }
}
