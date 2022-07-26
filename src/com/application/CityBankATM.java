package com.application;

import java.util.Scanner;

public class CityBankATM {
    static Scanner scan = new Scanner(System.in);

    public static boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void cityBank(CityBankAccount account) {
        System.out.println("\nPRESS [1] TO CASH WITHDRAWAL");
        System.out.println("PRESS [2] TO VIEW BALANCE");
        System.out.println("PRESS [3] TO CHANGE PIN CODE");
        System.out.println("PRESS [4] TO CASH IN ACCOUNT");
        System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
        System.out.println("PRESS [6] TO EXIT");

        System.out.print("Choice: ");
        int request = scan.nextInt();

        switch (request) {
            case 1 -> {
                System.out.print("How much to withdraw: ");
                int credit = scan.nextInt();
                account.creditBalance(credit);
            }
            case 2 -> System.out.printf("Total balance: %d", account.totalBalance());
            case 3 -> {
                scan.nextLine();
                System.out.print("New PIN code: ");
                String newPinCode = scan.nextLine();
                account.setPinCode(newPinCode);
            }
            case 4 -> {
                System.out.print("How much to cash in: ");
                int debt = scan.nextInt();
                account.debtBalance(debt);
            }
            case 5 -> System.out.println(account.accountData());
            case 6 -> {
                System.out.println("Quitting...");
                System.exit(0);
            }
        }
    }

    public static void nationalBank(NationalBankAccount account) {
        System.out.println("\nPRESS [1] TO CASH WITHDRAWAL");
        System.out.println("PRESS [2] TO VIEW BALANCE");
        System.out.println("PRESS [3] TO EXIT");

        int request = scan.nextInt();

        switch (request) {
            case 1 -> {
                System.out.print("How much to withdraw: ");
                int credit = scan.nextInt();
                account.creditBalance(credit);
            }
            case 2 -> System.out.printf("Total balance: %d", account.totalBalance());
            case 3 -> {
                System.out.println("Quitting...");
                System.exit(0);
            }
        }
    }


    public static void runATM(String accountNumber, String pinCode ) {
        if (!accountNumber.trim().equals("") && !pinCode.trim().equals("")) {
            for(BankAccount account : Database.allAccounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    while (true) {
                        if (account instanceof CityBankAccount)
                            cityBank((CityBankAccount) account);
                        else if(account instanceof NationalBankAccount)
                            nationalBank((NationalBankAccount) account);
                    }
                }
            }
        } else {
            throw new Error("Incorrect account number or PIN");
        }
    }


    public static void main(String[] args) {
        System.out.print("Enter your account number: ");
        String accountNumber = scan.nextLine();

        System.out.print("Enter your PIN code: ");
        String pinCode = scan.nextLine();

        if(pinCode.length() == 4 && isNumeric(pinCode))
            runATM(accountNumber, pinCode);
        else
            throw new Error("\nIncorrect account number or PIN");
    }
}