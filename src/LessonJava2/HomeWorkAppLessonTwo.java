package LessonJava2;

public class HomeWorkAppLessonTwo {

    public static void main(String[] agrs) {

        System.out.println("Задание №1");
        System.out.println(valueCheckTotal(10, 5));
        System.out.println(valueCheckTotal(10, 56));
        System.out.println("Задание №2");
        oneInteger(80);
        System.out.println("Задание №3");
        System.out.println(integral(-10));
        System.out.println("Задание №4");
        stringInteger(" Строка");

//        System.out.println("Задание №5");
//      leapYear(2023); Так и не вышло доделать задание до конца.


    }

    public static boolean valueCheckTotal(int a, int b) {
        int total = a + b;
        if (total >= 10 && total <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void oneInteger(int s) {

        if (s >= 0) {
            System.out.println(s + " Число положительное");

        } else {
            System.out.println(s + " Число отрицательное");
        }

    }

    public static boolean integral(int x) {

        if (x < 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void stringInteger(String string) {

        for (int y = 0; y <= 10; y++) {
            System.out.println(y + string);
        }

    }

    public static void leapYear(int leap) {

        if (leap % 4 == 0) {
            System.out.println(leap + " Не високосный");
        } else if (leap % 100 == 0) {
            System.out.println(leap + " Не високосный");
        } else if (leap % 400 == 0) {
            System.out.println(leap + " Не високосный");
        } else {
            System.out.println(leap + " Високосный");
        }

    }
}
