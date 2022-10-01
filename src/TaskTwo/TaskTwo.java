package TaskTwo;
//import java.time.LocalDate;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите тип операционной системы : ");
        int type = in.nextInt();
        System.out.print("Введите год выпуска устройства : ");
        int year = in.nextInt();
        phoneVersionDetection(type, year);
//        int currentYear = LocalDate.now().getYear();
//        System.out.println(currentYear);
    }
    public static int phoneVersionDetection(int type, int year ){
        int clientOS = type;
        int clientDeviceYear = year;
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
}
