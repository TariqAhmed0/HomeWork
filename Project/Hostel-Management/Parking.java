package ConcreteClasses;

import java.io.Serializable;

public class Parking implements Serializable {
    private String vehicleType;
    private String vehicleNumber;
    private double parkingBill;

    
    public Parking(String vehicleType, String vehicleNumber) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.parkingBill = 600;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double getParkingBill() {
        return this.parkingBill;
    }

    public void setParkingBill(double parkingBill) {
        this.parkingBill = parkingBill;
    }

    @Override
    public String toString() {
        return
            "Vehicle Type = " + getVehicleType() + "\n" +
            "Vehicle Number = " + getVehicleNumber() + "";
    }

}
