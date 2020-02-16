import java.util.*;
import java.io.*;

public class justaminute
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;

		int tests = in.nextInt();
		for(int i = 0; i < tests;i++)
		{
			a += in.nextInt();
			b += in.nextInt();
		}

		if(a*60>=b)
		{
			System.out.println("measurement error");
		}else
		{
			System.out.println((double)b/(a*60));
		}
		
	}
}