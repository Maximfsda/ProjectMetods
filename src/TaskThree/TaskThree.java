package TaskThree;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дистанцию в (км) : ");
        int distance = in.nextInt();
        dayDelivery(distance);
    }
    public static int dayDelivery(int distance) {
        int deliveryDistance = distance;
        int day = 0;
        int addingDays = 20;

        while (deliveryDistance > addingDays) {
            day += 1;
            addingDays += 40;
        }
        System.out.println("Потребуется дней: " + day);
        return day;
    }
}

