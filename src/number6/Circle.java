package number6;

public class Circle implements Figure {
    private final double radius;



    private double radius() {
        return 0;
    }


    public Circle( double radius) {
        this.radius = radius;
    }

        public double area() {
            return Math.PI * radius() * radius();
        }
    }

