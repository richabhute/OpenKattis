import java.util.*;
import java.io.*;


public class statistics
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		while(in.hasNextInt())
		{
			count++;
			int val = in.nextInt();
			int min = 10000000;
			int max = -10000000;
		
			//ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < val; i++)
			{	
				int val2 = in.nextInt();
				min = Math.min(min, val2);
				max = Math.max(max, val2);
			}
			System.out.println("Case " + count + ": " + min + " " + max + " " + (max-min));
			
		}	
		in.close();
	}
}