package number6;

public class FigureCalculator {
    public static double AllArea(Figure[] figure) {
        double totalArea = 0;
        for (Figure figure1 : figure) {
            totalArea += figure1.area();
        }
        return totalArea;
    }
}
