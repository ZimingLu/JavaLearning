import edu.princeton.cs.algs4.*;

public class RandomSeq
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        int lo = Integer.parseInt(args[1]);
        int hi = Integer.parseInt(args[2]);
        for(int i=0; i<N; i++)
        {
            int x = (StdRandom.uniform(lo, hi));
            StdOut.printf("%d\n", x);
        }
    }
}