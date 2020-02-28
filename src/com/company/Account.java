package com.company;

public class Account {
    private String number;
    private long balance;
    private boolean isLocked;

    public Account(String number, long balance, boolean isLocked) {
        this.number = number;
        this.balance = balance;
        this.isLocked = isLocked;
    }

    public String getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return isLocked;
    }

}
