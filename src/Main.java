public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Заание №1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание №2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание №3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание №4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание №5");

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println(" ");
        System.out.println("Задание №6");

        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задание №7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Задача №8");

        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println(" ");
        System.out.println("Задача 9");

        int Salary = 29000;
        double Total = 0;
        for (int i = 0; i < 12; i++) {
            Total = Total + (Total * 0.01);
            Total = Total + Salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Total + " рублей");
        }

        System.out.println(" ");
        System.out.println("Задание №10");

        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }

        System.out.println();
        System.out.println("Часть 2");
        System.out.println("Задача №1");
        int contribution = 15000;
        int totalSalary = 0;
        int month = 0;
        while (totalSalary <= 2459000) {
            totalSalary = totalSalary + contribution;
            month += 1  ;
            System.out.println("Месяц " + month + " накоплений равна " + totalSalary + " рублей");
        }
        System.out.println(" ");
        System.out.println("Задача №2");

        int j = 0;
        while (j < 10) {
            System.out.print(j = j + 1);
            System.out.print(" ");
        }
        System.out.println();

        for (int k = 10; k > 0; k = k - 1) {
            System.out.print(k);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задача №3");

        int population = 12_000_000;
        int year = 1;
        for (int i = 1; i <= 10; i++) {
            int birthRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;
            year += 1;
            population = population + birthRate - deathRate;
            System.out.println("Год " + year + ", численость населения составляет " + population);
        }


        System.out.println();
        System.out.println("Задание №4");

        double money = 15000;
        int monthe = 0;
        while (money < 12_000_000) {
            monthe += 1;
            money = money + money * 0.07;
            System.out.println("Месяц " + monthe + ", сумма накоплений равна " + money);
        }

        System.out.println();
        System.out.println("Задание №5");

        money = 15000;
        int cycle = 6; // переменная для выведения нужных месяцев
        for (int i = 0; money < 12_000_000; i++) {
            money = money + money * 0.07;
            if (i % cycle == 0) {
                System.out.println("Сумма " + money + ", количество месяцев " + i);
            }
        }

        System.out.println();
        System.out.println("Задание №6");

        money = 15000;
        int period = 6;
        int years = 9;
        int allMonth = years * 12;
        for (int i = 0; i <= allMonth; i++) {
            money = money + money * 0.07;
            if (i % period == 0) {
                System.out.println("Сумма " + money + " , количество месяцев " + i);
            }
        }

        System.out.println();
        System.out.println("Задача №7");

        int friday = 5;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число, необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println();
        System.out.println("Задача №8");

        int currentYear = 2023;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }
        }

    }


}
