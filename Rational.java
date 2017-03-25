import edu.princeton.cs.algs4.*;

public class Rational implements Comparable<Rational>{
	
	private static Rational zero = new Rational(0, 1);
	private long num;
	private long den;


	public Rational(long numerator, long denminator){
		if(denminator == 0)
			throw new ArithmeticException("deminator is zero");
		long g = gcd(numerator, denminator);
		num = numerator / g;
		den = denminator / g;
		//needed only for negative numbers
		if(den < 0){
			den = -den;
			num = -num;
		}
	}

	public long numerator() {return num;}
	public long denminator() {return den;}

	public String toString(){
		if(den == 1) return num + "";
		else return num + "/" + den;
	}

	public int compareTo(Rational that){
		long lhs = this.num*that.den;
		long rhs = this.den*that.num;
		if(lhs < rhs) return -1;
		else if(lhs > rhs) return +1;
		else return 0;
	}

	public boolean equals(Object other){
		if(other == null) return false;
		if(other.getClass() != this.getClass()) return false;
		Rational that = (Rational) other;
		return this.compareTo(that) == 0;
	}

	public int hashCode(){
		return this.toString().hashCode();
	}

	public static Rational mediant(Rational r, Rational s){
		return new Rational(r.num + s.num, r.den + s.den);
	}

	private static long gcd(long m, long n){
		if(m < 0) m = -m;
		if(n < 0) n = -n;
		if (0 == n) return m;
		else return gcd(n, m%n);
	}

	private static long lcm(long m, long n){
		if(m < 0) m = -m;
		if(n < 0) n = -n;
		return m * (n / gcd(m, n));
	}

	public Rational times(Rational that){
		Rational c = new Rational(this.num, that.den);
		Rational d = new Rational(that.num, this.den);
		return new Rational(c.num*d.num, c.den*d.den);
	}

	public Rational plus(Rational that){
		if(this.compareTo(zero) == 0) return that;
		if(that.compareTo(zero) == 0) return this;
		// long f = gcd(this.num,that.den);
		// long g = gcd(that.num, this.den);
		// Rational s = new Rational((this.num/f)*(that.den/f) + (this.den/g)*(that.num/g),
		// 					this.den*(that.den/g));
		// s.num *= f;
		Rational s = new Rational(this.num*that.den+this.den*that.num,
									this.den*that.den);
		return s;
	}

	public Rational negate(){
		return new Rational(-num, den);
	}

	public Rational minus(Rational that){
		return this.plus(that.negate());
	}

	public Rational reciprocal(){
		return new Rational(den, num);
	}

	public Rational divideBy(Rational that){
		return this.times(that.reciprocal());
	}

	public static void main(String[] args){
		Rational x,y,z;
		x = new Rational(1,2);
		y = new Rational(2,3);
		z = x.plus(y);
		// StdOut.println(x);
		// StdOut.println(y);
		StdOut.println(z);

		x = new Rational(8, 9);
		y = new Rational(1, 9);
		z = x.plus(y);
		StdOut.println(z);

		x = new Rational(1, 20000000);
		y = new Rational(1, 30000000);
		z = x.plus(y);
		StdOut.println(z);

		x = new Rational(4, 17);
		y = new Rational(17, 4);
		z = x.times(y);
		StdOut.println(z);

		x = new Rational(1, 6);
		y = new Rational(-4, -8);
		z = x.minus(y);
		StdOut.println(z);
	}



}