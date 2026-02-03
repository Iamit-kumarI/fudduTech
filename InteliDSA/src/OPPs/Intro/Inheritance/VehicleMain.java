package OPPs.Intro.Inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Bike greenBike=new Bike("200cc",13,'c',300);
        System.out.println(greenBike.getColor());
        greenBike.start();
        greenBike.stop();
        System.out.println(greenBike.getOwnerName());
        greenBike.printBike();
        greenBike.setBikeName("splender");
        greenBike.printBike();
    }
}
