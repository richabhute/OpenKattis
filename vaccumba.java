import java.util.*;
import java.io.*;

public class vaccumba
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int cases = in.nextInt();
			for(int i = 0 ; i < cases; i++)
			{
				double x = 0;
				double y = 0;
				double perp = 90;
				int seg = in.nextInt();
				for(int j = 0; j < seg; j++)
				{
					double angle = in.nextDouble();
					double len = in.nextDouble();
					
					perp += angle;

					x += len * Math.cos(Math.toRadians(perp));
					y += len * Math.sin(Math.toRadians(perp));
				}
				System.out.printf("%.6f %.6f\n", x, y);

			}
			
		}
		

		
		
	}
}