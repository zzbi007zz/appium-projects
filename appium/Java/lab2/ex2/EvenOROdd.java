package Java.lab2.ex2;

import java.util.Scanner;

public class EvenOROdd {

    public static void main(String[] args) {
        final boolean MUST_INTEGER_VALUE = true;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Please input a number ");
        boolean isIntegerValue = userinput.hasNextInt() == MUST_INTEGER_VALUE;
        int checkNumb = userinput.nextInt();

        if (isIntegerValue) {
            if (checkNumb%2 == 0) {
                System.out.println("This is an Even number");
            } else {
                System.out.println("This is an Odd number");
            }
        } else {
            System.out.println("please input an integer value");
        }


    }
}
