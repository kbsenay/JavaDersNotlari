package kodlamaioProject;

public class Instructor extends User{
	private String title;
	private String givenCourses;
	private String biography;
	
	public Instructor() {
		
	}
	
	public Instructor(String title, String givenCourses, String biography) {
		super();
		this.setTitle(title);
		this.setGivenCourses(givenCourses);
		this.setBiography(biography);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	
}

