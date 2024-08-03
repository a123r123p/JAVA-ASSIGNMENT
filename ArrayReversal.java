import java.util.Scanner;

public class ArrayReversal {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        
        double[] numbers = new double[size];

        
        System.out.println("Enter " + size + " double numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextDouble();
        }

      
        for (int i = 0; i < size / 2; i++) {
            double temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }

        
        System.out.println("Reversed array:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}
