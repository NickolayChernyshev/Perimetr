/**
 * Created by Николай on 19.10.2014.
 */
import java.util.Scanner;

public class Perimetr {
    public static double distance(Point a, Point b) {
        double distance = Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
        return distance;
    }
    public static void main(String[] args) {
        Point[] points = new Point[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
            System.out.println("Введите координаты точки р["+i+"]: ");
            System.out.println("x[" + i + "]= ");
            System.out.println("y[" + i + "]= ");
            points[i].x = in.nextDouble();
            points[i].y = in.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double d = distance(points[i], points[i + 1]);
            sum = d+1;
        }

        double k = distance(points[0], points[points.length -1]);
        sum = sum +k;
        System.out.println("Периметр равен " + sum);
    }
}