import java.util.Scanner;

public class CalculatRectangleArea {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width : ");
        width = sc.nextDouble();
        System.out.print("Enter the height : ");
        height = sc.nextDouble();

        area = width * height;

        System.out.print("The area of given rectangle is : " + area+ "cm²");

        sc.close();
    }
}
