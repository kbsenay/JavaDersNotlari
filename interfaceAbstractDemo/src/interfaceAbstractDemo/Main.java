package interfaceAbstractDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter()); //Ger�ek servis
		customerManager1.save(new Customer(1, "Kadir Bur�in", "�enay",LocalDate.of(1983, 7, 8), "11111111111"));
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter()); //Sahte servis
		customerManager2.save(new Customer(1, "Kadir Bur�in", "�enay",LocalDate.of(1983, 7, 8), "11111111111"));
		
	}

}
