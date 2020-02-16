//V00874499, Bhute Richa
import java.io.*;
import java.util.*;


public class kastenlauf
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		
		for(int i=0;i<tests; i++)
		{
			int stores = in.nextInt();
			in.nextLine();
			int[][] array = new int[stores+2][2];
			for(int j=0; j< stores+2; j++)
			{
				int x = in.nextInt();
				int y = in.nextInt();

				array[j][0] = x;
				array[j][1] = y;
			}

			UnionFind now = new UnionFind(stores + 2);

			for(int k = 0; k < stores + 2; k++)
			{
				for(int l = 0; l < k; l++)
				{
					int dist = Math.abs(array[k][0] - array[l][0])+ Math.abs(array[k][1] - array[l][1]);
					if(dist <= 1000)
					{
						now.union(k, l);
					}
				}
			}

			System.out.println(now.same_component(0, stores+1) ? "happy":"sad"); 
		}
	}


}

class UnionFind
{
    int n;
    int [] parent;

  public UnionFind(int n_vertex)
    {
       int i;

       n= n_vertex;
       parent= new int[n_vertex];

       for (i=0; i < n; i++)
           parent[i]=i;
    }

/*
    Returns true if u and v are in the same component
    and false otherwise.
*/

    public boolean same_component(int u, int v)
    {
        if (parent[u]== parent[v]) return(true);
        else return(false);
    }

/* 
    Update components to reflect the addition of edge (u, v).
*/

    public void union(int u, int v)
    {
        int i, min, max;

//      Just return if u and v are already in the same component.

        if (parent[u] ==  parent[v]) return;

/* 
        Otherwise, update the data structure.
*/

        if (parent[u] < parent[v])
        {
            min= parent[u];
            max= parent[v];
        }
        else
        {
            min= parent[v];
            max= parent[u];
        }
        for (i=0; i < n; i++)
        {
            if (parent[i]== max) parent[i]= min;
        }
    }
}
