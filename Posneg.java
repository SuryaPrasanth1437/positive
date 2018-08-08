package program;

import java.util.Scanner;

public class Posneg 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner nu =new Scanner(System.in);
		System.out.println("enter the number");
		n=nu.nextInt();
		if (n>0)
			System.out.println("the given number is positive");
		else if (n<0)
			System.out.println("the given number is negetive");
		else
			System.out.println("the given number is zero");
		nu.close();
	}

}
