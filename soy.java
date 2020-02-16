import java.util.*;
import java.io.*;

public class soy
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		in.nextLine();

		for(int i = 0; i < test; i++)
		{
			double a = in.nextInt();
			double val = Math.ceil(a/400);
			int x = (int)val;
			System.out.println(x);
		}
	}
}