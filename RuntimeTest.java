import java.util.*;
public class RuntimeTest{
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();
		System.out.println("available processors#: " + rt.availableProcessors());
		System.out.println("free memory: " + rt.freeMemory());
		System.out.println("totalMemory" + rt.totalMemory());
		System.out.println("maxMemory: " + rt.maxMemory());
	}
}