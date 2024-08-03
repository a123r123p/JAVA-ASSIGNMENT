import java.util.Scanner;
class Sum_of_digits
{
	public statidc void main(String args[]){
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int digit,num = sc.nextInt(),sum = 0;
		
		while(num!=0){
			digit = num%10;
		sum = sum +digits;
		num = num/10;
		}
		System.out.println("Sum of digits is: "+sum);
		
		scanner.close();
	}
}