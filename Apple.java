public class Apple<T>{
	private T info;

	public Apple(T info){
		this.info = info;
	}

	public void setInfo(T info){
		this.info = info;
	}

	public T getInfo(){
		return info;
	}

	public static void main(String[] args){
		Apple<String> a1 = new Apple<>("Apple");
		System.out.println(a1.getInfo());
		Apple<Integer> a2 = new Apple<>(5);
		System.out.println(a2.getInfo());
	}
}