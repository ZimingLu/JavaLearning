class DataWrap{
	int a;
	int b;
}
public class ReferenceTransferTest{

	public static void swap(DataWrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("a is:" + dw.a + "b is:" + dw.b);
		dw = null;
	}
	public static void main(String[] args){
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("a is:" + dw.a + "b is:" + dw.b);
	}
}