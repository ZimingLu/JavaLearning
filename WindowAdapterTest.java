import java.awt.*;
import java.awt.event.*;

public class WindowAdapterTest{
	private Frame f = new Frame("test");
	private TextArea ta = new TextArea(40, 40);
	public void init(){
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("closing the Window \n");
				System.exit(0);
			}
		});
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args){
		new WindowAdapterTest().init();
	}
}