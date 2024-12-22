package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Account {
    private int balance;

    public Account() {

        try (BufferedReader reader = new BufferedReader(new FileReader("./db/balance.txt"))){
            this.balance = Integer.parseInt(reader.readLine());

            reader.close();
        } catch (IOException e) {
            System.err.println(String.format("Error while reading balance: %s", e.getMessage()));
        }
    }

    public void addBalance(int amount) {
        this.balance += amount;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./db/balance.txt"))){
            writer.write(String.valueOf(this.balance));
            writer.close();

        } catch (IOException e) {
            System.err.println(String.format("Error while updating balance: %s\n", e.getMessage()));
        }
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int bal){
        this.balance = bal;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./db/balance.txt"))){
            writer.write(String.valueOf(this.balance));
            writer.close();

        } catch (IOException e) {
            System.err.println(String.format("Error while updating balance: %s\n", e.getMessage()));
        }
    }
}