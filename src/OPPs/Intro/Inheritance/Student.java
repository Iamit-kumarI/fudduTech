package OPPs.Intro.Inheritance;

public class Student extends Person{
    private  int marks;
    public void setMarks(int marks){
        if(marks>=0&&marks<=100)this.marks=marks;

    }
}
