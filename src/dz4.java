public class dz4 {
    // задание 1

    public static void task1 () {
        int number = 1;
        while (number <= 50) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
    // задание 2

    public static void task2() {
        int number = 1;
        int count = 0;

        do {
            if (number % 7 == 0) {
                count++;
            }
            number++;
        } while (number <= 100);

        System.out.println("Числа, делящияся на 7 " + count);
    }
    // задание 3

    public static void task3() {
        int number = 1;
        int sum = 0;

        while (number <= 100) {
            sum += number;
            number++;
        }

        System.out.println("Сумма чисел от 1 до 100 " + sum);
    }
    // задание 4

    public static void task4() {
        int count = 0;
        int number;

        do {
            number = (int) (Math.random() * 20) + 1;
            System.out.println("Сгенерировано число " + number);
            count++;
        } while (number != 15);

        System.out.println("Количество чисел " + count);
    }
}