import java.util.Scanner;
class Digit_extraction12
{
	public static void main(String args[]){
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int digit,num = sc.nextInt();
		
		while(num!=0){
			digit = num%10;
			System.out.println(digit+"");
			num = num/10;
		}
		sc.close();
	}
}