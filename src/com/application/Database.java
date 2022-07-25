package com.application;

public class Database {
    public static BankAccount[] allAccounts = new BankAccount[10];
    static {
        allAccounts[0] = new CityBankAccount("Zhangir", "Ospanov", 900000, "KZ001234", "3301");
        allAccounts[1] = new CityBankAccount("Oxana", "Ospanova", 150000, "KZ001888", "8234");
        allAccounts[2] = new NationalBankAccount("Zhangir Ospanov", 22000, "KZ001233", "3301");
        allAccounts[3] = new CityBankAccount("Gavin", "Belson", 1800000, "US001342", "9903");
        allAccounts[4] = new CityBankAccount("Howard", "Stark", 8000, "US013432", "2094");
        allAccounts[5] = new CityBankAccount("Chingiz", "Ospanov", 30000, "KZ003847", "3301");
        allAccounts[6] = new CityBankAccount("Temirlan", "Andasov", 45000, "KZ005748", "3301");
        allAccounts[7] = new CityBankAccount("Gaziz", "Oralbay", 20000, "KZ002378", "3301");
        allAccounts[8] = new NationalBankAccount("Yelnur Aydosov", 300000, "KZ008475", "1984");
        allAccounts[9] = new NationalBankAccount("Nurkozha Praliev", 70000, "KZ003564", "3301");
    }
}
