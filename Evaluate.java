import edu.princeton.cs.algs4.*;

public class Evaluate{
	public static void main(String[] args){
		Stack<String> ops = new Stack<String>();
		Stack<Double> val = new Stack<Double>();

		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			 if 	 (s.equals("(")) ;
			 else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("sqrt")) 
			 	ops.push(s);
			 else if(s.equals(")")){
			 	String op = ops.pop();
			 	double v  = val.pop();
			 	if     (op.equals("+"))    { v = val.pop() + v; }
			 	else if(op.equals("-"))    { v = val.pop() - v; }
			 	else if(op.equals("*"))    { v = val.pop() * v; }
			 	else if(op.equals("/"))    { v = val.pop() / v; }
			 	else if(op.equals("sqrt")) { v = Math.sqrt(v); }
			 	val.push(v);
			 }
			 else
			 	val.push(Double.parseDouble(s));
		}
		StdOut.println(val.pop());
	}
}