package com.yearup.dealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {
    public void saveContract(Contract contract) {
        if (contract instanceof SalesContract) {
            try {
                String filePath = "src/main/resources/contracts-backup.csv";
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (contract instanceof LeaseContract) {

        }
    }
}
