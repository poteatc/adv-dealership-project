package com.yearup.dealership;

public class LeaseContract extends Contract {

    private final double expectedEndingValue = .5;
    private final double leaseFee = .07;

    public LeaseContract(String date, String customerName, String customerEmail, boolean vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
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
