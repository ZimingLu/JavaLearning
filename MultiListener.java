import java.awt.*;
import java.awt.event.*;

public class MultiListener{
	private Frame f = new Frame("test");
	private TextArea ta = new TextArea(6, 40);
	private Button b1 = new Button("button 1");
	private Button b2 = new Button("button 2");
	public void init(){
		FirstListener f1 = new FirstListener();
		b1.addActionListener(f1);
		b1.addActionListener(new SecondListener());
		b2.addActionListener(f1);
		f.add(ta);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		f.add(p, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}

	class FirstListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ta.append("the action is from first \n");
		}
	}

	class SecondListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ta.append("the action is from second \n");
		}
	}

	public static void main(String[] args){
		new MultiListener().init();
	}
}