import java.util.Scanner;
import java.util.ArrayList;
public class friday 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[6];
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++)
		{
			int val = in.nextInt();
			arr[val - 1]++;
			list.add(val);
		}

		for (int i = 5; i >= -1; i--)
		{
			if (i == -1)
			{
				System.out.println("none");
				break;
			}
			if (arr[i] == 1)
			{
				System.out.println(list.indexOf(i + 1) + 1);
				break;
			}
		}

			in.close();
	}
}