package kodlamaioProject;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Kadir Burçin");
		user.setLastName("Þenay");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		
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
