package week12;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Bicycle("Steve", 2);
        System.out.println(v1.getOwnerName());
        System.out.println(v1.getNumOfWheels());
        Vehicle v2 = new MotorVehicle("Jess", 2, 100);
        System.out.println(v2.getOwnerName());
        System.out.println(v2.getNumOfWheels());
        System.out.println(((MotorVehicle) v2).getVolumeDisplaced());
        System.out.println(((MotorVehicle) v2).getHorsePower());
    }
}
