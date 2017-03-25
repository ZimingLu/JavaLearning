import edu.princeton.cs.algs4.*;

public class ex113
{
	public static void main(String[] args)
	{
		int[] a = new int[3];
		for(int i = 0; i<3; i++)
		{
			a[i] = Integer.parseInt(args[i]);
		}

		if(a[0] == a[1] && a[1] == a[2])
			StdOut.println("equal");
		else
			StdOut.println("not equal");
	}
}