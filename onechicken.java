import java.util.*;
import java.io.*;

public class onechicken
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int left = Math.abs(a-b);
		if(b > a)
		{
			if(left == 1)
			{
				System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
			}else
			{
				System.out.println("Dr. Chaz will have " + left + " pieces of chicken left over!");
			}
		}else if(left == 1)
		{
			System.out.println("Dr. Chaz needs 1 more  piece of chicken!");
		}else
		{
			System.out.println("Dr. Chaz needs " + left + " more pieces of chicken!");
		}
		
		
		
		
	}
}