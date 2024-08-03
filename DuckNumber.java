import java.util.Scanner;

public class DuckNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        String numStr = sc.next();

        if (isDuckNumber(numStr)) {
            System.out.println(numStr + " is a Duck Number.");
        } else {
            System.out.println(numStr + " is not a Duck Number.");
        }
    }

    
    static boolean isDuckNumber(String numStr) {
        if (numStr.charAt(0) == '0') {
            return false; 
        }
        return numStr.contains("0"); 
    }
}
