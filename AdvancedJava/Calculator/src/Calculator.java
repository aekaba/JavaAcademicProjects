import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	private JButton[] buttons;
	private JTextField myTextField;
	private JPanel mainPanel, gridPanel;
	private String[] buttonName = { "%", "Sin", "C", "Geri Al", "1/x", "x^2", "Kare Kök", "/", "7", "8", "9", "*", "4",
			"5", "6", "-", "1", "2", "3", "+", "+/-", "0", ",", "=" };
	private Font f = new Font("Verdana", Font.BOLD, 64);
	private ArrayList<String> islemArray = new ArrayList<String>();
	private ArrayList<String> sayiArray = new ArrayList<String>();
	private int result = 0;

	public Calculator() {
		super("Hesap makinesi");

		mainPanel = new JPanel();
		gridPanel = new JPanel();

		mainPanel.setLayout(new GridLayout(2, 1));
		gridPanel.setLayout(new GridLayout(6, 4));

		myTextField = new JTextField("" + result);
		myTextField.setEnabled(false);
		myTextField.setHorizontalAlignment(JTextField.RIGHT);
		myTextField.setFont(f);

		add(mainPanel);

		mainPanel.add(myTextField);

		buttons = new JButton[24];

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(buttonName[i]);
			gridPanel.add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		mainPanel.add(gridPanel);

		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void showLastArray() {

		if (sayiArray.isEmpty()) {
			myTextField.setText("0");
		} else {
			String myNum = "";
			for (String item : sayiArray) {
				myNum += item;
			}
			myTextField.setText(myNum);
		}
	}

	public void addNumİslem() {
		String myNum = "";
		for (String item : sayiArray) {
			myNum += item;
		}
		islemArray.add(myNum);
		sayiArray.clear();
		showLastArray();
	}

	public boolean isZero() {
		if (sayiArray.get(0).equals("0")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		new Calculator();
	}

	public void calculate() {
		int num = 0;

		if (islemArray.get(1).equals("+")) {
			num = Integer.parseInt(islemArray.get(0)) + Integer.parseInt(islemArray.get(2));
		} else if (islemArray.get(1).equals("-")) {
			num = Integer.parseInt(islemArray.get(0)) - Integer.parseInt(islemArray.get(2));
		} else if (islemArray.get(1).equals("*")) {
			num = Integer.parseInt(islemArray.get(0)) * Integer.parseInt(islemArray.get(2));
		} else if (islemArray.get(1).equals("/")) {
			num = Integer.parseInt(islemArray.get(0)) / Integer.parseInt(islemArray.get(2));
		}

		islemArray.clear();
		sayiArray.clear();
		myTextField.setText("" + num);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "C":
			islemArray.clear();
			sayiArray.clear();

			showLastArray();
			break;
		case "1":
			sayiArray.add("1");
			showLastArray();
			break;
		case "2":
			sayiArray.add("2");
			showLastArray();
			break;
		case "3":
			sayiArray.add("3");
			showLastArray();
			break;
		case "4":
			sayiArray.add("4");
			showLastArray();
			break;
		case "5":
			sayiArray.add("5");
			showLastArray();
			break;
		case "6":
			sayiArray.add("6");
			showLastArray();
			break;
		case "7":
			sayiArray.add("7");
			showLastArray();
			break;
		case "8":
			sayiArray.add("8");
			showLastArray();
			break;
		case "9":
			sayiArray.add("9");
			showLastArray();
			break;
		case "0":
			if (!isZero()) {
				sayiArray.add("0");
				showLastArray();
			}
			break;
		case "+":
			addNumİslem();
			islemArray.add("+");
			break;
		case "-":
			addNumİslem();
			islemArray.add("-");
			break;
		case "*":
			addNumİslem();
			islemArray.add("*");
			break;
		case "/":
			addNumİslem();
			islemArray.add("/");
			break;
		case "=":
			addNumİslem();
			islemArray.add("=");
			calculate();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + e);
		}

	}
}
