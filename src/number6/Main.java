package number6;

public class Main {
    private static Figure[] figure;

    public static void main(String[] args) {
        String Figure[] = {new Circle(5).toString(),
                new Triangle(4, 3).toString(),
                new Square(6).toString()};


        double totalArea = FigureCalculator.AllArea(figure);
        System.out.println("Суммарная площадь фигур :"+ totalArea);
            }
        }


