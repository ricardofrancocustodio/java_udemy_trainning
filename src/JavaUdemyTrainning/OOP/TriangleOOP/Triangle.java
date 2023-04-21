package JavaUdemyTrainning.OOP.TriangleOOP;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public String largerArea(double a, double b){
        return (a > b) ? "Larger area: X" : "Larger area: Y";

    }
}
