package Lesson2;

import java.util.Scanner;

public class MonthDaysChecker {
    public static void main(String[] args) {
        int month;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        month = scanner.nextInt();

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Thang co 31 ngay!");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Thang co 30 ngay!");
        }
        else if (month == 2) {
            System.out.println("Thang co 28 hoac 29 ngay!");
        }
        else {
            System.out.println("Thang khong hop le!");
        }

        scanner.close();
    }
}
