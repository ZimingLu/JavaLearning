import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class BinarySearch
{
	public static int Rank(int[] a, int item)
	{
		int lo = 0;
		int hi = a.length - 1;
		while(hi>=lo)
		{
			int mid = lo + (hi - lo)/2;
			if(a[mid]>item)
				hi = mid-1;		
			else if(a[mid]<item)
				lo = mid+1;
			else
				return a[mid];	
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			if(Rank(whitelist, key)<0)
				StdOut.print(key + "\n");
		}
	}
}
	
