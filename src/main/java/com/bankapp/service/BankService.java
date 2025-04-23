package com.bankapp.service;

import com.bankapp.model.Account;
import com.bankapp.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<String, Customer> customerMap = new HashMap<>();

    public void addCustomer(String name, String accountNumber, double initialDeposit) {
        Account account = new Account(accountNumber, initialDeposit);
        Customer customer = new Customer(name, account);
        customerMap.put(accountNumber, customer);
    }

    public boolean deposit(String accountNumber, double amount) {
        Customer customer = customerMap.get(accountNumber);
        if (customer != null) {
            customer.getAccount().deposit(amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(String accountNumber, double amount) {
        Customer customer = customerMap.get(accountNumber);
        if (customer != null) {
            return customer.getAccount().withdraw(amount);
        }
        return false;
    }

    public Customer getCustomer(String accountNumber) {
        return customerMap.get(accountNumber);
    }
}
