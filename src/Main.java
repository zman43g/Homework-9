//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int moneyInBank = 0;
        int monthlyIncome = 15000;
        int month = 0;
        do {
            month = month + 1;
            moneyInBank = monthlyIncome + moneyInBank;
            System.out.println("Месяц " + month + " сумма накоплений равна " + moneyInBank + " рублей");
        } while (moneyInBank<=2459000);
    }
}
