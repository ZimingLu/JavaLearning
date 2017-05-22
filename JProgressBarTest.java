import javax.swing.*;
import java.awt.*;

public class JProgressBarTest{
	JFrame frame = new JFrame("test");
	JProgressBar bar = new JProgressBar(JProgressBar.VERTICAL);
	JCheckBox indeterminate = new JCheckBox("not sure");
	JCheckBox noBorder = new JCheckBox("no border");
	public void init(){
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(indeterminate);
		box.add(noBorder);
		frame.add(box);
		frame.add(bar, BorderLayout.EAST);
		bar.setStringPainted(true);
		noBorder.addActionListener(event -> 
			bar.setBorderPainted(!noBorder.isSelected()));
		final SimulatedActivity target = new SimulatedActivity(1000);
		new Thread(target).start();

		bar.setMinimum(0);
		bar.setMaximum(target.getAmount());
		Timer timer = new Timer(300, event -> bar.setValue(target.getCurrent()));
		timer.start();
		indeterminate.addActionListener(e -> {
			bar.setIndeterminate(indeterminate.isSelected());
			bar.setStringPainted(!indeterminate.isSelected());
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args){
		new JProgressBarTest().init();
	}
}

class SimulatedActivity implements Runnable{
	private volatile int current;
	private int amount;
	public SimulatedActivity(int amount){
		current = 0;
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public int getCurrent(){
		return current;
	}

	public void run(){
		while(current < amount){
			try{
				Thread.sleep(50);
			}catch(InterruptedException e){

			}
			current++;
		}
	}
}