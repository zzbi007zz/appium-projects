package Java.Lab3;

public class Ex3_1 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int countEven= 0;
        int countOdd =0 ;

        for (int i = 0; i < intArr.length ; i++) {
            if(intArr[i]%2 == 0) {
                countEven = countEven + 1;
            } else {
                countOdd = countOdd + 1 ;
            }
        }
        System.out.println("Even number: "+ countEven);
        System.out.println("Odd number: "+ countOdd);
    }
}
