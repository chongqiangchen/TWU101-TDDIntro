package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int Money;

    public Account(int Money){
        this.Money = Money;
    }
    public void depositMoney(int amount){
        this.Money += amount;
    }
    public void withdrawMoney(int amount) {
        if(this.Money >= amount) {
            this.Money -= amount;
        }
    }
    public int getMoney(){
        return this.Money;
    }
}
