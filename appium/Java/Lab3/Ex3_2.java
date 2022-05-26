package Java.Lab3;

public class Ex3_2 {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int maxNumber = intArr[0];
        int minNumber = intArr[0];
        
        for (int i = 1; i < intArr.length ; i++) {
            if (intArr[i] > maxNumber) {
                maxNumber = intArr[i];
            } else if (intArr[i] < minNumber) {
                minNumber = intArr[i];
            }
        }
        System.out.println("Minimum: " + minNumber);
        System.out.println("Maximum: " + maxNumber);
    }
}
