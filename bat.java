import java.util.*;
import java.io.*;

public class bat
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		double sum = 0;
		in.nextLine();
		ArrayList<Double> list = new ArrayList<Double>();
		for(int i = 0; i < num; i++)
		{
			double val = in.nextDouble();
			if(val >= 0)
			{
				list.add(val);
			}	
		}
		//System.out.println(list);

		for(int j = 0; j < list.size(); j++)
		{
			sum = sum + list.get(j);
		}

		//System.out.println(sum);
		double slugg = sum/(list.size());
		System.out.println(slugg);

		
		
	}
}