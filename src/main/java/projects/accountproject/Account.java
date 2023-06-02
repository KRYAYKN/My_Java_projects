package projects.accountproject;

import java.util.Scanner;

public class Account {

    private int accountNumber;
    private double balance;
    private Scanner scan = new Scanner(System.in);
    public static int customerNo;

    public Account() {
        customerNo++;
    }

    public void depositMoney(){
        System.out.println("Money in your balance is: " + balance);
        System.out.println("Enter the money you want to deposit");
        double money = scan.nextDouble();
        balance += money;
        System.out.println("Current money in your balance is: " + balance);
    }

    public void withdrawMoney(){
        System.out.println("Money in your balance is: " + balance);
        System.out.println("Enter the money you want to withdraw");
        double money = scan.nextDouble();
        if(money>balance){
            System.out.println("Insufficient balance");
            withdrawMoney();
        } else if(money>5000){
            System.out.println("You exceeded the daily limit");
            withdrawMoney();
        } else if(money<=balance){
            balance -= money;
            System.out.println("Current money in your balance is: " + balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }


}
