package Lesson1;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double length = scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Chu vi cua hinh chu nhat: " + perimeter);
        System.out.println("Dien tich cua hinh chu nhat: " + area);

        scanner.close();
    }
}
