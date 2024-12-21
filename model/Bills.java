package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Bills {
    private final List<Bill> bills = new ArrayList<>();

    public void list(){

        try (BufferedReader br = new BufferedReader(new FileReader("db/bill.csv"))) {
            String fisrt = br.readLine();

            String[] headers = fisrt.split(",");
            System.out.printf("%-10s %-10s %-10s %-15s %-10s %-10s\n",
                    headers[0],  
                    headers[1],  
                    headers[2],  
                    headers[3],  
                    headers[4],  
                    headers[5] );

            String line;
            while ((line = br.readLine()) != null) {
                
                String[] columns = line.split(",");
                this.bills.add(new Bill(columns));

                
                System.out.printf("%-10s %-10s %-10s %-15s %-10s %-10s\n",
                    columns[0],  
                    columns[1],  
                    columns[2],  
                    columns[3],  
                    columns[4],  
                    columns[5] 
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean compare(List<Bill> lst){
        boolean check = true;

        for(Bill b: this.bills){
            
        }

        return check;

    }

    public void addBill(Bill b){
        this.bills.add(b);
    }
}
