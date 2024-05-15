import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;


public class MultipleListFrame extends JFrame implements ListSelectionListener,ActionListener{

	private JList <String> colorList,copyList;
	private String[] colors= {"green","yellow","blue","red","black"};
	private JButton  btn;
	
	public MultipleListFrame()
	{
		setLayout(new FlowLayout());
		colorList=new JList<String>(colors);
		colorList.setVisibleRowCount(3);
		add(colorList);
		add(new JScrollPane(colorList));
		
		btn=new JButton("Copy-->");
		
		//bileşenlerin büyüklüklerinin ifade edildiği kod satırı
		btn.setPreferredSize(new Dimension(90, 50));
		//componentlere (panel,buton,vb.) kenar başlığını veren kod  
		TitledBorder btnBorder=BorderFactory.createTitledBorder("medine");
		btn.setBorder(btnBorder);
		add(btn);
		btn.addActionListener(this);
		btn.setToolTipText("naber");
		
		copyList=new JList<String>();
		TitledBorder listBorder=BorderFactory.createTitledBorder("copy listesi");
		copyList.setBorder(listBorder);
		copyList.setVisibleRowCount(3);
		copyList.setFixedCellHeight(15);
	    copyList.setFixedCellWidth(90);
		copyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(copyList);
		add(new JScrollPane(copyList));
		
		setTitle("testing with multiplelist");
		setVisible(true);
		setSize(300,280);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new MultipleListFrame();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		copyList.setListData(colorList.getSelectedValuesList().toArray(new String[0])); 
	}


}