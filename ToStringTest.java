class Apple{
	private String color;
	private double weight;
	public Apple(String color, double weight){
		this.color = color;
		this.weight = weight;
	}

	public String toString(){
		return "color is " + color + ", weight is "+ weight;
	}
}

public class ToStringTest{
	public static void main(String[] args){
		Apple a = new Apple("red", 2.04);
		System.out.println(a);
	}
}