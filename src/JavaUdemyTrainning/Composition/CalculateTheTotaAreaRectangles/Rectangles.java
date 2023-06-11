package JavaUdemyTrainning.Composition.CalculateTheTotaAreaRectangles;

public class Rectangles {

    private final int _height;
    private final int  _width;

    public Rectangles(int height, int width){
        this._height = height;
        this._width = width;
    }

    public int get_height() {
        return _height;
    }

    public int get_width() {
        return _width;
    }
}
