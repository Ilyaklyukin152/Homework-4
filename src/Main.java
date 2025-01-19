public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("\nЗадача 6");
        for (int i = 7; i < 100; i += 7) {
            System.out.printf(i + " ");
        }
        System.out.printf("\n");

        System.out.println("\nЗадача 7");
        for (int i = 1; i < 1000; i *= 2) {
            System.out.printf(i + " ");
        }
        System.out.printf("\n");

        System.out.println("\nЗадача 8");
        int total = 0;
        int deposit = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\nЗадача 9");
        total = 0;
        deposit = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            total = total + total / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\nЗадача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}