import edu.princeton.cs.algs4.*;

public class Stats{
	public static void main(String[] args){
		Bag<Double> numbers = new Bag<Double>();
		while(!StdIn.isEmpty())
			numbers.add(StdIn.readDouble());
		for(double x : numbers)
			StdOut.println(x);
		double sum = 0;
		for(double x : numbers)
			sum += x;
		int len = numbers.size();
		double mean = sum/len;
		StdOut.printf("Mean of the Bag is: %.2f\n", mean);
		double std = 0;
		for(double x : numbers)
			std += (x - mean)*(x - mean);
		StdOut.printf("Std is: %.2f\n", Math.sqrt(std/(len - 1)));
	}
}