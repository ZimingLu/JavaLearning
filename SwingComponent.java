import javax.swing.*;
// import javax.swing.KeyStrock;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class SwingComponent{
	JFrame f = new JFrame("test");
	JButton ok = new JButton("ok");
	JRadioButton male = new JRadioButton("man", true);
	JRadioButton female = new JRadioButton("female", false);
	ButtonGroup bg = new ButtonGroup();
	JCheckBox married = new JCheckBox("married", false);
	String[] colors = new String[]{"red", "green", "blue"};
	JComboBox<String> colorChooser = new JComboBox<>(colors);
	JList<String> colorList = new JList<>(colors);
	JTextArea ta = new JTextArea(8, 20);
	JTextField name = new JTextField(40);
	JMenuBar mb = new JMenuBar();
	JMenu file = new JMenu("file");          
	JMenu edit = new JMenu("edit");
	JMenuItem newItem = new JMenuItem("new");
	JMenuItem save = new JMenuItem("save");
	JMenuItem exit = new JMenuItem("exit");

	JCheckBoxMenuItem autoWrap = new JCheckBoxMenuItem("autowrap");
	JMenuItem copyItem = new JMenuItem("copy");
	JMenuItem paste = new JMenuItem("paste");

	JMenu format = new JMenu("format");
	JMenuItem commentItem = new JMenuItem("comment");
	JMenuItem cancelItem = new JMenuItem("cancel Comment");

	JPopupMenu pop = new JPopupMenu();
	ButtonGroup flavorGroup = new ButtonGroup();

	public void init(){
		JPanel bottom = new JPanel();
		bottom.add(name);
		bottom.add(ok);
		f.add(bottom, BorderLayout.SOUTH);
		JPanel checkPanel = new JPanel();
		checkPanel.add(colorChooser);
		bg.add(male);
		bg.add(female);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);

		Box topLeft = Box.createVerticalBox();
		JScrollPane taJsp = new JScrollPane(ta);
		topLeft.add(taJsp);
		topLeft.add(checkPanel);
		Box top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);

		f.add(top);

		newItem.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK));
		newItem.addActionListener(e -> ta.append("the user clicks new item\n"));
		file.add(newItem);
		file.add(save);
		file.add(exit);

		edit.add(autoWrap);
		edit.addSeparator();
		edit.add(copyItem);
		edit.add(paste);

		commentItem.setToolTipText("annotation of the code!");
		format.add(commentItem);
		format.add(cancelItem);

		edit.add(new JMenuItem("-"));
		edit.add(format);
		mb.add(file);
		mb.add(edit);
		f.setJMenuBar(mb);
		f.pack();
		f.setVisible(true);


	}

	public static void main(String[] args){
		new SwingComponent().init();
	}
}