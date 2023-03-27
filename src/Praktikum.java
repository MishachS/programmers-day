import java.util.Scanner;
public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09." + year + "."); // если год високосный
        }
        else {
            System.out.println("13.09." + year + "."); // если год не високосный
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return false; // не високосный год
        }
        else {
            if (year % 4 == 0) {
                return true; // високосный год
            }
            else {
                return false; // не високосный год
            }
        }
    }
}
