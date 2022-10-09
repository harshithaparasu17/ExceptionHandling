package eTask1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CorrectInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i=0;
        System.out.println("Please provide the Integer: ");
        while(true)
        {
        	try
        	{
        		i=input.nextInt();
        		break;
        	}
        	catch(InputMismatchException e)
        	{
        		System.out.println("You didnot provide the integer. Check the Input!!");
        		break;
        		
        	}
        }
		System.out.println("Input of type int: "+i);
		
		
		
		
		
		
	}

}
