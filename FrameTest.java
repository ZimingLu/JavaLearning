import java.awt.*;

public class FrameTest{
	public static void main(String[] args){
		Frame f = new Frame("test");
		Panel p1 = new Panel();
		p1.add(new TextField(30));
		f.add(p1, BorderLayout.NORTH);
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 5, 4, 4));
		for(int i=0; i<15; i++){
			p2.add(new Button(String.valueOf(i)));
		}
		f.add(p2);
		
		f.pack();
		f.setVisible(true);
	}
}