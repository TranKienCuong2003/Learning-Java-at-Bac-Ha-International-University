package Lesson2;

import java.util.Scanner;

public class SquareRootCalculator {
     public static void main(String[] args) {
        int so;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so: ");
        so = scanner.nextInt();

        if (so > 0) {
            System.out.println("Can bac hai cua so do la: " + Math.sqrt(so));
        } else {
            System.out.println("So nhap vao khong phai la so duong.");
        }

        scanner.close();
    }
}
