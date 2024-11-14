package com.atm.model;

import java.util.Scanner;

public class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    // Menentukan saldo minimal sebagai konstanta
    public static final double MINIMUM_BALANCE = 50000.0;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
    
    // Getter dan Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }

    public void changePin(Scanner scanner) {
        System.out.print("Masukkan PIN lama: ");
        String oldPin = scanner.nextLine();

        if (!this.pin.equals(oldPin)) {
            System.out.println("PIN lama tidak sesuai.");
            return;
        }

        System.out.print("Masukkan PIN baru: ");
        String newPin1 = scanner.nextLine();
        System.out.print("Masukkan ulang PIN baru: ");
        String newPin2 = scanner.nextLine();

        if (!newPin1.equals(newPin2)) {
            System.out.println("PIN baru tidak cocok.");
        } else {
            this.pin = newPin1;
            System.out.println("PIN berhasil diubah.");
        }
    }
}
