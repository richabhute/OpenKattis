import java.util.*;
import java.io.*;

public class nastyHacks
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		in.nextLine();
		for(int i = 0; i < cases; i++)
		{
			int r = in.nextInt();
			int e = in.nextInt();
			int c = in.nextInt();

			int val = e - c;
			if(val > r)
			{
				System.out.println("advertise");
			}else if (val < r)
			{
				System.out.println("do not advertise");
			}else
			{
				System.out.println("does not matter");
			}
		}
		
	}
}