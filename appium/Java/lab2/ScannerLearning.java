package Java.lab2;

import java.util.Scanner;

public class ScannerLearning {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please input a number: ");
        int inputNumb = scanner.nextInt();
        System.out.printf("Your input number is: %d", inputNumb);
    }
}
