package JavaUdemyTrainning.Composition.CalculateTheTotaAreaRectangles;

import java.util.Arrays;
import java.util.List;

public class RectanglesRun {

    public static void main(String[] args) {
        List<Rectangles> rectanglesList =  Arrays.asList(
                new Rectangles(4,5),
                new Rectangles(3,2),
                new Rectangles(6,2)
        );

        Calculation calculation = new Calculation(rectanglesList);

        int totalAreaOfRectangles = calculation.calculateTotalArea();
        System.out.println(totalAreaOfRectangles);
    }

}
