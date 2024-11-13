package Lesson2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int choice;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("=== Menu Chuong trinh ===");
            System.out.println("1. Thong tin ca nhan");
            System.out.println("2. Tinh tong hai so");
            System.out.println("3. Kiem tra so chan le");
            System.out.println("4. Thoat menu");
            System.out.print("Chon mot tuy chon (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hienThiThongTinCaNhan();
                    break;
                case 2:
                    tinhTongHaiSo(scanner);
                    break;
                case 3:
                    kiemTraChanLe(scanner);
                    break;
                case 4:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai tu 1 den 4");
            }
            System.out.println();

        } while (choice != 4);

        scanner.close();
    }

    public static void hienThiThongTinCaNhan() {
        System.out.println("Thong tin ca nhan:");
        System.out.println("Ho ten: Tran Kien Cuong");
        System.out.println("Nganh hoc: Cong nghe thong tin");
        System.out.println("Muc tieu: Tro thanh Front-end Developer");
    }

    public static void tinhTongHaiSo(Scanner scanner) {
        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Tong cua hai so la: " + sum);
    }

    public static void kiemTraChanLe(Scanner scanner) {
        System.out.print("Nhap mot so nguyen: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " la so chan.");
        } else {
            System.out.println(number + " la so le.");
        }
    }
}
