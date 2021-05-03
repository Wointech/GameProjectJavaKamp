package gameProjectDemo;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		KPSPublicSoap mernisValidation = new KPSPublicSoapProxy();

		try {

			if (mernisValidation.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName(),
					player.getLastName(), player.getYearOfBirth())) {

				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}

}
