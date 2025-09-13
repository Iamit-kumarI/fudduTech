package OPPs.Intro.Concepts.Singleton;


//when we want to run anything only once
public class Singletonclass {
    private Singletonclass(){

    }
    private static Singletonclass instance;
    public static Singletonclass getInstance(){
        if(instance==null){
            instance=new Singletonclass();
        }
        return instance;
    }
}
