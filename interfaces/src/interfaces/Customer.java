package interfaces;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lasName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lasName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasName() {
		return lastName;
	}

	public void setLasName(String lasName) {
		this.lastName = lasName;
	}
	
	

}
