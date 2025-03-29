import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        array1();
        array2();
        array6();


    }

    public static void array1(){
        int[] array1=new int[5];
        System.out.println(array1);

        for (int i=0;i<array1.length;i++){
            if (array1[i]==0)
                array1[i]=1;
        }
        System.out.println(Arrays.toString(array1));
    }


    public static void array2() {
        int[] array1 = new int[100];
        System.out.println(array1);

        for (int i = 0; i < array1.length; i++) {
            array1[i]=i+1;
        }
        System.out.println(Arrays.toString(array1));
    }



        public static void array6 () {
            int[] values = new int[10];
            Random random = new Random();
            for (int i = 0; i < values.length; i++) {
                values[i] = random.nextInt(10);

            }
            System.out.println(Arrays.toString(values));
            Arrays.sort(values);
            System.out.println(Arrays.toString(values));


            int min = values[0];
            int max = values[0];
            for (int i = 0; i < values.length; i++) {

                if (values[i] < min) {
                    min = values[i];
                }
                if (values[i] > max) {
                    max = values[i];
                }
                System.out.println("min " + min);
                System.out.println("max " + max);
                System.out.println(Arrays.toString(values));
            }


        }
    }



//
