package gameProject;

import java.util.Locale;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(new Locale("tr")), 
					player.getLastName().toUpperCase(new Locale("tr")),player.getDateofBirth().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}

}
