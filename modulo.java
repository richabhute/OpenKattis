import java.util.*;
import java.io.*;

public class modulo
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Set<Integer> mySet = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		while(in.hasNextInt())
		{
			mySet.add(in.nextInt());
		}
		//System.out.println(mySet);

		int count = 1;
		for(int val : mySet)
		{
			int num = val%42;
			set2.add(num);	
		}
		System.out.println(set2.size());
		
		
	}
}