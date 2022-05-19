package Lab2;

import java.util.Scanner;

public class MutipleIFElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int clientAge = scanner.nextInt();

        if(clientAge < 18)
        {
            System.out.println("No serve");
            if(clientAge<14){
                System.out.println("Calling 911.....");
            }
        } else if (clientAge <=55) {
            System.out.println("Unlimited");
        } else {
            System.out.println("2 bottles");
        }


    }
}
