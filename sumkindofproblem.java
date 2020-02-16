import java.util.*;
import java.io.*;

public class sumkindofproblem
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		in.nextLine();

		for(int i = 0; i<cases; i++)
		{
			int set = in.nextInt();
			int N = in.nextInt();

			int s1 = (N*(N+1))/2;
			int s2 = N*N;
			int s3 = N*(N+1);

			System.out.println(set + " " + s1 + " " + s2 + " " + s3);
			//in.nextLine();
		}
		
	}
}