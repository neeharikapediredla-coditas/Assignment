import java.util.Scanner;

public class One {

    public static int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month of the year: ");
        int month = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        int days = getDaysInMonth(month, year);
        if (days == -1) {
            System.out.println(" Invalid month entered...!!! ");
        } else {
            System.out.println("Correct Choice...!!\n" + days);
        }
    }
}
