package Java.lab6;

import java.util.Scanner;

public class lab6_2 {

    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner usrInput = new Scanner(System.in);
        String usrPwd;
        do {
            System.out.println("Please inut password");
            usrPwd = usrInput.nextLine();
        } while (!usrPwd.equals(myPassword));

        System.out.println("Correct!");

    }
}
