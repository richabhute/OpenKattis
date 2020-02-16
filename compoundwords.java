import java.io.*;
import java.util.*;

public class compoundwords
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		TreeSet<String> mySet = new TreeSet<String>();
		while(in.hasNext())
		{
			list.add(in.next());
		}

		for(int i = 0; i < list.size(); i++)
		{
			for(int j = 0; j < list.size(); j++)
			{
				if(i != j)
				{
					mySet.add(list.get(i) +  list.get(j));
				}
			}
		}

		for(String new_word : mySet)
		{
			System.out.println(new_word);
		}




		
		
	}
}
