import java.util.*;
class Example41 {
    public static double calculatePerimeter(double rad) {
        return 2 * 3.14 * rad;
    }
    public static double calculatePerimeter(double len, double wid) {
        if (len == wid) {
            return 4 * len;
        } else {
            return (2 * (len + wid));
        }
    }
    public static double calculatePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- circle ---");
        System.out.print("Enter radius of the circle : ");
        double circleRadius = sc.nextDouble();
        double circleAns = calculatePerimeter(circleRadius);
        System.out.println("Circle perimeter : " + circleAns);
        System.out.println();

        System.out.println("--- Square ---");
        System.out.print("Enter length : ");
        double squareLen = sc.nextDouble();
        System.out.print("Enter width : ");
        double squareWid = sc.nextDouble();
        double squareAns = calculatePerimeter(squareLen, squareWid);
        if (squareLen == squareWid) {
            System.out.println("Square perimeter : " + squareAns);
        } else {
            System.out.println("Error: Length and width must be equal for a Square!");
        }
        System.out.println();
        
        System.out.println("--- Rectangle ---");
        System.out.print("Enter length : ");
        double rectLen = sc.nextDouble();
        System.out.print("Enter width : ");
        double rectWid = sc.nextDouble();
        double rectAns = calculatePerimeter(rectLen, rectWid);
        if (rectLen != rectWid) {
            System.out.println("Rectangle perimeter : " + rectAns);
        } else {
            System.out.println("Error: Length and width cannot be equal for a Rectangle!");
        }
        System.out.println();
        System.out.println("--- Triangle ---");
        System.out.print("Enter side 1 of the Triangle: ");
        double firstSide = sc.nextDouble();
        System.out.print("Enter side 2 of the Triangle: ");
        double secondSide = sc.nextDouble();
        System.out.print("Enter side 3 of the Triangle: ");
        double thirdSide = sc.nextDouble();
        double triangleAns = calculatePerimeter(firstSide, secondSide, thirdSide);
        System.out.println("Triangle perimeter : " + triangleAns);
    }
}
