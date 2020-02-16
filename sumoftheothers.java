import java.io.*;
import java.util.*;

public class sumoftheothers
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
			String[] line = in.nextLine().split(" ");
			int[] num = new int[line.length];

			for(int i = 0; i < line.length; i++)
			{
				num[i] = Integer.parseInt(line[i]);
			}

			for(int j = 0; j < num.length; j++)
			{
				if(check(j, num))
				{
					System.out.println(num[j]);
					break;
				}
			}
		}

		in.close();
	}

	public static boolean check(int index, int[] nums)
	{
		int sum = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(i!=index)
			{
				sum+=nums[i];
			}
		}

		return sum==nums[index];
	}
}