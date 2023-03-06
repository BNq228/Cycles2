public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int monthAmounts = 15_000;
        int sum = 0;
        int month = 1;
        while (sum < 2_459_000) {
            sum += monthAmounts;
            System.out.printf("Месяц %s, сумма накоплений равна %d рублей", month,sum);
            System.out.println();
            month++;
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while(i <10) {
            System.out.print(++i + " ");
        }
        System.out.println();
        for (int j = 10; j > 0 ; j--) {
            System.out.print(j + " ");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            population = population + (population * 17 / 1000) - (population * 8 / 1000);
            System.out.printf("Год %d, численность населения %d\n", year, population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        double sum = 15_000;
        int month = 1;
        while (sum < 12_000_000) {
            sum = sum + sum * 0.07;
            System.out.println("Месяц " + month + ", сумма = " + sum);
            month++;
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        double sum = 15_000;
        int month = 1;
        while (sum < 12_000_000) {
            sum = sum + sum * 0.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма = " + sum);
            }
            month++;
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        double sum = 15_000;
        int month = 1;
        while (month <= 9 * 12) {
            sum = sum + sum * 0.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма = " + sum);
            }
            month++;
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число.Необходимо подготовить отчет");
            friday += 7;
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int start = 2023 - 200;
        int end = 2023 + 100;
        for (int year = start; year <= end ; year++) {
            if (year % 79 == 0){
                System.out.println(year);
            }
        }
    }
}