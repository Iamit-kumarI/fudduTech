package com.university.system.app;

import com.university.system.academics.GradeCalculator;
import com.university.system.rules.UniversityRules;
import com.university.system.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s=new Student(101,"Suman");
        GradeCalculator gc=new GradeCalculator();
        UniversityRules ur=new UniversityRules();
        s.printInfo();
        double avg=82.5;
        String grade=gc.calculateGrade(avg);
        System.out.println("Average "+avg);
        System.out.println("Grade "+grade);

        ur.printScholarshipPolicy(grade);
    }
}
