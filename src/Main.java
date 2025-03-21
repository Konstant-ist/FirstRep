public class Main {
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        method();
        method8();



    }

    //1
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");


    }

    //2
    public static void checkSumSign() {
        int a = 1;
        int b = 1;
        int c = 0;
        int sum = (a + b);
        if (sum >= c) {
            System.out.println("Сумма положительная");
        } else {
            if (sum < 0) {
                System.out.println("Сумма отрицательная");


            }
        }
    }

    //3
    public static void printColor() {
        int value = 0;

        if (value < 0) {
            System.out.println("Red");
        } else {
            if (value > 1 || value < 101) ;
            System.out.println("Yellow");
        }

        if (value > 101) {
            System.out.println("Green");
        }
    }

    //4
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            if (a < b) ;
            System.out.println("a<b");
        }
    }

    //5
    public static void method() {
        int a = 10;
        int b = 20;
        int sum = (a + b);

        if (sum >= 30) {
            System.out.println(true);
        } else {
            if (sum < 10) ;
            System.out.println(false);
        }
    }

    //6
    public boolean method1(int a, int b) {
        a = 0;
        b = 5;


        if (a < 0) {
            System.out.println(true);
        } else {
            if (a >= 0) ;
            System.out.println(false);
        }
        return false;
    }

    //7
    public boolean method2(int age) {
        age = -3;

        if (age < 0) {
            return true;


        }

        return false;
    }

    public static void method8() {
        String name = "Konstantin";
        int a=5;
        int i;
        for(i=0;i<a;i++){
            System.out.println(name);
        }

    }

}




//.



