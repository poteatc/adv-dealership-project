package com.yearup.dealership;

// CSV File format
// [LEASE, date, name, email, vin, year, make, model, type, color, odometer, price,
//  expectedEndingValue, leaseFee, totalPrice, monthlyPayment]
public class LeaseContract extends Contract {

    private double expectedEndingValue = .5;
    private double leaseFee = .07;

    public LeaseContract(String date, String customerName, String customerEmail, boolean vehicleSold,
                         double expectedEndingValue, double leaseFee) {
        super(date, customerName, customerEmail, vehicleSold);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    double getTotalPrice() {
        return 0;
    }

    @Override
    double getMonthlyPayment() {
        return 0;
    }
}
