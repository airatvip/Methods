public class Main {
    public static void main(String[] args) {
        int year = 2020;
        int clientDeviceYear = 2014;
        int clientOS = 0;
        int deliveryDistance = 95;

        printYear(year);
        installationApp(clientDeviceYear, clientOS);
        System.out.println("Потребуетя дней: " + deliveryTime(deliveryDistance));

    }


    public static void printYear(int year) {
        if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является високосным ");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год не является високосным ");
        }
    }

    public static void installationApp(int clientDeviceYear, int clientOS) {


        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
    }

    public static int deliveryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            return deliveryTime;
        } else {
            deliveryTime = ((deliveryDistance - 20) / 40) * deliveryTime + 2;
            return deliveryTime;
        }

    }


}

