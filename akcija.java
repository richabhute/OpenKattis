import java.util.*;
import java.io.*;

public class akcija
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i < n;i++)
		{
			int a = in.nextInt();
			list.add(a);
		}
		Collections.sort(list);
		long total =0;

		for(int j = n-1; j>n%3; j-=3)
		{
			total += list.get(j);
			total += list.get(j-1);
		}

		for(int i = 0; i<n%3;i++)
		{
			total += list.get(i);
		}
		
		System.out.println(total);
	}
}