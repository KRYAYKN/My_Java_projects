package projects.budget;

public class BudgetRunner {

    public static void main(String[] args) {

        Budget father = new Budget();
        father.getSalary(5000);
        System.out.println(Budget.budget); // 5000.0
        father.getPocketMoney(1000);
        System.out.println(father.pocketMoney); // 1000
        father.spendFromPocketMoney(500);
        System.out.println(father.pocketMoney); // 500

        Budget mother = new Budget();
        mother.getSalary(10000);
        System.out.println(Budget.budget); // 14000.0
        mother.getPocketMoney(4000);
        System.out.println(Budget.budget); // 10000
        mother.spendFromPocketMoney(2000);
        System.out.println(mother.pocketMoney); // 2000



    }
}
