package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bill {
    private int no;
    private String type;
    private int amount;
    private Date dueDate;
    private String state;
    private String provider;

    public Bill(String[] data){
        this.no = Integer.parseInt(data[0]);
        this.type = data[1];

        this.amount = Integer.parseInt(data[2]);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dueDate = formatter.parse(data[3]);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.state = data[4];
        this.provider = data[5];
    }

    public Bill(int no, String type, int amount, String dueDate, String state, String provider){
        this.no = no;
        this.type = type;

        this.amount = amount;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dueDate = formatter.parse(dueDate);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.state = state;
        this.provider = provider;
    }

    boolean compare(Bill b){
        return this.no == b.getNo() 
            && this.type.compareTo(b.getType()) == 0
            && this.amount == b.getAmount()
            && this.dueDate.compareTo(b.getDueDate()) == 0
            && this.state.compareTo(b.getState()) == 0
            && this.provider.compareTo(b.getProvider()) == 0;
    }

    public int getNo(){
        return this.no;
    }

    public String getType(){
        return this.type;
    }

    public int getAmount(){
        return this.amount;
    }

    public Date getDueDate(){
        return this.dueDate;
    }

    public String getState(){
        return this.state;
    }

    public String getProvider(){
        return this.provider;
    }
}
