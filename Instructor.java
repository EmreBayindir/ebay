
public class Instructor extends User {

	
	 private String branch;
	 
	 public Instructor() { 
		 
	 }
	
	public Instructor(int id, String firstName, String lastName, String password, String mail, String branch) {
		
		super(id,firstName,lastName,password,mail);
		this.branch= branch;
		
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}


	
}
