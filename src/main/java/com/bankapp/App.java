package com.bankapp;

import com.bankapp.model.Customer;
import com.bankapp.service.BankService;
import com.bankapp.util.InputHelper;

public class App {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");

            int choice = InputHelper.readInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    String name = InputHelper.readString("Enter customer name: ");
                    String accountNumber = InputHelper.readString("Enter account number: ");
                    double deposit = InputHelper.readDouble("Enter initial deposit: ");
                    bankService.addCustomer(name, accountNumber, deposit);
                    System.out.println("Customer added successfully.");
                    break;
                case 2:
                    accountNumber = InputHelper.readString("Enter account number: ");
                    deposit = InputHelper.readDouble("Enter amount to deposit: ");
                    if (bankService.deposit(accountNumber, deposit)) {
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    accountNumber = InputHelper.readString("Enter account number: ");
                    double withdraw = InputHelper.readDouble("Enter amount to withdraw: ");
                    if (bankService.withdraw(accountNumber, withdraw)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient funds or account not found.");
                    }
                    break;
                case 4:
                    accountNumber = InputHelper.readString("Enter account number: ");
                    Customer customer = bankService.getCustomer(accountNumber);
                    if (customer != null) {
                        System.out.println("Name: " + customer.getName());
                        System.out.println("Balance: " + customer.getAccount().getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using BankApp!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            // Consume newline leftover
            InputHelper.readString("");
        }
    }
}
package com.bankapp;

import com.bankapp.model.Customer;
import com.bankapp.service.BankService;
import com.bankapp.util.InputHelper;

public class App {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");

            int choice = InputHelper.readInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    String name = InputHelper.readString("Enter customer name: ");
                    String accountNumber = InputHelper.readString("Enter account number: ");
                    double deposit = InputHelper.readDouble("Enter initial deposit: ");
                    bankService.addCustomer(name, accountNumber, deposit);
                    System.out.println("Customer added successfully.");
                    break;
                case 2:
                    accountNumber = InputHelper.readString("Enter account number: ");
                    deposit = InputHelper.readDouble("Enter amount to deposit: ");
                    if (bankService.deposit(accountNumber, deposit)) {
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    accountNumber = InputHelper.readString("Enter account number: ");
                    double withdraw = InputHelper.readDouble("Enter amount to withdraw: ");
                    if (bankService.withdraw(accountNumber, withdraw)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient funds or account not found.");
                    }
                    break;
                case 4:
                    accountNumber = InputHelper.readString("Enter account number: ");
                    Customer customer = bankService.getCustomer(accountNumber);
                    if (customer != null) {
                        System.out.println("Name: " + customer.getName());
                        System.out.println("Balance: " + customer.getAccount().getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using BankApp!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            // Consume newline leftover
            InputHelper.readString("");
        }
    }
}
