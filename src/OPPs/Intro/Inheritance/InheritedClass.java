package OPPs.Intro.Inheritance;

/*this is an example of single level inheritance*/
/*
        here inheritaedclass extends box call which  is base call
        it is single level of inheritance becz there is no parent of box class
        so it a classical example of single level inheritance
 */
public class InheritedClass extends Box {
    double weight;
    public InheritedClass(){
        this.weight=-1;
    }
    public InheritedClass(double l,double h,double w,double weight){
        //by super we intialise the values in parent class
        super(l,h,w);
        this.weight=weight;
    }
    public InheritedClass(InheritedClass other){
        super(other);
        this.weight= other.weight;
    }
}
