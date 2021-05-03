
public class Student extends User{

	
	private String education;

	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String password, String mail, String education) {
		super(id, firstName, lastName, password, mail);
		this.education = education;
	}
	
	public String getEducation() {
		return education;
			}
	public void setEducation(String education) {
		this.education=education;
		
	}
	
}
