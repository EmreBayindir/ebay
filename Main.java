
public class Main {

	public static void main(String[] args) {

		Student student = new Student(1,"Emre","Bay","12345","asdf@hotmail,com","Java Course");
		Instructor instructor = new Instructor(1,"Engin","Demirog","54321","dsa@homail.com", "Java");
		System.out.println(student.getFirstName());
		System.out.println(instructor.getFirstName());

	
	Student student1 = new Student();
	
	student1.setId(2);
	student1.setFirstName("Ahmet");
	student1.setLastName("Yagli");
	student1.setPassword("11111");
	student1.setMail("ahmetyagli@hotmail.com");
	student1.setEducation("Java Course");
	
	Student student2 =new Student();
	
	student2.setId(3);
	student2.setFirstName("Ali");
	student2.setLastName("Yagsiz");
	student2.setPassword("22222");
	student2.setMail("aliyagsizi@hotmail.com");
	student2.setEducation("Java Course");
	
	System.out.println(student1.getFirstName()+"");
	
	Instructor instructor1 = new Instructor();
	
	instructor1.setId(2);
	instructor1.setFirstName("Hakan");
	instructor1.setLastName("Yak");
	instructor1.setPassword("55555");
	instructor1.setMail("hakanyaki@hotmail.com");
	instructor1.setBranch("Programlamaya Giris");
	
	System.out.println(instructor1.getFirstName());
	
	
	UserManager userManager = new UserManager();
	
	User[] users = {student, instructor, student1, student2, instructor1};
	
	userManager.addMultiple(users);
		}
		}
