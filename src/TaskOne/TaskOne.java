package TaskOne;

import java.util.Scanner;

public class TaskOne {
    public static int CheckWhetherTheYearLeap(int years) {
        int year = years;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " — високосный год.");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " — високосный год.");
        } else {
            System.out.println(year + " — не високосный год.");
        }
        return year;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год : ");
        int year = in.nextInt();
        CheckWhetherTheYearLeap(year);
    }
}
