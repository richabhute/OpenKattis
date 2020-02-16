import java.util.*;
import java.io.*;

public class bookroom
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int rooms = in.nextInt();
		int booked = in.nextInt();
		in.nextLine();
		Set<Integer> num = new HashSet<Integer>();
		ArrayList<Integer> empty = new ArrayList<Integer>();

		if(rooms == booked)
		{
			System.out.println("too late");
		}else
		{
			for(int i = 0; i < booked;i++)
			{
				int val = in.nextInt();
				num.add(val);
			}

			for(int j=1; j<=rooms; j++)
			{
				empty.add(j);
			}
			empty.removeAll(num);
			
			//Collections.sort(empty);

			Random rand = new Random();
    		int randomElement = empty.get(rand.nextInt(empty.size()));
    		System.out.println(randomElement);
		}


		



		
	}
}