//V00874499, Bhute Richa
import java.util.*;
import java.io.*;

public class dicebetting
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int k = in.nextInt();
		double[][] array = new double[n+1][s+1];

		for(int i = 0; i < n+1; i++)
		{
			for(int j = 0; j < s+1; j++)
			{
				if(j<k && i==0)
				{
					array[i][j] = 0;
				}else if( j >= k)
				{
					array[i][j] = 1;
				}else if(j == s) 
				{
					array[i][j] = (j*(array[i-1][j]))/s;
				}
				else
				{
					array[i][j] = (j*(array[i-1][j]) + (s-j)*(array[i-1][j+1]))/s;
				}

			}
		}

		System.out.println(array[n][0]);
	}
}