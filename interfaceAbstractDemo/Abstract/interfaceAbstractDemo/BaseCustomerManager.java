package interfaceAbstractDemo;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritaban�na kaydedildi : " + customer.firstName + " " +  customer.lastName);
	}

}
