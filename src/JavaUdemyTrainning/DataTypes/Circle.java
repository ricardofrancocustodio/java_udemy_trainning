package JavaUdemyTrainning.DataTypes;

public class Circle {
    private double _radius;

    public Circle(double radius){
        this._radius  = radius;
    }

    public double get_radius(){
        return _radius;
    }

    public void set_radius(double radius) {
        this._radius = radius;
    }

    public double getArea(){
        return 3.14 * (_radius * _radius);
    }

    public double getCircumference(){
        return (2 * 3.14) * _radius;
    }
}
