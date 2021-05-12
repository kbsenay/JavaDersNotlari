package interfaceAbstractDemo;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return false;
		
	}

}
