package com.yearup.dealership;


// CSV File format
// [SALE, date, name, email, vin, year, make, model, type, color, odometer, price,
//  salesTaxAmount, recordingFee, processingFee, totalPrice, isFinancing, monthlyPayment]
public class SalesContract extends Contract {

    private final double salesTaxAmount = 0.5;
    private final double recordingFee = 100.0;
    private double processingFee;
    private boolean isFinancing;

    public SalesContract(String date, String customerName, String customerEmail, boolean vehicleSold,
                         double processingFee, boolean isFinancing) {
        super(date, customerName, customerEmail, vehicleSold);
        this.processingFee = processingFee;
        this.isFinancing = isFinancing;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(int processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinancing() {
        return isFinancing;
    }

    public void setFinancing(boolean financing) {
        this.isFinancing = financing;
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
