package Leetcode.Biweekly.BW180;

public class Q1 {
    public String trafficSignal(int timer) {
        if(timer==0)return "Greeen";
        else if(timer<=30)return "Orange";
        else if(timer>30&&timer<=90)return "Red";
        return "Invalid";
    }
}
