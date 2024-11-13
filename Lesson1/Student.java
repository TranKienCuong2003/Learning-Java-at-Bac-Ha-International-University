package Lesson1;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String fullName;
        int birthYear;
        float averageScore;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho ten sinh vien: ");
        fullName = scanner.nextLine();

        System.out.print("Nhap nam sinh cua sinh vien: ");
        birthYear = scanner.nextInt();

        System.out.print("Nhap diem trung binh cua sinh vien: ");
        averageScore = scanner.nextFloat();

        System.out.println("\nThong tin sinh vien:");
        System.out.println("Ho ten: " + fullName);
        System.out.println("Nam sinh: " + birthYear);
        System.out.println("Diem trung binh: " + averageScore);

        scanner.close();
    }
}
