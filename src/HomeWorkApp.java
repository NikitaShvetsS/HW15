public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        System.out.println("----------");
        checkSumSign();
        System.out.println("----------");
        printColor();
        System.out.println("----------");
        compareNumbers();
        System.out.println("----------");

        int a = 15;
        int b = 25;
        boolean sumInRange = sumInRange(a, b);
        System.out.println("Is sum in range: " + sumInRange);

        System.out.println("----------");

        int number = -10;
        positiveOrNegative(number);

        System.out.println("----------");

        int negativeNumber = -5;
        boolean isNegative = isNegative(negativeNumber);
        System.out.println("Is negative: " + isNegative);

        System.out.println("----------");

        String str = "Text";
        int num = 3;
        printLines(str, num);

        System.out.println("----------");

        int year = 2024;
        boolean isLeapYear = isLeapYear(year);
        System.out.println("Is leap year: " + isLeapYear);

    }



    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }
    public static void printColor(){
        int value = 100;

        if (value <= 0){
            System.out.println("Red");
        }else if (value <= 100){
            System.out.println("Yellow");
        }else {
            System.out.println("Green");
        }
    }
    public static void compareNumbers(){
        int a = 34;
        int b = 44;

        if (a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
    public static boolean sumInRange(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void positiveOrNegative(int num){
        if(num >= 0){
            System.out.println("Positive number");
        }else {
            System.out.println("Negative number");
        }
    }
    public static boolean isNegative(int num){
        return num < 0;
    }

    public static void printLines(String str, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
