package Java.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoWhileLoop {
    static List<Integer> myArrList = new ArrayList<>();

    public static void main(String[] args) {
        boolean isContinuing = true;
        generateArrayList();

        while (isContinuing) {
            printMenuOption();
            int userOpt = getUserOption();
            switch (userOpt) {
                case 1:
                    addItemtoArray();
                    break;
                case 2:
                    getArrayList();
                    break;
                case 3:
                    getMinAndMaxNumber();
                    break;
                case 4:
                    getMinAndMaxNumber();
                    break;
                case 5:
                    exitProgram();
                    isContinuing=false;
                    break;
            }
        }
    }
    public static void getMinAndMaxNumber() {
        int maxNumber = myArrList.get(0);
        int minNumber = myArrList.get(0);
        for (int i = 1; i < myArrList.size(); i++) {
            if (myArrList.get(i) > maxNumber) {
                maxNumber = myArrList.get(i);
            } else if (myArrList.get(i) < minNumber) {
                minNumber = myArrList.get(i);
            }
        }
        System.out.println("Minimum: " + minNumber);
        System.out.println("Maximum: " + maxNumber);
    }

    public static List<Integer> addItemtoArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an number to add to arraylist");
        int usrInput = scanner.nextInt();
        myArrList.add(usrInput);
        return myArrList;
    }

    public static List<Integer> generateArrayList() {
        for (int i = 0; i < 10; i++) {
            myArrList.add(i);
        }
        return myArrList;

    }

    public static List<Integer> getArrayList() {
        for (int idx = 0; idx < myArrList.size(); idx++) {
            System.out.println(myArrList.get(idx));
        }
        return myArrList;

    }

    private static int getUserOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an option ");
        int userOption = sc.nextInt();
        return userOption;
    }
    public static void exitProgram(){
        System.out.println("Exiting...");

    }

    public static void printMenuOption() {
        System.out.println("=====MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Exit");
    }


}
