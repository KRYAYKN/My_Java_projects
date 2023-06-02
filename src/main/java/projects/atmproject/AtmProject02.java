package projects.atmproject;

import java.util.HashMap;
import java.util.Scanner;

public class AtmProject02 {

    static int customerNoInTheBank = 0;
    static float moneyInTheBankAccount = 0;

    static Scanner scan = new Scanner(System.in);
    static HashMap<Integer, Integer> customers = new HashMap<>();
    static HashMap<Integer, Float> bankAccount = new HashMap<>();

    public static void main(String[] args) {

        customers.put(12345678, 1876);
        customers.put(22222222, 1234);
        customers.put(98765432, 1453);
        customers.put(55554444, 2020);

        bankAccount.put(12345678, 120.0f);
        bankAccount.put(22222222, 3000.0f);
        bankAccount.put(98765432, 7000.0f);
        bankAccount.put(55554444, 50.0f);

        checkCustomerNoAndPwd();

    }

    public static void checkCustomerNoAndPwd(){

        System.out.println("Enter your customer number and password");
        int customerNo = scan.nextInt();
        int pwd = scan.nextInt();

        while (true) {
            try {
                if (customers.containsKey(customerNo) && customers.get(customerNo) == pwd) {
                    System.out.println("Customer number and password matched");
                    customerNoInTheBank = customerNo;
                    moneyInTheBankAccount = bankAccount.get(customerNo);
                    showTheMenu();
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Customer number and password didn't match");
                System.out.println("Please again enter your customer number and password");
                customerNo = scan.nextInt();
                pwd = scan.nextInt();

            }
        }

    }

    public static void showTheMenu(){

        System.out.println("1. withdraw the money\n" +
                           "2. load the money\n" +
                           "3. show the money\n" +
                           "4. exit");
        int keyPressed = scan.nextInt();
        if(keyPressed==4){
            exit();
        } else if(keyPressed==3){
            showTheMoney();
        } else if(keyPressed==2){
            loadTheMoney();
        } else if(keyPressed==1){
            withdrawTheMoney();
        } else {
            System.out.println("You didn't make a valid keying, please try again");
            showTheMenu();
        }

    }

    public static void exit(){

        customerNoInTheBank = 0;
        moneyInTheBankAccount = 0;
        checkCustomerNoAndPwd();

    }

    public static void showTheMoney(){

        System.out.println("The total balance in your account: " + moneyInTheBankAccount);
        System.out.println("What do you want to do with your account\n" +
                           "1. withdraw the money\n" +
                           "2. load the money\n" +
                           "3. exit");
        int keyPressed = scan.nextInt();
        if(keyPressed==3){
            exit();
        } else if(keyPressed==2){
            loadTheMoney();
        } else if(keyPressed==1){
            withdrawTheMoney();
        } else {
            System.out.println("You didn't make a valid keying, please try again");
            showTheMoney();
        }

    }

    public static void loadTheMoney(){

        System.out.println("The total balance in your account: " + moneyInTheBankAccount);
        System.out.println("How much money do you want to load into your account?");
        float moneyLoading = scan.nextFloat();
        moneyInTheBankAccount += moneyLoading;
        System.out.println("Your transaction has been completed successfully\n" +
                           "The total balance in your account: " + moneyInTheBankAccount);
        System.out.println("Is there anything you want to do?\n" + "Yes or No");
        String option = scan.next();
        if(option.equalsIgnoreCase("yes")){
            showTheMenu();
        } else if(option.equalsIgnoreCase("no")){
            exit();
        }

    }

    public static void withdrawTheMoney(){

        System.out.println("The total balance in your account: " + moneyInTheBankAccount);
        System.out.println("Enter the amount of money you want to withdraw");
        float moneyWithdrawing = scan.nextFloat();
        if (moneyWithdrawing>moneyInTheBankAccount){
            System.out.println("Insufficient balance");
            System.out.println("Is there anything you want to do?\n" + "Yes or No");
            String option = scan.next();
            if(option.equalsIgnoreCase("yes")){
                showTheMenu();
            } else if(option.equalsIgnoreCase("no")){
                exit();
            }
        } else {
            moneyInTheBankAccount -= moneyWithdrawing;
            System.out.println("Your transaction has been completed successfully\n" +
                               "The total balance in your account: " + moneyInTheBankAccount);
            System.out.println("Is there anything you want to do?\n" + "Yes or No");
            String option = scan.next();
            if(option.equalsIgnoreCase("yes")){
                showTheMenu();
            } else if(option.equalsIgnoreCase("no")){
                exit();
            }
        }

    }



}








