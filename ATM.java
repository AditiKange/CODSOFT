import java.lang.*;
import java.util.Scanner;

class Account 
{			
	int balance=1000;
				
}

class ATM extends Account
{	
	public static void main(String[] args)
	{	
		
	Scanner input = new Scanner(System.in);
	ATM atm = new ATM();
	boolean continueTransaction = true;
	
	while(continueTransaction)
	{
	System.out.println("Press 1 to Withdraw money");
	System.out.println("Press 2 to Deposit money");
	System.out.println("Press 3 to Check balnce");
	System.out.println("Press 4 to Cancel transaction");

	int a = input.nextInt();
	
 	
	switch(a)
	{
			case 1:
				System.out.println("Enter the amount to be withdrawn:");
				int amount=input.nextInt();
				atm.withdraw(amount);
				break;
			case 2:
				System.out.println("Enter the amount to be deposited");
				int amountdep=input.nextInt();
				atm.deposit(amountdep);
				break;
			case 3:
				atm.checkBalance();
				break;
			case 4:
				continueTransaction = false;
                    		System.out.println("Transaction cancelled/completed.");
                    		break;
			default:
				System.out.println("Invalid option");
				break;
	}
}
}
	int withdraw(int amount)
	{
		if(balance<amount)
			System.out.println("Insufficient balance");
		else
			balance-=amount;
			System.out.println("Please collect your cash");	
		return amount;
	}
	 void deposit(int amount)
	{
		balance+=amount;
		System.out.println(""+amount+" Deposited");
	}
	 void checkBalance()
	{
		System.out.println("Current balance:"+balance);
	}
	

}
		
		 	