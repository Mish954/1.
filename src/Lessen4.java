import java.util.Scanner;

public class Lessen4 {
    public static void section1() {
        int number = 1;
        while (number <= 20) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }

    public static void section2() {
        int number;
        do {
            number = (int) (Math.random() * 101);
            System.out.println("Случайное число: " + number);
        } while (number <= 100);
        System.out.println("Число больше 100: " + number);

    }

    public static void section3() {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100);
        int inputNumber;

        System.out.println("Угадайте число от 0 до 99");

        while (true) {
            System.out.print("Введите число: ");
            inputNumber = scanner.nextInt();
            if (inputNumber > secretNumber) {
                System.out.println("Число слишком большое");
            }
            if (inputNumber < secretNumber) {
                System.out.println("Число слишком маленькое");
            } else {
                System.out.print("Ввидите число");

                inputNumber = scanner.nextInt();
                System.out.println("Вы выйграли " + secretNumber);
            }

            scanner.close();

        }

    }
}
