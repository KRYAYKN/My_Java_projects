package projects.manavproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Greengrocer01 {

    /*
      TASK :
             Basit bir 5 ürünlü manav alisveris programi yaziniz.
             1. Adim : Urun listesinden urun sectir ve kac kilo oldugunu sor.
             2. Adim : Baska bir urun almak isteyip istemedigini sor, istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                       Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
             3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
             4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
      Ipucu:
             Class icinde 3 method olacak
             * main() isimli bir method
             * musteriSecimi() isimli bir method
             * kasa() isimli bir method
    */

    static List<String> theListOfTheGreengrocer = new ArrayList<>(Arrays.asList("potatoes", "cucumber", "banana", "apple", "apricot"));
    static List<Double> thePriceOfProducts = new ArrayList<>(Arrays.asList(10.5, 15.0, 20.5, 14.5, 17.99));
    static double totalPrice = 0;
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        chooseProduct();

    }

    public static void chooseProduct(){

        while(true) {
            try {
                System.out.println("Please choose a product\n" +
                                   "Products: potatoes, cucumber, banana, apple, apricot");
                String product = scan.next();
                if(!theListOfTheGreengrocer.contains(product)){
                    throw new Exception();
                } else {
                    System.out.println("How many kilos of this product do you want to buy?");
                    double kilo = scan.nextDouble();
                    totalPrice += thePriceOfProducts.get(theListOfTheGreengrocer.indexOf(product)) * kilo;
                    System.out.println("Is there anything else do you want to buy?\n" +
                                       "Yes or No");
                    String choose = scan.next();
                    if (choose.equalsIgnoreCase("yes")) {
                        chooseProduct();
                        break;
                    } else if (choose.equalsIgnoreCase("no")) {
                        cashDesk();
                        break;
                    } else {
                        System.out.println("I couldn't understand what you meant");
                        chooseProduct();
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("We don't have this product");
                System.out.println("Is there anything else do you want to buy?\n" +
                                   "Yes or No");
                String choose = scan.next();
                if (choose.equalsIgnoreCase("yes")) {
                    chooseProduct();
                    break;
                } else if (choose.equalsIgnoreCase("no")) {
                    cashDesk();
                    break;
                } else {
                    System.out.println("I couldn't understand what you meant");
                    chooseProduct();
                    break;
                }
            }
        }


    }

    public static void cashDesk(){

        System.out.println("The total price which you have to pay is: " + totalPrice);
        totalPrice = 0;

    }





}
