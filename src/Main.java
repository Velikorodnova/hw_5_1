public class Main {
    public static void main(String[] args) {
        System.out.println("task 1-1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("task 2-1");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("task 3-1");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("task 4-1");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("task 1-2");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("task 2-2");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("task 3-2");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("task 1-3");

        int contribution = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        System.out.println("task 2-3");
        int percent = 1;
        contribution = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + (contribution / 100 * percent) + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}