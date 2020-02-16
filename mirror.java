import java.util.*;
import java.io.*;

public class mirror
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Test " + i);
			int rows = in.nextInt();
			int col = in.nextInt();
			in.nextLine();
			
			String[] stuff = new String[rows];

			for(int j = 0; j<rows; j++)
			{
				stuff[j] = in.next();
			}

			for(int k = rows - 1; k >= 0 ;  k--)
			{
				System.out.println(mirrored(stuff[k]));
			}
		}		
	}

	public static String mirrored(String line)
	{
		String mirrored = "";
		for(int k = line.length() - 1; k >= 0 ;  k--)
		{
			mirrored += line.charAt(k); 
		}
		return mirrored;
	}
}