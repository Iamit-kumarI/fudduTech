package OPPs.Intro.Inheritance;

public class Box {
    double l,h,w;
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double par){
        this.l=par;
        this.h=par;
        this.w=par;
    }
    Box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box oldbox){
        this.l=oldbox.l;
        this.h=oldbox.h;
        this.w=oldbox.w;
    }

    public static void main(String[] args) {
        System.out.println("Running the Box");
    }
}
