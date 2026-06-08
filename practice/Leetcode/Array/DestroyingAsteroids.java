package Leetcode.Array;

import java.util.Arrays;

public class DestroyingAsteroids {
    public static void main(String[] args) {
        int[]arr={3,9,19,5,21};
        System.out.println(asteroidsDestroyed(10,arr));
    }
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int curMass=mass;
        for(int val:asteroids){
            if(val>curMass)return false;
            curMass+=val;
        }
        return true;
    }
}
