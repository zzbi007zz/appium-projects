package Java.lab2.ex1;

import java.util.Scanner;

public class BMICalculate {

    public static void main(String[] args) {
        //BMI = weight / (height*2)

        Scanner usrInput = new Scanner(System.in);
        System.out.println("Please input weight (kg): ");
        double weightValue = usrInput.nextDouble();

        System.out.println("Please input height (meter):");
        double heightValue =usrInput.nextDouble();

        double result = weightValue / (heightValue * heightValue);
        if(result <18.5){
            System.out.println("Underweight");
            System.out.println("You should eat more to gain weight.Good luck");
        } else if (result >= 18.5 && result <= 24.9) {
            System.out.println("Normal weight");
            System.out.println("Congratulation! Continue with your plan, don't forget to do exercise everyday");
        } else if (result>= 25 && result <=29.9) {
            System.out.println("Overweight");
            System.out.println("Warning!!!! Stop eating sugar food, change your habit and do more exercise.");
        }
        else {
            System.out.println("Obesity");
            System.out.println(".................-----> Diet or Die................");
          ;
        }
    }
}
