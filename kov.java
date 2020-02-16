import java.util.*;
import java.io.*;

public class kov
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<4;i++)
		{
			int val = in.nextInt();
			list.add(val);
		}
		Collections.sort(list);
		
		int area = list.get(0)*list.get(2);
		System.out.println(area);
		
		
	}
}