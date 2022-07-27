package com.application;

public class CityBankAccount implements BankAccount {
    String name;
    String surname;
    int balance;
    String accountNumber;
    String pinCode;

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String newPinCode) {
        this.pinCode = newPinCode;
        System.out.println("PIN code has been updated.");
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        balance -= credit;
        System.out.printf("Updated balance: %d", balance);
    }

    @Override
    public void debtBalance(int debt) {
        balance += debt;
        System.out.printf("Updated balance: %d", balance);
    }

    @Override
    public String accountData() {
        String message = "Name: %s\nSurname: %s\nAccount number: %s\nBalance: %d";
        return String.format(message, name, surname, accountNumber, balance);
    }


}