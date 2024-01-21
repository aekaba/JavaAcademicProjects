
public class Thesis {
	private String thesisTitle;
	private Academian academian;
	public Thesis(String thesisTitle, Academian academian) {
		
		setAcademian(academian);
		setThesisTitle(thesisTitle);
	}
	public String getThesisTitle() {
		return thesisTitle;
	}
	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	public Academian getAcademian() {
		return academian;
	}
	public void setAcademian(Academian academian) {
		this.academian = academian;
	} 

}
