package com.university.system.rules;

public class UniversityRules {
    public void printScholarshipPolicy(String grade){
        switch (grade){
            case "A":
            case "B":
                System.out.println("Eligible for scholarship");
                break;
            default:
                System.out.println("Not eligible for scholarship");
        }
    }
}
