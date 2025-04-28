package Exception;

public class ArrayValueCalculator {

    public int doCalc(String[][] inputArray) throws ArraySizeExeption, ArrayDataExeption {
        if (inputArray.length != 4) {
            throw new ArraySizeExeption("Измените размер массива.Ожидается 4х4.");
        }
        for (String[] i:inputArray){
            if (i.length!=4){
                throw new ArraySizeExeption("Измените размер массива.Ожидается 4х4.");
            }
        }
        int sum = 0;

        for (int i=0;i<inputArray.length;i++){
            for (int j=0;j<inputArray[i].length;j++){

                try {
                    sum+=Integer.parseInt(inputArray[i][j]);
                }
                catch (NumberFormatException e){
                    throw new ArrayDataExeption("Не те данные в ячейке ["+i+"]["+j+"]:"+inputArray[i][j]);
                }
            }
        }
        return sum;
    }
}
