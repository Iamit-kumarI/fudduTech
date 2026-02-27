package com.university.system.student;

public class Student {
    private int id;
    private String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void printInfo(){
        System.out.println("Student id "+id);
        System.out.println("Name "+name);
    }
}
