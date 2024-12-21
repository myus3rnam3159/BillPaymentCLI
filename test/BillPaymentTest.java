package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Account;


public class BillPaymentTest {

    @Test
    void cashInOk(){
        Account acc = new Account();

        acc.addBalance(100);
        assertEquals(100, acc.getBalance());
    }
    
}
