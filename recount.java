import java.util.*;
import java.io.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class recount
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();
		
		//int count = 1;
		while(true)
		{
			String name = in.nextLine();

			if(name.equals("***"))
				break;

			if(map.containsKey(name))
			{
				map.put(name, map.get(name) + 1);
				
			}
			else
			{
				list.add(name);
				map.put(name, 0);
			}
			
		}
		
		int max = 0;
		int maxI = 0;
		int countMax = 0;

		for (int i = 0; i < list.size(); i++)
		{
			if(map.get(list.get(i)) > max)
			{
				max = map.get(list.get(i));
				maxI = i;
			}
		}

		for(int i = 0; i < list.size(); i++)
		{
			if(map.get(list.get(i)) == max)
				countMax++;
			
			if(countMax == 2)
				break;
		}

		System.out.println(countMax == 1 ? list.get(maxI) : "Runoff!");
		in.close();
	}
}