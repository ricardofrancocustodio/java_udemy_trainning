package JavaUdemyTrainning.Composition.CalculateTheTotaAreaRectangles;

import java.util.ArrayList;
import java.util.List;

public class Calculation {

    List<Rectangles> _rectanglesList = new ArrayList<>();
    int _get_area = 0;
    int _total_area = 0;

    public Calculation(){}

    public Calculation(List<Rectangles> rectangles){
        this._rectanglesList = rectangles;
    }

    public int calculateTotalArea(){
        for(Rectangles rectangle : _rectanglesList){
            _get_area = rectangle.get_height() * rectangle.get_width();
            _total_area += _get_area;
        }

        return _total_area;
    }


}
