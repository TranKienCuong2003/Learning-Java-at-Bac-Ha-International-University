package Lesson2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
    double Luong;
    double Thuong;
    double ThuNhap;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap Luong: ");
    Luong = scanner.nextDouble();

    System.out.println("Nhap Thuong: ");
    Thuong = scanner.nextDouble();

    ThuNhap = Luong + Thuong;

    if (ThuNhap > 30) {
      System.out.println("Thue thu nhap ca nhan la 30%");
    }
    else if (ThuNhap > 15) {
      System.out.println("Thue thu nhap ca nhan la 15%");
    }
    else if (ThuNhap > 9) {
      System.out.println("Thue thu nhap ca nhan la 10%");
    }
    else {
      System.out.println("Khong can phai dong thue thu nhap ca nhan");
    }

    scanner.close();
 }
}
