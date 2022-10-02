import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год : ");
        int year = in.nextInt();
        checkWhetherTheYearLeap(year);

        System.out.print("Введите тип операционной системы : ");
        int type = in.nextInt();
        System.out.print("Введите год выпуска устройства : ");
        int yearPublication = in.nextInt();
        phoneVersionDetection(type, yearPublication);

        System.out.print("Введите дистанцию в (км) : ");
        int distance = in.nextInt();
        dayDelivery(distance);
        in.close();
    }
    public static int checkWhetherTheYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " — високосный год.");
        }
        else {
            System.out.println(year + " — не високосный год.");
        }
        return year;
    }

    public static int phoneVersionDetection(int clientOS, int clientDeviceYear ){
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        return clientOS;
    }
    public static int dayDelivery(int deliveryDistance) {
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
