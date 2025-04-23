package com.bankapp.service;

import com.bankapp.model.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankServiceTest {

    @Test
    public void testAddCustomerAndGetCustomer() {
        BankService bankService = new BankService();
        bankService.addCustomer("Alice", "ACC123", 1000.0);

        Customer customer = bankService.getCustomer("ACC123");
        assertNotNull(customer);
        assertEquals("Alice", customer.getName());
        assertEquals(1000.0, customer.getAccount().getBalance());
    }

    @Test
    public void testDeposit() {
        BankService bankService = new BankService();
        bankService.addCustomer("Bob", "ACC456", 500.0);

        boolean success = bankService.deposit("ACC456", 200.0);
        assertTrue(success);
        assertEquals(700.0, bankService.getCustomer("ACC456").getAccount().getBalance());
    }

    @Test
    public void testWithdraw() {
        BankService bankService = new BankService();
        bankService.addCustomer("Charlie", "ACC789", 800.0);

        boolean success = bankService.withdraw("ACC789", 300.0);
        assertTrue(success);
        assertEquals(500.0, bankService.getCustomer("ACC789").getAccount().getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankService bankService = new BankService();
        bankService.addCustomer("Diana", "ACC321", 100.0);

        boolean success = bankService.withdraw("ACC321", 150.0);
        assertFalse(success);
        assertEquals(100.0, bankService.getCustomer("ACC321").getAccount().getBalance());
    }
}
