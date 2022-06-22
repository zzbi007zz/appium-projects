package Java.lab3;

public class Ex3_3 {
    public static void main(String[] args) {
        int[] sortArr = {12, 34, 1, 16, 28};
        int arrSize = sortArr.length;
        for (int step = 1; step < arrSize ; step++) {
            int keyValue = sortArr[step];
            int j = step-1;
        while (j>=0 && keyValue < sortArr[j]) {
            sortArr[j+1] = sortArr[j];
            --j;
        }
        sortArr[j + 1] = keyValue;
        }
        System.out.println("Sorted Array in Ascending Order: ");
        for (int i :sortArr) {
            System.out.println(i);
        }
    }
}


