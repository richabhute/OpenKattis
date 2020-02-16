import java.util.*;
import java.io.*;


public class bishop
{
	
	public static void main(String[] args) 
	{	
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt())
		{
			int n = in.nextInt();

			if(n==1)
			{
				System.out.println(n);
			}else if(n > 1)
			{
				int possible = (2*n)-2;
				System.out.println(possible);
			}else
			{
				System.out.println(0);
			}

		}
		in.close();
	}
}