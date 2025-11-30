public class dz3 {
    //задание1
    public static void task() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    //задание2

    public static void task2() {
        for (int i = 0; i <= 21; i += 2) {
            System.out.println(i);
        }
    }
    //задание3

    public static void task3() {
        for (int i = 0; i <= 98; i += 7) {
            System.out.println(i);
        }
    }
    //задание4

    public static void task4() {
        int monthly = 12000;
        int savings = 0;

        for (int month = 1; month <= 12; month++) {
            savings += monthly;
            System.out.println("Месяц " + month + ", сумма накоплений  " + savings + " рублей");
        }
    }
}
