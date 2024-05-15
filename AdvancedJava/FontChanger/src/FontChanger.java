import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class FontChanger extends JFrame implements ItemListener {
	private JCheckBox italicBox,boldBox;
	private JTextField txtfield1;
	private Font f;


	public FontChanger() {
		super("Font Changer");

		setLayout(new FlowLayout());

		boldBox = new JCheckBox("Bold");
		italicBox = new JCheckBox("Italic");

		txtfield1 = new JTextField(12);

		add(italicBox);
		add(boldBox);
		add(txtfield1);

		boldBox.addItemListener(this);
		italicBox.addItemListener(this);

		setSize(300, 100);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new FontChanger();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (boldBox.isSelected() && italicBox.isSelected()) {
			f = new Font("Verdana", Font.BOLD | Font.ITALIC, 12);
		}
		else if (boldBox.isSelected()) {
			f = new Font("Verdana", Font.BOLD, 12);
		} else if (italicBox.isSelected()) {
			f = new Font("Verdana", Font.ITALIC, 12);
		}   else {
			f = new Font("Verdana", Font.PLAIN, 12);
		}

		txtfield1.setFont(f);

	}
}
