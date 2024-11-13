package Lesson2;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        int a;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap diem: ");
        a = scanner.nextInt();

        if (a >= 0 && a < 5) {
            System.out.println("Diem yeu");
        }
        else if (a >= 5 && a < 7) {
            System.out.println("Diem trung binh");
        }
        else if (a >= 7 && a < 9) {
            System.out.println("Diem kha");
        }
        else if (a >= 9 && a <= 10) {
            System.out.println("Diem gioi");
        }
        else {
            System.out.println("Khong phai la diem");
        }
        
        scanner.close();
    }
}
