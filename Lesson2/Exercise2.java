package Lesson2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int Thu;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thu trong tuan");
        Thu = scanner.nextInt();
        
        if (Thu == 2) {
            System.out.println("Th2: Hoc Java");
        }
        else if (Thu == 3) {
            System.out.println("Th3: Hoc PHP");
        }
        else if (Thu == 4) {
            System.out.println(" Thu 4: Hoc He quan tri co so du lieu");
        }
        else if (Thu == 5) {
            System.out.println("Thu 5: Hoc Lap trinh huong doi tuong");
        }
        else if (Thu == 6) {
            System.out.println("Thu 6: Hoc Tieng Anh");
        }
        else if (Thu == 7) {
            System.out.println("Thu7: Hoc Lap trinh huong doi tuong");
        }
        else if (Thu == 8) {
            System.out.println("Chu nhat: Nghi");
        }
        else {
            System.out.println("Ngay khong hop le. Vui long nhap lai!");
        }

        scanner.close();
    }
}
