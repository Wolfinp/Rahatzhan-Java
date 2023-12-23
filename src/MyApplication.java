import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Бахытжан\\IdeaProjects\\Rahatzhan Java\\src\\source.txt");

        Scanner sc = new Scanner(file);
        Shape Shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            Shape.addPoint(point);
        }

        System.out.println(Shape.calculatePerimeter());
        System.out.println(Shape.getLongestSide());
        System.out.println(Shape.getAverageSide());
    }
}