import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class cups
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();

		HashMap <Integer,String> map = new HashMap<Integer, String>();
		ArrayList<Integer> nums = new ArrayList<Integer>();

		for(int i = 0; i < test; i++)
		{
			try
			{
				int radius = in.nextInt()/2;
				String color = in.next();

				map.put(radius, color);
				nums.add(radius);
			}
			catch(Exception e)
			{
				String color = in.next();
				int radius = in.nextInt();

				map.put(radius, color);
				nums.add(radius);
			}
		}

		Collections.sort(nums);

		/*for(int i = 0; i < nums.size(); i++)
		{
			System.out.println(map.get(nums.get(i)));
		}*/

		for(int k : nums)
		{
			System.out.println(map.get(k));
		}
	}

	//in.close();
}