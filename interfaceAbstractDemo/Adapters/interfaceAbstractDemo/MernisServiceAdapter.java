package interfaceAbstractDemo;

import java.rmi.RemoteException;




import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
