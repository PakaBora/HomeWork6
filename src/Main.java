import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ///задание 1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите какую ОС используете, если IOS-0, если Android-1");
        int OS = in.nextInt();
        if (OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некоректно введены данные  ОС, поробуйте еще раз");
        }
        ///задание 2
        Scanner ini = new Scanner(System.in);
        System.out.println("Введите какую ОС используете, если IOS-0, если Android-1");
        int OsM = ini.nextInt();
        System.out.println("Введите год производства телефона в формате YYYY");
        int prodYear = ini.nextInt();
        if (OsM == 0 && prodYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OsM == 0 && prodYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (OsM == 1 && prodYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (OsM == 1 && prodYear >= 2015) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }
        if (OsM != 0 && OsM != 1) {
            System.out.println("Некоректно введены данные ОС, поробуйте еще раз");
        }
        ///задание 3
        Scanner year = new Scanner(System.in);
        System.out.println("Введите год, который требует проверки на високосность");
        int yearCheck = year.nextInt();
        boolean yearCheckUp = ((yearCheck % 4 == 0) && (yearCheck % 100 != 0) || (yearCheck % 400 == 0));
        if (yearCheckUp) {
            System.out.println(yearCheck + " Год является високосным");
        } else {
            System.out.println(yearCheck + " Год не является високосным");
        }
        ///Задание 4
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки занимает 1 день");
        }
        if (deliveryDistance > 20 ) {
            deliveryTime++;
        }
        if (deliveryDistance > 60){
            deliveryTime++;
        }
            System.out.println("Доставка потребует : " + deliveryTime + " Дня");

        ///Задание 5
        int monthNumber=5;
        switch(monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный месяц:" + monthNumber);
        }




        }

    }