import java.util.*;
import java.io.*;

public class bee
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
			int x = in.nextInt();
			int y = in.nextInt();
			int total = x + y;

			if( x == 0 && y == 0)
			{
				break;
			}

			if(total==13)
			{
				System.out.println("Never speak again.");
			}
			else if(x>y)
			{
				System.out.println("To the convention.");
			}else if(x<y)
			{
				System.out.println("Left beehind.");
			}else if(x==y)
			{
				System.out.println("Undecided.");
			}


		}
	}
}