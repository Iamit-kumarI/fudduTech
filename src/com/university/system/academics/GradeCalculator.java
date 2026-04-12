package com.university.system.academics;

public class GradeCalculator {
    public String calculateGrade(double avg){
        if(avg>=85)return "A";
        if(avg>=70)return "B";
        if(avg>=55)return "C";
        return "F";
    }
}
