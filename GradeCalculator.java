import java.util.Scanner;
import java.lang.*;

public class GradeCalculator
{
	public static void main(String[] args)
	{
		int s=0;
		float per=0;
		System.out.println("Enter the student's marks:");
		Scanner input =new Scanner(System.in);
		System.out.println("Physics:");
		int p=input.nextInt();
		System.out.println("Chemistry:");
		int c=input.nextInt();
		System.out.println("Maths:");
		int m=input.nextInt();
		System.out.println("Science:");
		int b=input.nextInt();
		System.out.println("English:");
		int e=input.nextInt();
		System.out.println("Physics:"+p+" Chemistry:"+c+" Maths:"+m+" Science:"+b+" English:"+e);
		s=p+c+m+b+e;
		per=s/5;
		System.out.println("Toatl Marks Obtained: "+s);
		System.out.println("Percentage obtained:"+per+"%");
		 if(per>=90)System.out.println("Grade: A");	
		 if(per>=80 && per<90)System.out.println("Grade: B");
		 if(per>=70 && per<80)System.out.println("Grade: C");
		 if(per>=60 && per<70)System.out.println("Grade: D");			
		 if(per>=50 && per<60)System.out.println("Grade: E");;
		 if(per<50)System.out.println("Fail");		

	}	
}

		