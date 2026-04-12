package OPPs.Intro.Inheritance;

public class Main {
    public static void main(String[] args) {
        /*normally */
//        Box b1=new Box();
//        Box b1=new Box(5);
//        Box b1=new Box(2,3,4);
//        Box newBox=new Box(b1);//paisng the old box
//        System.out.println(b1.l+", "+b1.h+", "+b1.w);
//        System.out.println((newBox.l+1)+", "+(newBox.h+1)+", "+(newBox.w+1));

    /*this is an example of single level inheritance*/
        /*when inherited box->inheritedclass*/
//        InheritedClass Box3=new InheritedClass();
        //this works but in case when we pass weight then
//        System.out.println(Box3.l+", "+Box3.h);

        //in inherited call we are using super keyword to intialise the valeus
//        InheritedClass Box4=new InheritedClass(2,3,4,5);
//        System.out.println(Box4.l+", "+Box4.h+", "+Box4.w+", "+Box4.weight);


        /*this is an example of multilevel inheritance*/
        /*Level 2 inheritance box->inheritedclass->boxprice*/
//        BoxPrice box5=new BoxPrice();
//        System.out.println(box5.l+", "+box5.price);

        BoxPrice box6=new BoxPrice(5);
        BoxPrice box7=new BoxPrice(box6);
        System.out.println(box7.l+", "+box7.h+", "+box7.w+", "+box7.weight+", "+box7.price);
    }
}
