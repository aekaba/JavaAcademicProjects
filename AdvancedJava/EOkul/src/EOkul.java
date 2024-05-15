import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.*;
import javax.swing.*;

public class EOkul extends JFrame implements ItemListener, ActionListener {
	public static Scanner input = new Scanner(System.in);
	private JRadioButton[] radioButtons;
	private JPanel optionsPanel, operationPanel, mainPanel;
	private ButtonGroup optionsGroup;
	private JLabel label1, label2, label3, label4, label5;
	private JTextField textfield1, textfield2, textfield3;
	private JButton button1, button2;
	private JList studentList;
	private JList<Lesson> lessonList;
	private JList<Note> noteList;
	private String[] optionsText = { "Yeni Ders", "Yeni Öğrenci", "Listele Ders", "Listele Öğrenci", "Ekle Not",
			"Listele Not" };

	public EOkul() {
		super("Öğrenci İşlemleri");
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(1, 2));
		
		optionsPanel = new JPanel();
		optionsPanel.setBorder(BorderFactory.createTitledBorder("Seçenekler"));
		optionsPanel.setLayout(new GridLayout(6, 1));
		operationPanel = new JPanel();
		add(mainPanel);
		radioButtons = new JRadioButton[optionsText.length];
		optionsGroup = new ButtonGroup();
		for (int i = 0; i < optionsText.length; i++) {
			radioButtons[i] = new JRadioButton(optionsText[i]);
			radioButtons[i].addItemListener(this);
			optionsGroup.add(radioButtons[i]);
			optionsPanel.add(radioButtons[i]);
		}
		mainPanel.add(optionsPanel);

		setSize(200, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void addLessonGUI() {
		mainPanel.remove(operationPanel);
		operationPanel.removeAll();
		operationPanel.setLayout(new GridLayout(4, 2));
		operationPanel.setBorder(BorderFactory.createTitledBorder("Ders Ekle"));
		setSize(200, 400);
		label1 = new JLabel("Ders Kod");
		label2 = new JLabel("Ders Adı");
		label3 = new JLabel();
		label4 = new JLabel();
		button1 = new JButton("Ders Kaydet");
		button2 = new JButton("Temizle");
		button1.addActionListener(this);
		button2.addActionListener(this);
		textfield1 = new JTextField(10);
		textfield2 = new JTextField(10);
		operationPanel.add(label1);
		operationPanel.add(textfield1);
		operationPanel.add(label2);
		operationPanel.add(textfield2);
		operationPanel.add(label3);
		operationPanel.add(button1);
		operationPanel.add(label4);
		operationPanel.add(button2);
		mainPanel.add(operationPanel);
		pack();

	}

	public void addNoteGUI() {
		mainPanel.remove(operationPanel);
		operationPanel.removeAll();
		operationPanel.setLayout(new GridLayout(5, 2));
		operationPanel.setBorder(BorderFactory.createTitledBorder("Not Ekle"));
		setSize(200, 400);
		label1 = new JLabel("Öğrenci No");
		label2 = new JLabel("Ders No");
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel("Notu");
		button1 = new JButton("Notu Kaydet");
		button2 = new JButton("Temizle");
		button1.addActionListener(this);
		button2.addActionListener(this);
		textfield1 = new JTextField(10);
		textfield2 = new JTextField(10);
		textfield3 = new JTextField(10);
		operationPanel.add(label1);
		operationPanel.add(textfield1);
		operationPanel.add(label2);
		operationPanel.add(textfield2);
		operationPanel.add(label5);
		operationPanel.add(textfield3);
		operationPanel.add(label3);
		operationPanel.add(button1);
		operationPanel.add(label4);
		operationPanel.add(button2);
		mainPanel.add(operationPanel);
		pack();
	}

	public void addStudentGUI() {
		mainPanel.remove(operationPanel);
		operationPanel.removeAll();
		operationPanel.setLayout(new GridLayout(4, 2));
		operationPanel.setBorder(BorderFactory.createTitledBorder("Öğrenci Ekle"));
		setSize(200, 400);
		label1 = new JLabel("Öğrenci No");
		label2 = new JLabel("Öğrenci Adı");
		label3 = new JLabel();
		label4 = new JLabel();
		button1 = new JButton("Öğrenci Kaydet");
		button2 = new JButton("Temizle");
		button1.addActionListener(this);
		button2.addActionListener(this);
		textfield1 = new JTextField(10);
		textfield2 = new JTextField(10);
		operationPanel.add(label1);
		operationPanel.add(textfield1);
		operationPanel.add(label2);
		operationPanel.add(textfield2);
		operationPanel.add(label3);
		operationPanel.add(button1);
		operationPanel.add(label4);
		operationPanel.add(button2);
		mainPanel.add(operationPanel);
		pack();
	}
	public void listStudentGUI() {
		mainPanel.remove(operationPanel);
		operationPanel.removeAll();
		operationPanel.setLayout(new FlowLayout());
		operationPanel.setBorder(BorderFactory.createTitledBorder("Listele Öğrenci"));
		setSize(200, 400);
		List<Student> data = Student.listStudent();
		studentList = new JList<Student>();
		
		studentList.setListData(Student.listStudent().toArray());
		operationPanel.add(studentList);
		mainPanel.add(operationPanel);
		pack();
	}

	public static void main(String[] args) {
		while (true) {
			String response = JOptionPane.showInputDialog("Console:0, GUI:1");
			if (response.equals("0")) {
				runConsole();
				break;
			} else if (response.equals("1")) {
				new EOkul();
				break;
			}
		}
	}

	public static void myConsoleMessage() {
		System.out.println("-------------------------------------");
		System.out.println("Öğrenci Ekle:1, Öğrenci Listele:2, Ders Ekle:3, Ders Listele:4, Not Ekle:5, Not Listele:6");
		System.out.println("Çıkış:0");
	}

	public static void runConsole() {
		boolean isRunning = true;
		while (isRunning) {
			myConsoleMessage();
			String response = input.next();

			switch (response) {
			case "1": {
				addStudent();
				break;
			}
			case "2": {
				listStudent();
				break;
			}
			case "3": {
				addLesson();
				break;
			}
			case "4": {
				listLesson();
				break;
			}
			case "5": {
				addNote();
				break;
			}
			case "6": {
				listNote();
				break;
			}
			case "0": {
				isRunning = false;
				System.out.println("Uygulama kapanıyor");
				System.out.println("-------------------------------------");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + response);
			}
		}
	}

	private static void listNote() {
		System.out.print("Öğrenci No? ");
		Student myStudent = Student.anyStudent(input.next());

		if (myStudent != null) {
			System.out.println("-------------------------------------");
			System.out.println(myStudent.getStudentNo() + "\t" + myStudent.getStudentName());
			System.out.println("-------------------------------------");
			List<Note> notes = Note.listNote(myStudent.getStudentNo());
			if (!notes.isEmpty()) {
				for (Note note : notes) {
					System.out.println(note.getLessonNo() + "\t" + note.getNote());
				}

			} else {
				System.out.println("Kayıtlı not bulunamadı");
			}
		} else {
			System.out.println("Öğrenci Bulunamadı...");
		}

	}

	private static void addNote() {
		System.out.print("Öğrenci No? ");
		Student myStudent = Student.anyStudent(input.next());

		if (myStudent == null) {
			System.out.println("Öğrenci Bulunamadı...");
			return;
		}

		System.out.print("Ders No? ");
		Lesson myLesson = Lesson.anyLesson(input.next());

		if (myLesson == null) {
			System.out.println("Ders Bulunamadı...");
			return;
		}

		System.out.print("Not? ");
		int note = input.nextInt();

		boolean isSaved = Note.saveNote(new Note(myLesson.getLessonNo(), myStudent.getStudentNo(), note));

		if (isSaved)
			System.out.println("Not ekleme işlemi başarılı bir şekilde gerçekleşti");
		else
			System.out.println("Not ekleme işlemi gerçekleşrilirken bir hata ile karşılaşıldı.");
	}

	private static void listLesson() {
		List<Lesson> lessonData = Lesson.listLesson();
		if (lessonData.isEmpty()) {
			System.out.println("Hiçbir Ders kayıtlı değil");
		} else {
			System.out.println("Ders No\tDers Adı");
			for (Lesson lesson : lessonData) {
				System.out.println("-------------------------------------");
				System.out.println(lesson.getLessonNo() + "\t" + lesson.getLessonName());
			}
			System.out.println("-------------------------------------");

		}
	}

	private static void addLesson() {
		System.out.print("Ders No: ");
		String lessonNo = input.next();
		System.out.print("Ders Adı: ");
		String lessonName = input.next();

		boolean response = Lesson.saveLesson(lessonNo, lessonName);

		if (response)
			System.out.println("Ders başarılı bir şekilde kayıt edildi");
		else
			System.out.println("Ders kayıt edilirken bir hata oldu");
	}

	private static void listStudent() {
		List<Student> studentData = Student.listStudent();
		if (studentData.isEmpty()) {
			System.out.println("Hiçbir öğrenci kayıtlı değil");
		} else {
			System.out.println("Öğrenci No\tÖğrenci Adı");
			for (Student student : studentData) {
				System.out.println("-------------------------------------");
				System.out.println(student.getStudentNo() + "\t" + student.getStudentName());
			}
			System.out.println("-------------------------------------");

		}
	}

	private static void addStudent() {
		System.out.print("Öğrenci No: ");
		String studentNo = input.next();
		System.out.print("Öğrenci Adı: ");
		String studentName = input.next();

		boolean response = Student.saveStudent(studentNo, studentName);

		if (response)
			System.out.println("Öğrenci başarılı bir şekilde kayıt edildi");
		else
			System.out.println("Öğrenci kayıt edilirken bir hata oldu");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if (radioButtons[0].isSelected()) {
			addLessonGUI();
		} else if (radioButtons[1].isSelected()) {
			addStudentGUI();
		}  else if (radioButtons[3].isSelected()) {
			listStudentGUI();
		}else if (radioButtons[4].isSelected()) {
			addNoteGUI();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Ders Kaydet") {
			String lessonNo = textfield1.getText();
			String lessonName = textfield2.getText();

			boolean response = Lesson.saveLesson(lessonNo, lessonName);

			if (response)
				JOptionPane.showConfirmDialog(null, "Ders Başarılı bir şekilde kayıt edildi");
			else
				JOptionPane.showConfirmDialog(null, "Ders kayıt edilirken bir hata oldu");

		} 
		
		else if (e.getActionCommand() == "Öğrenci Kaydet") {

			String studentNo = textfield1.getText();

			String studentName = textfield2.getText();

			boolean response = Student.saveStudent(studentNo, studentName);
			if (response)
				JOptionPane.showConfirmDialog(null, "Öğrenci başarılı bir şekilde kayıt edildi");
			else
				JOptionPane.showConfirmDialog(null, "Öğrenci kayıt edilirken bir hata oldu");
		} 
		
		else if (e.getActionCommand() == "Notu Kaydet") {

			Student myStudent = Student.anyStudent(textfield1.getText());

			if (myStudent == null) {
				JOptionPane.showConfirmDialog(null, "Öğrenci bulunamadı!");
				return;
			}

			Lesson myLesson = Lesson.anyLesson(textfield2.getText());

			if (myLesson == null) {
				JOptionPane.showConfirmDialog(null, "Ders bulunamadı!");
				return;
			}

			int note = Integer.parseInt(textfield3.getText());

			boolean isSaved = Note.saveNote(new Note(myLesson.getLessonNo(), myStudent.getStudentNo(), note));
			if (isSaved)
				JOptionPane.showConfirmDialog(null, "Not başarılı bir şekilde kayıt edildi");
			else
				JOptionPane.showConfirmDialog(null, "Not kayıt edilirken bir hata oldu");
		} else if (e.getActionCommand() == "Temizle") {

			textfield1.setText("");
			textfield2.setText("");
			textfield3.setText("");

		}

	}
}
