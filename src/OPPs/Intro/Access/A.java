package OPPs.Intro.Access;

public class A {
//    int num;
    String name;
    int[]arr;

    /*now if i make this item num as private then to access it out side the class we have to
    * make getter and setters*/
    private int num;
    /*now to access this we have to make getters*/

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
}
