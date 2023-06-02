package projects.customerproject;

import java.util.HashMap;
import static projects.customerproject.Customer.scan;

public class CustomerRunner {

    /*
      1. Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
         Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin
      2. saveInfo() method olusturun:
         Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
         Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
         Ayni kimlik numarasi ile bilgi girilmesine engel olun.
      3. getInfo() method olusturun:
         Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
         Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
      4. removeInfo() method olusturun:
         Kimlik numarasini girerek data silin.
         Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
         Collection bos ise kullaniciya hata mesaji verin.
      5. selectOption() method olusturun:
         Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
    */

    static HashMap<String, Customer> customers = new HashMap<>();

    public static void main(String[] args) {

        selectOption();

    }

    public static void saveInformation() {

        try {
            System.out.println("Enter the identity number with 4 digit");
            String idNumber = scan.next();
            scan.nextLine(); // Bunu yazmazsan eger bir alt satira gecmiyor bu yuzden benim alt satirda yazdigim full name i okuyamadigi icin full name e null veriyor.
            if (!customers.containsKey(idNumber)) {
                System.out.println("Enter the full name");
                String fullName = scan.nextLine();
                System.out.println("Enter the address");
                String address = scan.nextLine();
                System.out.println("Enter the phone number");
                String phoneNumber = scan.nextLine();
                customers.put(idNumber, new Customer(fullName, address, phoneNumber));
                System.out.println("The current state of the list is as follows:\n" + customers);
                choice();
            } else {
                throw new Exception("You can not enter the id you added before, please try again");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            saveInformation();
        }

    }

    public static void choice(){

        while (true) {
            System.out.println("Do you want to keep adding the data\n" +
                               "Yes or No");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("yes")) {
                saveInformation();
                break;
            } else if (choice.equalsIgnoreCase("no")) {
                selectOption();
                break;
            } else {
                System.out.println("What you meant is not understood");
                scan.nextLine();
            }
        }

    }

    public static void selectOption(){

        System.out.println("What do you want to do with the program?\n" +
                           "Press 1 to enter the data\n" +
                           "Press 2 to get the data\n" +
                           "Press 3 to remove the data\n" +
                           "Press 4 to exit");
        int choice = scan.nextInt();
        if(choice==1){
            saveInformation();
        } else if(choice==2){
            getInformation();
        } else if(choice==3){
            removeInformation();
        } else if(choice==4){
            exit();
        }else {
            System.out.println("You did the wrong keying, please try again");
            selectOption();
        }

    }

    public static void getInformation(){

        try {
            System.out.println("Enter the id number of the data you want to get");
            String choice = scan.next();
            try{
                if(customers.isEmpty()){
                    throw new Exception("You have not entered any data before, you should first add the data before getting");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
                selectOption();
            }
            if (!customers.containsKey(choice)) {
                throw new Exception("The id number you entered does not exist, please try again");
            } else {
                System.out.println(customers.get(choice));
                selectOption();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            getInformation();
        }

    }

    public static void removeInformation(){

        try {
            System.out.println("Enter the id number of the data you want to remove");
            String choice = scan.next();
            try{
                if(customers.isEmpty()){
                    throw new Exception("You have not entered any data before, you should first add the data before removing");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
                selectOption();
            }
            if (!customers.containsKey(choice)) {
                throw new Exception("The id number you entered does not exist, please try again");
            } else {
                customers.remove(choice);
                System.out.println("The current state of the list is as follows:\n" + customers);
                selectOption();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            removeInformation();
        }

    }

    public static void exit(){
        System.out.println("Have a nice day..");
    }





}
