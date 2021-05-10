package kodlamaioProject;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli eðitmen eklendi!");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + instructor.getLastName() + " isimli eðitmen silindi!");
	}
	
}
