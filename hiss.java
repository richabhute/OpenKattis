import java.util.*;
import java.io.*;

public class hiss
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String reply = "no hiss";

		for(int i = 0; i < line.length() - 1 ; i++)
		{
			if(line.charAt(i) == 's' && line.charAt(i+1) == 's')
			{
				reply = "hiss";
				break;
			}
		}

		System.out.println(reply);


		
	}
}