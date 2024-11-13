package Lesson2;

public class AverageOfMultiplesOfThree {
    public static void main(String[] args) {
        int sum = 0;    
        int count = 0;  
        int i = 27;

        while (i <= 250) {
            if (i % 3 == 0) { 
                sum += i;
                count++;
            }
            i++;
        }

        double average = (count > 0) ? (double) sum / count : 0;

        System.out.println("Trung binh cong cua cac so chia het cho 3 tu 27 den 250 la: " + average);
    }
}
