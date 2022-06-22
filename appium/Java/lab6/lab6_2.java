package Java.lab6;

import java.util.Scanner;

public class lab6_2 {

    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner usrInput = new Scanner(System.in);
        String usrPwd;
        int count = 0;
        while (count<3) {
            System.out.println("Please input password");
            usrPwd = usrInput.nextLine();
            if (usrPwd.equals(myPassword)) {
                System.out.println("Correct");
            } else {
                count++;
            }
        }
    }
}
