package com.application;

public interface BankAccount {
    String getAccountNumber(); // номер счет
    String getPinCode();
    void setPinCode(String pinCode);
    int totalBalance();
    void creditBalance(int credit);
    void debetBalance(int debet);
    String accountData();

}
