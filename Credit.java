import java.util.Scanner;
class Credit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.println("enter the score");
		score = sc.nextInt();
		if(score>=400 && score<=600){
			System.out.println("SILVER CARD");
		}
		if(score>=600 && score<=800){
			System.out.println("GOLD CARD");
		}
		if(score>=800 && score<=850){
			System.out.println("PLATINUM CARD");
		}
		else{
			System.out.println("Invalid input");
		}
	}
}
	
