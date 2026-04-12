package Leetcode.Weekly.Weekly487;

import javax.print.DocFlavor;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Q3 {
    public static void main(String[] args) {

    }
    class RideSharingSystem {
        Queue<Integer>driverQueue;
        Queue<Integer>riderQueue;
        int lastMatchidId;
        public RideSharingSystem() {
            driverQueue=new LinkedList<>();
            riderQueue=new LinkedList<>();
        }
        public void addRider(int riderId) {
            riderQueue.offer(riderId);
        }

        public void addDriver(int driverId) {
            driverQueue.offer(driverId);
        }

        public int[] matchDriverWithRider() {
            if(driverQueue.isEmpty()||riderQueue.isEmpty())return new int[]{-1,-1};
            lastMatchidId=riderQueue.peek();
            return new int[]{driverQueue.poll(),riderQueue.poll()};
        }

        public void cancelRider(int riderId) {
            boolean doesRiderExist=riderQueue.contains(riderId);
            if(doesRiderExist&&riderId!=lastMatchidId){
                riderQueue.remove(riderId);
            }
        }
    }
}
