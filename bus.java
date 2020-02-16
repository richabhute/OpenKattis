import java.util.*;
import java.io.*;

public class bus
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		//in.nextLine();

		for(int i = 0; i < cases; i++)
		{
			double p = 0;
			int stops = in.nextInt();
			for(int j =0; j<stops; j++)
			{
				p = (p+0.5)*2;
			}
			System.out.println((int) p);
		}
		in.close();
	}
}