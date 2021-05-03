
public class UserManager {
	
	public  void add(User user) {
		System.out.println(user.getFirstName()+" Kaydedildi. ");
		
			}
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
		add(user);
		
		}
	
	
	}
	
	
	
	
}
