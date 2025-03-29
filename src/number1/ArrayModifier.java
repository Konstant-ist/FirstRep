package number1;

    public class ArrayModifier {
        public static int[] modifyArray(int[] arr) {
            main4();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) { arr[i] *= 2;
                }
            }
            return arr;
        }
        public static void main(String[] args) {
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int[] modifiedArray = modifyArray(array);
            for (int num : modifiedArray) {
                System.out.print(num + " ");
            }
        }


        public static void fillMainDiagonal(int[][] arr) {
            int size = arr.length;
            for (int i = 0; i < size; i++) {
                arr[i][i] = 1;
            }
        }

        public static void fillBothDiagonals(int[][] arr) {
            int size = arr.length;
            for (int i = 0; i < size; i++) {
                arr[i][i] = 1;
                arr[i][size - 1 - i] = 1;
            }
        }

        public static void printArray(int[][] arr) {
            for (int[] row : arr) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        public static void main4() {
            int size = 5;
            int[][] array = new int[size][size];

            System.out.println("Массив с заполненной главной диагональю:");
            fillMainDiagonal(array);
            printArray(array);

            System.out.println("\nМассив с заполненными обеими диагоналями:");
            array = new int[size][size]; // Обнуляем массив
            fillBothDiagonals(array);
            printArray(array);
        }

    }


