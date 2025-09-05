//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int moneyInBank = 0;
        int monthlyIncome = 15000;
        int month = 0;
        while (moneyInBank <= 2459000) {
            month = month + 1;
            moneyInBank = monthlyIncome + moneyInBank;
            System.out.println("Месяц " + month + " сумма накоплений равна " + moneyInBank + " рублей");
        }

        System.out.println("Задача 2");
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 1;
        while (year < 11) {
            population = ((birthRate - deathRate) * population / 1000) + population;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }

        System.out.println("Задача 4");
        int money = 15000;
        int interestRate = 7;
        month = 1;
        do {
            money = (money / 100) * interestRate + money;
            System.out.println("Месяц " + month + ", сумма на счёте составляет " + money);
            month++;
        } while (money <= 12000000);

        System.out.println("Задача 5");
        money = 15000;
        month = 1;
        do {
            money = (money / 100) * interestRate + money;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма на счёте составляет " + money);
            }
            month++;
        } while (money <= 12000000);

        System.out.println("Задача 6");
        money = 15000;
        month = 1;
        boolean halfYear;
        do {
            year = month / 12;
            money = (money / 100) * interestRate + money;
            if (month % 6 == 0) {
                halfYear = month % 12 == 0;
                if (halfYear) {
                    System.out.println("Через " + year + " лет, сумма на счёте составляет " + money);
                } else {
                    System.out.println("Через " + year + " c половиной лет, сумма на счёте составляет " + money);
                }
            }
            month++;
        } while (month <= 9 * 12);

        System.out.println("Задача 7");
        int FridayOfFirstWeek = 5;
        for (i = FridayOfFirstWeek; i < 32; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число.Необходимо подготовить отчет.");
        }

        System.out.println("Задача 8");
        for (i = 0; i < 2125; i += 79) {
        if (i>=1825) System.out.println(i);}

        /*short currentYear = 1825;
        while (currentYear <= 2125) {
            if (currentYear % 79 == 0) {
                System.out.println(currentYear);
            }
            currentYear++;
                */


    }
}
