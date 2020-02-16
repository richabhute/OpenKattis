import java.util.*;
import java.io.*;

public class pheart
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
			ArrayList<String> name = new ArrayList<String>();
			ArrayList<Double> rate = new ArrayList<Double>();
			String line = in.nextLine();
			String[] token = line.split(" ");

			for(int i = 0; i<token.length;i++)
			{
				if(isDouble(token[i]))
				{
					double val = Double.parseDouble(token[i]);
					rate.add(val);
				}else
				{
					name.add(token[i]);
				}
			}
			
			double sum = 0;
			for(int j = 0; j<rate.size(); j++)
			{
				sum += rate.get(j);
			}

			double avg = sum/(rate.size());
			System.out.printf("%.6f ", avg);
			for(int j = 0; j<name.size(); j++)
			{
				System.out.print(name.get(j) + " ");
			}
			System.out.printf("%n");

		}

		
	}


	public static boolean isDouble(String str) 
	{
	    try 
	    {
	        double v = Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException nfe) 
	    {

    	}
    	
    	return false;
	}

}