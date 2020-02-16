import java.util.*;
import java.io.*;

public class unbearablezoo
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int num = 1;

		while(true)
		{
			int n = in.nextInt();
			in.nextLine();

			if(n==0)
				break;

			HashMap<String, Integer> map = new HashMap<String, Integer>();
			ArrayList<String> names = new ArrayList<String>();

			for(int i = 0; i < n; i++)
			{
				String animal = in.nextLine();
				animal = animal.substring(animal.lastIndexOf(" ") + 1).toLowerCase();

				if(!names.contains(animal))
				{
					names.add(animal);
					map.put(animal, 1);
				}
				else
				{
					map.put(animal, map.get(animal)+1);
				}
			}

			Collections.sort(names);

			System.out.println("List " + num + ":");
			num++;

			for(int j =0; j< names.size(); j++)
			{
				System.out.println(names.get(j) + " | " + map.get(names.get(j)));
			}

		}
		in.close();
		
	}

	
}