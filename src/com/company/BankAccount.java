package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public BankAccount(){};

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return  amount;
    };

    void deposite(double sum){
        sum=amount+sum;
        System.out.println(sum);

    };

    void withDraw(double sum){

      sum  =sum-amount;
        System.out.println(sum);

    };
}
