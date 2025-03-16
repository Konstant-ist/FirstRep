public class Main {
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        method();
        method1();
        method2();




    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");


    }

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
    public static void compareNumbers(){
        int a=1;
        int b=2;
        if(a>=b){
            System.out.println("a>=b");
        }
        else {
            if (a<b);
            System.out.println("a<b");
        }
    }
  public static void method(){
    int a=10;
    int b=20;
    int sum=(a+b);

    if(sum>=30){
        System.out.println(true);
    }
    else {
        if(sum<10);
        System.out.println(false);
    }
  }
  public static void method1(){
        int a=0;

        if(a<0){
            System.out.println(true);
        }
        else {
            if(a>=0);
            System.out.println(false);
        }
  }
  public static int method2(){
        int age=3;

        switch (age){

            case -1:
                System.out.println(true);
            break;

            default:
                System.out.println(false);



        }


      return age;
  }
    static int method3(){
        return method2();
  }
}



