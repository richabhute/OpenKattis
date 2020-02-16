import java.util.*;
import java.io.*;

public class areal
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double area = Double.parseDouble(in.readLine());
		double para = Math.sqrt(area)*4;
		System.out.println(para);
	}
}