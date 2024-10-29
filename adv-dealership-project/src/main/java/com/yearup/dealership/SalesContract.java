package com.yearup.dealership;

public class SalesContract extends Contract {

    private final double salesTaxAmount = .05;
    private final int recordingFee = 100;
    private int processingFee;
    private boolean financing;

    public SalesContract(String date, String customerName, String customerEmail, boolean vehicleSold, int processingFee, boolean financing) {
        super(date, customerName, customerEmail, vehicleSold);
        this.processingFee = processingFee;
        this.financing = financing;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }


    public int getRecordingFee() {
        return recordingFee;
    }

    public int getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(int processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinancing() {
        return financing;
    }

    public void setFinancing(boolean financing) {
        this.financing = financing;
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
