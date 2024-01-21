
public class Academian extends Person {
	private String Major;
	private String title;
	public Academian(String firstName, String lastName, String birtPlace, String major, String title, String university,
			String startDate) {
		super(firstName, lastName, birtPlace);
		setMajor(major);;
		setTitle(title);
		setUniversity(university);
		setStartDate(startDate);
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private String university;
	private String startDate;
	public String getAcademianMajor() {
		return Major;
	}
	public void setAcademianMajor(String academianMajor) {
		this.Major = academianMajor;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	

}
