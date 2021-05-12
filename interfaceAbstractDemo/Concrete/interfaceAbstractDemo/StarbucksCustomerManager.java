package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Kiþi bulunamadý");
		}
	}

	

	

}
