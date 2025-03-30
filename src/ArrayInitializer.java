public class ArrayInitializer {
    public static int[] initializeArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] result = initializeArray(5, 10);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
