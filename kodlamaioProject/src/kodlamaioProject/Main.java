package kodlamaioProject;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Kadir Bur�in");
		user.setLastName("�enay");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		
		User[] users = {user, instructor};
		
		UserManager userManager = new UserManager();
		//userManager.add(user);
		userManager.deleteMultiple(users);
		
		System.out.println("----------------------------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		System.out.println("----------------------------------------------------------");
		
		userManager.addMultiple(users);
		
		
	}
	

}
