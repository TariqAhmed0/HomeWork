package ConcreteClasses;

import java.io.Serializable;

public class Laundry implements Serializable 
{
    private double laundryBill;
    private double totalGarmets;


    public Laundry() {
        this.laundryBill = 900;
        this.totalGarmets = 30;
    }

    public Laundry(double laundryBill, double totalGarmets) {
        this.laundryBill = laundryBill;
        this.totalGarmets = totalGarmets;
    }

    public double getLaundryBill() {
        return this.laundryBill;
    }

    public void setLaundryBill(double laundryBill) {
        this.laundryBill = laundryBill;
    }

    public double getTotalGarmets() {
        return this.totalGarmets;
    }

    public void setTotalGarmets(double totalGarmets) {
        this.totalGarmets = totalGarmets;
    }

    // Increasing the Garment Limits

    public void increaseGarmentLimits(double newGarments) {
        this.totalGarmets += newGarments;
        
        for (int i = 0; i < newGarments;i++){
            this.laundryBill += 30;
        }
    }



    @Override
    public String toString() {
        return
            " Laundry Bill = " + getLaundryBill() + "\n" +
                    " Total Garmets = " + getTotalGarmets() + "\n";
    }

}
