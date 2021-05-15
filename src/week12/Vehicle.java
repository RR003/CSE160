package week12;

public abstract class Vehicle {
    protected String ownerName;
    protected int numOfWheels;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public static void main(String[] args) {

    }
}

class Bicycle extends Vehicle {
    public Bicycle(String ownerName, int numOfWheels) {
        this.numOfWheels = numOfWheels;
        this.ownerName = ownerName;
    }
}

class MotorVehicle extends Vehicle {
    protected int volDisp;
    protected int horsePower;

    public MotorVehicle(String ownerName, int numOfWheels, int volDisp) {
        this.numOfWheels = numOfWheels;
        this.ownerName = ownerName;
        this.volDisp = volDisp;
        this.horsePower = volDisp + numOfWheels;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower() {
        this.horsePower = horsePower;
    }

    public int getVolumeDisplaced() {
        return volDisp;
    }

    public void setVolumeDisplaced(int volDisp) {
        this.volDisp = volDisp;
    }
}
