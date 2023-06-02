package projects.budget;

public class Budget {

    public static double budget;
    public double pocketMoney;

    public void getSalary(double salaryToBeReceived){
        budget += salaryToBeReceived;
    }

    public void getPocketMoney(double pocketMoneyToBeReceived){
        budget -= pocketMoneyToBeReceived;
        pocketMoney += pocketMoneyToBeReceived;
    }

    public void spendFromBudget(double spendMoneyToBeReceived){
        budget -= spendMoneyToBeReceived;
    }

    public void spendFromPocketMoney(double spendMoneyToBeReceived){
        pocketMoney -= spendMoneyToBeReceived;
    }



}
