package kodlamaioProject;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " isimli öðrenci eklendi!");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " isimli öðrenci silindi!");
	}

}
