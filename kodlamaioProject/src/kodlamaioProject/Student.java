package kodlamaioProject;

public class Student extends User{
	
	private String courseName;
	private String homeWork;
	
	public Student() {
		
	}
	
	public Student(String courseName, String homeWork) {
		super();
		this.setCourseName(courseName);
		this.setHomeWork(homeWork);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getHomeWork() {
		return homeWork;
	}

	public void setHomeWork(String homeWork) {
		this.homeWork = homeWork;
	}
	
}
