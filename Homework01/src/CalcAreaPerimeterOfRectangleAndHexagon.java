import java.util.Scanner;

public class CalcAreaPerimeterOfRectangleAndHexagon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double hex = input.nextDouble();
        System.out.print("Input the length of the width of the rectangle: ");
        double l = input.nextDouble();
        System.out.print("Input the length of the length of the rectangle: ");
        double h = input.nextDouble();
        System.out.print("The area of the hexagon is: " + hexagonArea(hex) + "\n");
        System.out.print("The perimeter of the hexagon is: " + hexagonPerimeter(hex) + "\n");
        System.out.print("The area of the rectangle is: " + rectangleArea(h, l) + "\n");
        System.out.print("The perimeter of the rectangle is: " + rectanglePerimeter(h, l) + "\n");
    }

    public static double hexagonArea(double hex) {
        return (6 * (hex * hex)) / (4 * Math.tan(Math.PI / 6));
    }

    public static double hexagonPerimeter(double hex) {
        return (hex * 6);
    }

    public static double rectangleArea(double h, double l) {
        return (l * h);
    }

    public static double rectanglePerimeter(double h, double l) {
        return (2 * (l + h));
    }
}
