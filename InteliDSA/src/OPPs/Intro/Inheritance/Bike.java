package OPPs.Intro.Inheritance;

public class Bike extends Vehicle{
    char color;
    String ownerName="Amit";
    String bikeName;
    int no;
    Bike(String capacity,int size,char color,int no){
        super(capacity,size);
        this.color=color;
        this.no=no;
    }
    public char getColor(){
        return color;
    }
    public void start(){
        System.out.println("Engine Strted");
    }
    public void stop(){
        System.out.println("Engine Stopped");
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void printBike(){
        System.out.println(color);
        System.out.println(ownerName);
        System.out.println(no);
        System.out.println(super.engineCapacity);
        System.out.println(bikeName);
    }
    public void setBikeName(String bikename){
        this.bikeName=bikename;
    }
}
