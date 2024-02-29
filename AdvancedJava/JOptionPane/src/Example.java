import javax.swing.JFrame;

public class Example extends JFrame{

	public Example() {
		super("Our first GUI App");
		
		//setTitle("MyFrame");
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new Example();
	}
}
