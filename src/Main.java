import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        array3();
        array6();

    }

    public static void array3() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
            System.out.println(Arrays.toString(arr));
            }
        System.out.println(Arrays.toString(arr));
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




