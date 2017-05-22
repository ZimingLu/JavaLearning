import java.lang.reflect.*;

public class CreateJFrame{
	public static void main(String[] args) throws Exception{
		Class<?> jframeClazz = Class.forName("javax.swing.JFrame");
		Constructor ctor = jframeClazz.getConstructor(String.class);
		Object obj = ctor.newInstance("test");
		System.out.println(obj);
	}
}