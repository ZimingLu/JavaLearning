import java.awt.*;
import java.awt.event.*;

public class EventQs{
	private Frame f = new Frame("Test");
	private Button bt = new Button("test");
	private TextField tf = new TextField(30);
	public void init(){
		bt.addActionListener(new BtListener());
		f.add(tf);
		f.add(bt, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}

	class BtListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Hello World!");
			tf.setText("test ok!");
		}
	}
	public static void main(String[] args){
		new EventQs().init();
	}
}