public class HomeWorkAppLessonOne {
    public static void main(String[] args){

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords(){

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign(){

        int a = 10;
        int b = 15;
        int valueCheck = a + b;
//        System.out.println(ab);

        if(valueCheck >= 0){
            System.out.println("Сумма положительная");
        }
        else {

            System.out.println("Сумма отрицательная");

        }

    }

    public static void printColor(){

        int fistValue = 70;
        int secondValue = 85;
        int value = fistValue + secondValue + fistValue - secondValue + fistValue / secondValue;
//        System.out.println(value);


        if(value < 0){

            System.out.println("Красный");

        }
        else if (value <= 100){

            System.out.println("Желтый");

        }

        else if (value > 100){

            System.out.println("Зеленый");

        }

    }

    public static void compareNumbers(){

        int a = 2558;
        int b = 6589;

        if(a >= b){
            System.out.println("a >= b");
        }
        else {

            System.out.println("a < b");

        }

    }
}
