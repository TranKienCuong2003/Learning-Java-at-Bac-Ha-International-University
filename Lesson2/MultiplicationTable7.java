package Lesson2;

public class MultiplicationTable7 {
    public static void main(String[] args) {
        int number = 7;
        int i = 1;

        System.out.println("Multiplication Table of 7");
        System.out.println(">> ------------------- <<");
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}
