import java.awt.*;
import java.awt.event.*;

public class SimpleMenu{
	private Frame f = new Frame("test");
	private MenuBar mb = new MenuBar();
	Menu file = new Menu("file");
	Menu edit = new Menu("edit");
	MenuItem newItem = new MenuItem("new");
	MenuItem saveItem = new MenuItem("save");

	MenuItem exitItem = new MenuItem("exit", new MenuShortcut(KeyEvent.VK_X));
	CheckboxMenuItem autowrap = new CheckboxMenuItem("autowrap");
	MenuItem copyItem = new MenuItem("copy");
	MenuItem pasteItem = new MenuItem("paste");
	Menu format = new Menu("format");

	MenuItem commentItem = new MenuItem("comment", 
		new MenuShortcut(KeyEvent.VK_SLASH, true));
	MenuItem cancelItem = new MenuItem("cancel");
	private TextArea ta = new TextArea(40, 40);
	public void init(){
		ActionListener menuListener = e -> {
			String cmd = e.getActionCommand();
			ta.append("click " + cmd + " now \n");
			if(cmd.equals("exit"))
				System.exit(0);
		};

		commentItem.addActionListener(menuListener);
		exitItem.addActionListener(menuListener);
		file.add(newItem);
		file.add(saveItem);
		file.add(exitItem);

		edit.add(autowrap);
		edit.addSeparator();
		edit.add(copyItem);
		edit.add(pasteItem);


		format.add(commentItem);
		format.add(cancelItem);

		edit.add(new MenuItem("-"));
		edit.add(format);

		mb.add(file);
		mb.add(edit);

		f.setMenuBar(mb);
		f.addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args){
		new SimpleMenu().init();
	}

}