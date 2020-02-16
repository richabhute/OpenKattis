import java.util.*;
import java.io.*;

public class lineup
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		while(in.hasNext())
		{
			int cases = in.nextInt();
			int n = 0, m = 0;
			
			String n1 = in.next();
			for(int i = 1 ; i < cases; i++)
			{
				String n2 = in.next();
				int compare = n1.compareTo(n2);
				n1 = n2;
				if(compare < 0)
				{ 
					n++;
				}else
				{
					m++;
				}
			}

			if(n!=0 && m==0)
			{
				System.out.println("INCREASING");
			}else if(n==0 && m!=0)
			{
				System.out.println("DECREASING");
			}else
			{
				System.out.println("NEITHER");
			}
		}

	}
}




 




















