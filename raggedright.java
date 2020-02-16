import java.util.*;
import java.io.*;


public class raggedright
{
	public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(in.hasNextLine())
        {
            String line = in.nextLine();
            list.add(line.length());
        }
 
        int max = Collections.max(list);
        int sum = 0;
        for(int i = 0; i < list.size() - 1; i++)
        {

        	int penalty = (max - list.get(i))*(max - list.get(i));
        	sum = sum + penalty;
        }
        System.out.println(sum);    
    }
}