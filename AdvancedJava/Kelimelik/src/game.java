import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class game extends JFrame implements KeyListener{
	private JButton buttons[];
	private JTextField textField;
	private JPanel btnPanel,mainPanel;
	private String[] sehir= {"trabzon","istanbul","tekirdağ","edirne","hatay","ordu","adana","ankara"};
	private Random rnd=new Random();
	private int resultIndex,score=100,quantity=0,trueScore=0;
	
	public game() {
		super("Kelimelik");
		
	
		resultIndex = rnd.nextInt(sehir.length);
		buttons=new JButton[sehir[resultIndex].length()];
		System.out.println("Result: "+sehir[resultIndex]);
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2,1));
		btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout());
		
		textField = new JTextField();
		textField.addKeyListener(this);
		add(mainPanel);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("");
			btnPanel.add(buttons[i]);
		}
		
		mainPanel.add(btnPanel);
		mainPanel.add(textField);

		setVisible(true);
		setSize(sehir[resultIndex].length()*100,100);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new game();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		boolean isWorse=false;
		quantity++;
		System.out.println("Deneme: "+quantity);
		for (int i = 0; i < buttons.length; i++) {
			
			if (sehir[resultIndex].charAt(i)==e.getKeyChar()) {
				buttons[i].setText(sehir[resultIndex].charAt(i)+"");
				isWorse=true;
				trueScore++;
			} 
		}
		if(!isWorse) {
			score-=10;
			System.out.println("Score: "+score);
		}
		
		if (trueScore==sehir[resultIndex].length()) {
			System.out.printf("Game Over\nYour score is: %d\nYour quantity is: %d",score,quantity);
			textField.setEnabled(false);
		} 
		if (score==0) {
			System.out.printf("Game Over\nYou lost");
			textField.setEnabled(false);
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {	}

	@Override
	public void keyReleased(KeyEvent e) {}
}
