package OPPs.Intro.Inheritance;

/*this is an example of multilevel inheritance*/
/*
    here box price extends inheritedclass so inheritedclass is parent for boxprice class
    and inheritedclass extends box call so here it is child for box class -> this shows
    it is a multilevel in heritance becz one child is parent for another
*/
public class BoxPrice extends InheritedClass { //level one
    double price;
    public BoxPrice(){
        super();
        this.price=-1;
    }
    public BoxPrice(double price){
        super();
        this.price=price;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.price=other.price;
    }
    public BoxPrice(double l,double h,double w,double weight,double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
