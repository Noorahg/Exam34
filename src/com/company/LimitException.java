package com.company;

public class  LimitException extends BankAccount  {
 double remainingAmount;
 public LimitException(String message,double remainingAmount){
     super(Double.parseDouble(message));
     this.remainingAmount=remainingAmount;
 }

}
