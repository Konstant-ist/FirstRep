package Exception;


public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        String[][] array = {{"1", "2", "3", "4"},
                            {"5", "6", "7", "8"},
                            {"9", "2", "3", "4"},
                            {"5", "6", "7", "8"},
                {"5", "6", "7", "8"}
        };
        try {
            int result = calculator.doCalc(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (ArraySizeExeption | ArrayDataExeption e) {
            System.out.println("Ошибка:" + e.getMessage());
        }
    }
}

