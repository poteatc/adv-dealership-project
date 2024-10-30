package com.yearup.dealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {
    public void saveContract(Contract contract) {
            try {
                String filePath = "src/main/resources/contracts-backup.csv";
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
                // TODO implement toString for each contract type
                bw.write(contract.toStringRepresentation());
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
