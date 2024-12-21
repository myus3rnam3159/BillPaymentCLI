package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Account;
import model.Bill;
import model.Bills;

import java.util.ArrayList;
import java.util.List;

public class BillPaymentTest {

    @Test
    void cashInOk() {
        Account acc = new Account();

        acc.setBalance(0);

        acc.addBalance(100);
        assertEquals(100, acc.getBalance());
    }

    @Test
    void listBillOk() {
         List<Bill> bills = new ArrayList<>();

         Bill b = new Bill(1, "ELECTRIC", 200000, "25/10/2020", "NOT_PAID", "EVN HCMC");

        // Add Bill objects to the list
        bills.add(b);

        Bills bs = new Bills();
        bs.addBill(b);

        assertEquals(true, bs.compare(bills));
    }

}
