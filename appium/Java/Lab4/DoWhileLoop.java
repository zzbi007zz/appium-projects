package Java.Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean isContinuing = true;
        int[] myArrList = {12,90,24,89,23,7,1,10};

        while(isContinuing) {
            menuOption();
           int userOpt=getUserOption();

           switch (userOpt) {
               case 1:
                   System.out.println("1");
                   addNumbtoArray();
                   isContinuing=false;
                   break;
               case 2:
                   System.out.println("2");
                   isContinuing=false;
                   break;
               case 3:
                   System.out.println("3");
                   isContinuing=false;
                   break;
               case 4:
                   System.out.println("4");
                   isContinuing=false;
                   break;
           }

        }



    }

    private static int getUserOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option: ");
        int userOption = sc.nextInt();
        return userOption;
    }

    public static void menuOption() {
        System.out.println("=====MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
    }


}
