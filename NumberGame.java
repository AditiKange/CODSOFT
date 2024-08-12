import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
	public static void main(String args[])
	{
		int number;
		int guess;
		int count=0,n=0,j=0;
		final int max=100;
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);

		System.out.println("Guess a number between 1 and 100:");
		number = random.nextInt(max) + 1;
	
		for(int i=0;i<5;i++)	
		{
			
			guess = input.nextInt();
			if(guess==number)
			{
				count++;
				System.out.println("Guess is correct");
				break;
			}
			if(guess<number)
			{
				System.out.println("Guess is too low");
			}
			if(guess>number)
			{
				System.out.println("Guess is too high");
			}
			if(i==2)
			{
				System.out.println("All attempts have been used");
				break;
			}	
			
		}

		System.out.println("The number was "+number);
	
		System.out.println("Round 1 completed");

		System.out.println("Guess a number between 1 and 100:");
		number = random.nextInt(max) + 1;


		for(int i=0;i<5;i++)
		{
			guess = input.nextInt();
			if(guess==number)
			{
				n++;
				System.out.println("Guess is correct");
				break;
			}
			if(guess<number)
			{
				System.out.println("Guess is too low");
			}
			if(guess>number)
			{
				System.out.println("Guess is too high");
			}


			if(i==2)
			{
				System.out.println("All attempts have been used");
				break;
			}		
			
		}

		System.out.println("The number was "+number);
		System.out.println("Round 2 completed");

		System.out.println("Guess a number between 1 and 100:");
		number = random.nextInt(max) + 1;


		for(int i=0;i<5;i++)	
		{
			guess = input.nextInt();
			if(guess==number)
			{
				j++;
				System.out.println("Guess is correct");
				break;
			}
			if(guess<number)
			{
				System.out.println("Guess is too low");
			}
			if(guess>number)
			{
				System.out.println("Guess is too high");
			}

			if(i==2)
			{
				System.out.println("All attempts have been used");
				break;
			}		
			
		}
		System.out.println("The number was "+number);
		System.out.println("Round 3 completed");

	
		int score=count+n+j;
		
		System.out.println("User's score: "+score+" correct guess");
	}
}	


		



			
		