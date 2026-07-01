import java.util.Scanner;

public class AreaCalculator {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        int side = sc.nextInt();

        System.out.println(calculateArea(radius));
        System.out.println(calculateArea(length, width));
        System.out.println(calculateArea(side));

        sc.close();
    }
}