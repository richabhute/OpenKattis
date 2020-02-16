//V00874499, Richa Bhute
import java.util.*;
import java.io.*;

public class BT
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int[] items = new int[100];
		int vertices = in.nextInt(); //locations - 6
		in.nextLine();
		for(int i =0; i< vertices; i++)
		{
			int val = in.nextInt(); // items to be picked up
			items[i] = val;
		}
		//System.out.println(items);

		int edges = in.nextInt(); // number of roads in city - 7
		//System.out.println(edges);
		//in.nextLine();


        int[][] table = new int[vertices][vertices];
        for(int i = 0; i < edges; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            table[a-1][b-1] = c;
            table[b-1][a-1] = c;
        }

        dij(table, items);
        
        		
	}

//dijstra's algo
    static void dij(int graph[][], int[] items)
    {
    	int n = graph.length;
        int[] dist = new int[n];
        int[] num = new int[n];
        num[0] = items[0];

        Set<Integer> visited = new HashSet<Integer>(); 
        Set<Integer> unvisited = new HashSet<Integer>(); 

        for(int j = 0; j<n; j++)
        {
        	dist[j] = 15000;
        }
        dist[0] = 0;
        for(int i = 0; i < graph.length; i++)
        {	
        	unvisited.add(i);
        }

        while(!unvisited.isEmpty())
        {
        	int min = -1;
        	int distance = 15000; // some infinity value
        	int val = 0; // items
        	for(int u : unvisited)
        	{	
        		if((dist[u]<distance) || (dist[u] == distance && num[u]>val))
        		{
        			min = u;
        			distance = dist[u];
        			val = num[u];
        		}
        	}

        	if(min < 0)
        	{
        		break;
        	}

        	unvisited.remove(min);

        	for(int p : unvisited)
        	{
        		//int val = 0;
        		int val2 = 0;
        		if(graph[p][min] != 0)
        		{
        			val = dist[min] +  graph[p][min];
        			val2 = num[min] + items[p];
        			if((val<dist[p]) || (val==dist[p] && val2>num[p]))
        			{
        				dist[p] = val;
        				num[p] = val2;
        			}
        		}
        	}
        }

        if(dist[n-1] == 15000)
        {
       		System.out.println("impossible");
        }else
        {
        	System.out.println(dist[n-1] + " " +num[n-1]);
        }
        

    }
}

