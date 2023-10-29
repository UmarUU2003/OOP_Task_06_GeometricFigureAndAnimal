package geometric;

public class Trapezium implements GeometricFigure{
    private double sideA;
    private double sideB;
    private double high;

    public Trapezium(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public double area() {
        return (sideA + sideB) / 2 * high;
    }

    @Override
    public double perimeter() {
        double medium = (sideA + sideB) / 2;
        double maxSide = Math.max(sideA, sideB);
        double difference = maxSide - medium;
        double sideC = Math.sqrt(high * high + difference * difference); // trapetsiyaning yon tomoni
        return sideC * 2 + sideA + sideB;
    }
}
