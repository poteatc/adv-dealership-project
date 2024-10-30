package com.yearup.dealership;

// CSV File format
// [LEASE, date, name, email, vin, year, make, model, type, color, odometer, price,
//  expectedEndingValue, leaseFee, totalPrice, monthlyPayment]
public class LeaseContract extends Contract {

    private final double expectedEndingValuePercent = 0.5;
    private final double leaseFee = .07;

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
    }

    public double getExpectedEndingValuePercent() {
        return expectedEndingValuePercent;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    @Override
    double getTotalPrice() {
        return 0;
    }

    @Override
    double getMonthlyPayment() {
        return 0;
    }

    @Override
    String toStringRepresentation() {
        return "";
    }
}
