//задание 1


public class dz {
    public static void main() {
        int age = 10;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Возраст должен быть положительным числом.");
        }
    }
    //задание 2


    public static void main2() {
        int total = 102;
        int seated = 60;
        int standing = total - seated;

        int passengers = 50;

        if (passengers <= seated) {
            System.out.println("В вагоне есть сидячие места. " + passengers + ", свободных сидячих мест " + (seated - passengers));
        }
        if (passengers > seated && passengers <= total) {
            int freeStanding = total - passengers;
            System.out.println("Сидячих мест нет, но есть стоячие. " + passengers + ", свободных стоячих мест " + freeStanding);
        }
        if (passengers > total) {
            System.out.println("Мест нет");
        }
    }
//задание 3



    public static void main3() {
        int year = 2024;

        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
            return;
        }

        if ((year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    //задание 4


    public static void main(String[] args) {
        int monthNumber = 12;

        if (monthNumber > 12) {
            System.out.println("Ошибка");
        } else if (monthNumber < 1) {
            System.out.println("Ошибка");
        } else {
            if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
                System.out.println(monthNumber + " зима");
            } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
                System.out.println(monthNumber + " весна");
            } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
                System.out.println(monthNumber + " лето");
            } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
                System.out.println(monthNumber + " осень ");
            }
        }
    }
}