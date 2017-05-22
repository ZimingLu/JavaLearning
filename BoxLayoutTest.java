import java.awt.*;
import javax.swing.*;

public class BoxLayoutTest{
	private Frame f = new Frame("test");
	public void init(){
		f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args){
		new BoxLayoutTest().init();
	}
}