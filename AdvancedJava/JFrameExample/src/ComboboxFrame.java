import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class ComboboxFrame extends JFrame implements ItemListener{
	private JLabel imageLabel;
	private JComboBox<String> combobox1;
	private String[] images = {"Seçiniz","pencil.circle@2x.png","lasso@2x.png","trash.fill@2x.png"};
	
	public ComboboxFrame() {
		super("ComboBox Frame");
		setLayout(new FlowLayout());
		
		imageLabel=new JLabel("Resim Seçin");
		combobox1=new JComboBox<String>(images);
		add(combobox1);
		add(imageLabel);
		combobox1.addItemListener(this);
		
		setVisible(true);
		setSize(300,300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new ComboboxFrame();
	}

	public void itemStateChanged(ItemEvent e) {
		try {
			imageLabel.setIcon(new ImageIcon(getClass().getResource(combobox1.getSelectedItem().toString())));
		} catch (NullPointerException excepts) {
			imageLabel.setIcon(null);
		}
	}
}
