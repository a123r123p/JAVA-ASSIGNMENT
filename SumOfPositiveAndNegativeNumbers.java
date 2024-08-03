import java.util.Scanner;

public class SumOfPositiveAndNegativeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int positiveSum = 0;
        int negativeSum = 0;

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 0) {
                positiveSum += arr[i];
            } else {
                negativeSum += arr[i];
            }
        }

        System.out.println("Sum of positive numbers: " + positiveSum);
        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Overall sum: " + (positiveSum + negativeSum));
    }
}
