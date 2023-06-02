package projects.manavproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Greengrocer02 {

    static List<String> productList = new ArrayList<>(Arrays.asList("banana", "apricot", "strawberry", "apple", "cherry"));
    static List<Double> productPrice = new ArrayList<>(Arrays.asList(10.0, 15.0, 5.0, 8.0, 20.0));
    static Scanner scan = new Scanner(System.in);
    static double totalPrice;


    public static void main(String[] args) {

        getTheProduct();


    }

    public static void getTheProduct(){

        System.out.println("Which product do you want to buy?\n" +
                           "Products: potatoes, cucumber, banana, apple, apricot");
        String productChoice = scan.next();
        if(!productList.contains(productChoice)){
            System.out.println("We don't have the product you want.");
            System.out.println("Is there anything you want?\nYes or No");
            String choice = scan.next();
            if(choice.equalsIgnoreCase("yes")){
                getTheProduct();
            } else if(choice.equalsIgnoreCase("no")){
                cashier();
            } else {
                System.out.println("I couldn't understand what you meant");
                getTheProduct();
            }
        } else {
            System.out.println("How many kilos do you want to buy?");
            double kilo = scan.nextDouble();
            totalPrice += productPrice.get(productList.indexOf(productChoice))*kilo;
            System.out.println("Is there anything you want?\nYes or No");
            String choice = scan.next();
            if(choice.equalsIgnoreCase("yes")){
                getTheProduct();
            }else if(choice.equalsIgnoreCase("no")){
                cashier();
            } else {
                System.out.println("I couldn't understand what you meant");
                getTheProduct();
            }

        }

    }

    public static void cashier(){

        System.out.println("The total price you have to pay is: " + totalPrice);
        totalPrice = 0;

    }





























}

