package com.Mypackage;
import java.util.Random;
import java.util.Scanner;
public class NumberGussGame {
	public static void main(String args[])
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = rand.nextInt(100) + 1;
		int count=0;
		
		while(true)
		{	
			System.out.print("Enter your Guss Number (1-100)=");
					
			int playerGuss = sc.nextInt();
			
			count++;
			
			if(playerGuss == randomNumber)
			{
				System.out.println("Correct! You  Win!");
				System.out.print(count+" Time You Guss");
				break ;
			}
			else if(playerGuss < randomNumber)
			{
				
				System.out.println("Nope! the number is higher. Guss again.");
				System.out.print("\n");
			}
			else if(playerGuss > randomNumber)
			{
				System.out.println("Nope! the number is lower. Guss again.");
				System.out.print("\n");
			}

		}
	}
}
