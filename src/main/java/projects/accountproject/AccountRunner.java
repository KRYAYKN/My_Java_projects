package projects.accountproject;

public class AccountRunner {

    public static void main(String[] args) {

        /*
          1. Bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
          2. Bir constructor ekleyiniz.
          3. Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
          4. Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
          5. withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
          6. main metodunda  account oluşturarak ihtimalleri deneyiniz.
        */

        Account customer1 = new Account();
        System.out.println(Account.customerNo);
        customer1.depositMoney();
        customer1.withdrawMoney();

        Account customer2 = new Account();
        System.out.println(Account.customerNo);
        customer2.depositMoney();
        customer2.withdrawMoney();






    }
}
