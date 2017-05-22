import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class HandDraw{
	private final int AREA_WIDTH = 500;
	private final int AREA_HEIGHT = 400;

	//last postion of mouse
	private int preX = -1;
	private int preY = -1;

	//right click for the color transfer
	PopupMenu pop = new PopupMenu();
	MenuItem redItem = new MenuItem("red");
	MenuItem greenItem = new MenuItem("green");
	MenuItem blueItem = new MenuItem("blue");

	BufferedImage image = new BufferedImage(AREA_WIDTH, AREA_HEIGHT, 
		BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();

	private Frame f = new Frame("test");
	private DrawCanvas drawArea = new DrawCanvas();

	private Color foreColor = new Color(255, 0, 0);

	public void init(){
		//define the right click listener
		ActionListener menuListener = e -> {
			if(e.getActionCommand().equals("green"))
				foreColor = new Color(0, 255, 0);
			if(e.getActionCommand().equals("red"))
				foreColor = new Color(255, 0, 0);
			if(e.getActionCommand().equals("blue"))
				foreColor = new Color(0, 0, 255);
		};

		redItem.addActionListener(menuListener);
		greenItem.addActionListener(menuListener);
		blueItem.addActionListener(menuListener);

		pop.add(redItem);
		pop.add(greenItem);
		pop.add(blueItem);
		drawArea.add(pop);

		g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);
		drawArea.setPreferredSize(new Dimension(AREA_WIDTH, AREA_HEIGHT));

		drawArea.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				if(preX > 0 && preY > 0){
					g.setColor(foreColor);
					g.drawLine(preX, preY, e.getX(), e.getY());
				}
				preX = e.getX();
				preY = e.getY();

				drawArea.repaint();
			}
		});

		drawArea.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent e){
				if(e.isPopupTrigger()){
					pop.show(drawArea, e.getX(), e.getY());
				}
				preX = -1;
				preY = -1;
			}
		});
		f.add(drawArea);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args){
		new HandDraw().init();
	}

	class DrawCanvas extends Canvas{
		public void paint(Graphics g){
			g.drawImage(image, 0, 0, null);
		}
	}
}