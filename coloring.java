import java.util.*;
import java.io.*;

public class coloring
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] color = new int[num];
		ArrayList<ArrayList<Integer>> now = new ArrayList<ArrayList<Integer>>();
		in.nextLine();
		for(int i =0; i<num;i++)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			String[] token = in.nextLine().split(" ");
			for(String a : token)
			{
				int b = Integer.parseInt(a);
				list.add(b);
			}
			now.add(list);
		}
		System.out.println(backtrack(now, color, 1, 1));	
	}

	static int backtrack(ArrayList<ArrayList<Integer>> list2, int[] color, int curr, int track)
	{
		if(curr == list2.size())
		{
			return track;
		}

		Set<Integer> illegalCol = new HashSet<Integer>();
		for(int j:list2.get(curr))
		{
			if(j<curr)
			{
				illegalCol.add(color[j]);
			}		
		}

		int min = 0;
		for(int i = 0; i<=track; i++)
		{
			if(!illegalCol.contains(i))
			{
				color[curr] = i;

				if(i==track)
				{
					int x = backtrack(list2, color, curr+1, track+1);
					if(min==0 || x<min)
					{
						min = x;
					}
				}else
				{
					int x = backtrack(list2, color, curr+1, track);
					if(min==0 || x<min)
					{
						min = x;
					}
				}

			}
		}
		return min;
	}
}